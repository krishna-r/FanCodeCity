# FanCode City Test Project
**Project Structure
bash
Copy code
.
├── pom.xml  <br />
└── src  <br />
   &emsp; └── test  <br />
      &emsp;&emsp;  └── java  <br />
          &emsp;&emsp;&emsp;  └── org  <br />
            &emsp;&emsp;&emsp;&emsp;    └── example  <br />
              &emsp;&emsp;&emsp;&emsp;&emsp;      └── FanCodeCityTest.java  <br />  <br /> <br />
# Setup and Run the Maven Project <br />
## Prerequisites <br />
&nbsp; 1.Java Development Kit (JDK) 8 or later  <br />
&nbsp; 2.Maven <br />
&nbsp; 3.Internet connection to access JSONPlaceholder API <br />
 <br />
## Steps <br />

### Setup the project <br />
&nbsp; 1 .Clone the repository <br />
&nbsp; &nbsp; git clone https://github.com/krishna-r/FanCodeCity.git <br />
&nbsp; 2 .Navigate to project directory <br />
&nbsp; &nbsp; cd repository-directory <br />
&nbsp; 3 Download dependencies given in pom.xml <br />
&nbsp; &nbsp; mvn clean install <br />

### Run the project <br />
## To run the project, open terminal/command prompt and run the below command (ensure you are in the project folder) <br />
&nbsp; mvn clean test <br />

# Console Output <br />

### User details for user staying in FanCode City <br />

### Serial number : 1 <br />

### userName : Leanne Graham | userId: 1 | taskCompletionPercentage : 55.00000000000001 <br />

### Serial number : 2 <br />

### userName : Chelsey Dietrich | userId: 5 | taskCompletionPercentage : 60.0 <br />

### Serial number : 3 <br />

### userName : Clementina DuBuque | userId: 10 | taskCompletionPercentage : 60.0 <br />

### Total number of users staying in FanCodeCity, who has Completed task percentage should be greater than 50% : 3 <br />

Note : html test report shall be available at path \<project-dir\>\target\surefire-reports\index.html
