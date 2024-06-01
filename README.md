**Project Structure**
.
├── pom.xml
└── src
    └── test
        └── java
            └── org
                └── example
                    └── FanCodeCityTest.java
                    
**Setup and Run the Maven Project

**Prerequisites
Java Development Kit (JDK) 8 or later
Maven
Internet connection to access JSONPlaceholder API

Steps
1. Clone the repository
   git clone https://github.com/krishna-r/FanCodeCity.git)
   cd <repository-directory>
   
2. Download dependencies given in pom.xml
     mvn clean install
3. To run project open terminal / command prompt and run below command (this steps depends on  cd <repository-directory> i.e while executing maven command user should first navigate to project folder)
   mvn clean test

Console output
User details for user staying in FanCode City
Serial number : 1
userName : Leanne Graham userId: 1 | completionPercentage : 55.00000000000001
Serial number : 2
userName : Chelsey Dietrich userId: 5 | completionPercentage : 60.0
Serial number : 3
userName : Clementina DuBuque userId: 10 | completionPercentage : 60.0
Total number of users staying in FanCodeCity are who has Completed task percentage should be greater than 50% : 3







