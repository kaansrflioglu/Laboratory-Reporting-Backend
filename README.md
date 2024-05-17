# Laboratory Reporting Backend

### The following tools were used in the construction of this project.
 - Java  
 - Spring
 - MySQL 
 - JPA  
 - Maven   

### About the app
In this project, the back-end of a laboratory reporting application was developed using Spring Boot, JPA, and Maven technologies. The application facilitates the management and processing of laboratory reports.

**Report Description**: Each report includes the file number, the patient's name and surname, the patient's identification number (TC), diagnosis title, diagnosis details, the date the report was given, the information of the technician who gave the report, and hospital information. 

**Lab Technician and Report Relationship**: Each report is defined by only one lab technician. A lab technician can define multiple reports. Lab technician information includes first name, last name, and hospital identification number.

**Search and Sorting Features**: The application has the ability to search with patient's first/last name, patient's identification number, and lab technician's first/last name. Also, it has the feature to sort the reports by their dates.

**Report Update**: The ability to make changes on an existing report is provided.

**Report Details**: The details of all existing reports can be reviewed.

**Report Deletion**: An existing report can be deleted.

This application enables effective management and processing of laboratory reports. With the ease of use and rapid development features offered by Spring Boot, the simplification of data access and transactions by JPA, and the power of Maven in project management and dependency management, this application accelerates laboratory operations and increases efficiency. This application reduces the workload of laboratory staff and enables patients to receive their reports more quickly and effectively.

**NOTE: Since the backend is coded based on Türkiye, it will automatically add 81 provinces in Turkey to the "cities" table in the bootstrap section.**

# How to use via cmd?
#### Compiling a Project with Maven
Go to the project directory:  
`cd /path/to/your/labreportingapp`  
  
Compile the project with Maven and create a JAR file:  
`mvn clean package`  

#### Running the JAR File
Go to target folder:  
`cd target`  
  
Run the JAR file:  
`java -jar labreportingapp-0.0.1-SNAPSHOT.jar`  

#### Checking Requirements
Java: Java must be installed on your system to run the JAR file. To check if Java is installed:  
`java -version`
