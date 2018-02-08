# JerseyRestAPIExample

Simple Java REST API example implementing Jersey with maven build management tool.



To get started simply clone or download the project.

Import it to your favourite IDE like eclipse, netbeans, intellije etc. as a maven project.

Update the maven project.

Set up the server e.g. Apache Tomcat in IDE and run the application on server.

The url for GET method is http://localhost:8081/simple-jersey-restapi-app/ankit/user/getUsers

The url for POST method is http://localhost:8081/simple-jersey-restapi-app/ankit/user/addUser
and JSON body for POST method is

	{
        "firstName": "Ankit",
        "lastName": "Maurya",
        "emailID": "ankitmaurya70@gmail.com",
        "mobile": 9532970069
    }
	
Change the data according to your requirement.
Use PostMan application for API testing.


To create a project like this from scratch follow the steps below:

1. Install maven on your system(It will be a poratable zip directory,
   so extract it anywhere on your system and add its bin directory to systems path).

2. run mvn --version in cmd/terminal to check if the path is set correctly.
   For any query visit https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html .

3. Create a folder where you would like to create(keep) this new project.

4. Open cmd/terminal in the newly created folder(navigate to the newly created folder in cmd/terminal).

5. run "mvn archetype:generate -DgroupId=com.ankitmaurya.app -DartifactId=my-first-rest-app -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false"
   without quotes on cmd/terminal.
   
6. A new project will be created in the same directory with a pom.xml and web.xml in it.

7. Import the maven project in IDE.

8. Edit the pom.xml file and add all the dependencies for jersey as in this project(look into pom.xml comments give more info).

9. Edit web.xml remove the welcome page and add the servlet name and servlet mapping tag as in the web.xml of this project
   (look into web.xml comments give more info).

10. Create the controller and Model class as in this project.
    (look into the Controller class comments tell which and why is an annotation is used)

11. Set up a server(e.g. Apache Tomcat)

12. Run the application on this new server.

13. Form the API's starting from localhost then app-name then convetion from web.xml for servletContainer, then path for class, then path for method.
    somewhat like "localhost:8080\app-name(war/jar-name)\servletContainer(url-mapping)\class(@Path)\method(@Path)"
	
14. If everything understood and implemented properly application should run for all your API's.




Comment or contact at ankitmaurya70@gmail.com for any query.
