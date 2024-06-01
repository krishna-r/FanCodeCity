package org.example;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static io.restassured.RestAssured.get;
import static org.testng.Assert.assertTrue;

public class FanCodeCityTest {
    Response usersResponse;
    Response todosResponse ;
    List<Map<String, Object>> todos=new ArrayList<>();
    List<Map<String, Object>> users=new ArrayList<>();
    @Test
    public void getUserDetailsAndToDoList() {
        // Step 1: Fetch the users data
        usersResponse = get("https://jsonplaceholder.typicode.com/users");
        users = usersResponse.jsonPath().getList("");

        // Step 2: Fetch the todos data
        todosResponse = get("https://jsonplaceholder.typicode.com/todos");
         todos = todosResponse.jsonPath().getList("");
    }

    @Test
    public void testUsersCompletionPercentage(){
        // Step 3: Filter users based on their geographic coordinates to identify if they belong to FanCode city
        List<Map<String, Object>> fanCodeUsers = users.stream()
                .filter(user -> {
                    Map<String, String> geo = (Map<String, String>) ((Map<String, Object>) user.get("address")).get("geo");
                    double lat = Double.parseDouble(geo.get("lat"));
                    double lng = Double.parseDouble(geo.get("lng"));
                    return lat > -40 && lat < 5 && lng > 5 && lng < 100;
                })
                .collect(Collectors.toList());

        // Step 4: Calculate the completion percentage of todos for each user
        int userCount=0;
        for (Map<String, Object> user : fanCodeUsers) {
            int userId = (Integer) user.get("id");
            String userName=(String)user.get("name");
            List<Map<String, Object>> userTodos = todos.stream()
                    .filter(todo -> todo.get("userId").equals(userId))
                    .collect(Collectors.toList());

            long completedCount = userTodos.stream()
                    .filter(todo -> (Boolean) todo.get("completed"))
                    .count();
            double completionPercentage = (double) completedCount / userTodos.size() * 100;

            userCount++;

            if(userCount==1) {
                System.out.println("User details for user staying in FanCode City");
            }
            System.out.println("Serial number : "+userCount);
            System.out.println("userName : "+userName+" | userId: "+ userId+ " | taskCompletionPercentage : "+completionPercentage);
            // Step 5: Verify that the completion percentage is greater than 50%
            assertTrue(completionPercentage > 50, "User " + userId + " has completion percentage " + completionPercentage + "% which is not greater than 50%");

        }
        System.out.println("Total number of users staying in FanCodeCity, who has Completed task percentage should be greater than 50% : "+userCount);
    }
}
