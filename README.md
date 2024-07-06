# Task Tracker API: A Full Stack Project

Welcome to the Task Tracker API. It is based on RESTful API using Java, PostgreSQL, spring Boot as backened and Html, CSS, React.js as frontend


## Programming Language used

Java framework Spring Boot and for Database used is PostgreSQL.
for frontend to display the task is React.js.

## Frontend used
The project utilizes the React library for developing web and native user interfaces. Axios is employed on the frontend for making HTTP requests, while CORS configuration in Spring Boot facilitates seamless integration between the frontend and backend components.
## Configure PostgreSQL

   1) Create a database in your PostgreSQL instance.
   2) Update the application.properties file in the src/main/resources folder with the URL, username and password for your PostgreSQL instance. The table schema for the Task Traker  will be created for you in the database.
      
## Build and run the sample

    1. mvnw package
    2. Open a web browser to http://localhost:3000 (Frontend integration).
    3. And on http://localhost:8309 (backend integration).

As you add and update tasks in the app you can verify the changes in the database through the PostgreSQL console. 
## Task Properties
Each task has the following properties:

1. id (String): Unique identifier for the task.
2. title (String): Title of the task.
3. description (String): Description of the task.
4. dueDate (Date): Due date of the task.

.Implemented the following endpoints:

1. POST /tasks: Create a new task.
2. GET /tasks/{id}: Retrieve a task by its ID.
3. GET /tasks: Retrieve a list of all tasks.
4. PUT /tasks/{id}: Update an existing task by its ID.
5. DELETE /tasks/{id}: Delete a task by its ID
## 🔗 Links

## Features

- Task Tracker will add the  task
- Task Tracker will update the task
- Task Tracker will delete the task
- If task is completed toggle on complete button it will show complition status
- Task Tracker will assigne the due date of task
- It also handle the error


