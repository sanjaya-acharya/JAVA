# Date *25th Jan - 26th Jan*

## JDBC
The Java Database Connectivity (JDBC) API is the industry standard for database-independent connectivity between the Java programming language and a wide range of databases SQL databases and other tabular data sources, such as spreadsheets or flat files. 

### Connection
* A connection with a specific database. SQL statements are executed and results are returned within the context of a connection. 

### DriverManager
* It is the basic service for managing a set of JDBC drivers.
* `DriverManager.getConnection(url)` - Attempts to establish a connection to the given database URL.The DriverManager attempts to select an appropriate driver from the set of registered JDBC drivers.

### Statement
The object used for executing a static SQL statement and returning the results it produces. 

## MYSQL

| Task | Syntax |
| :--: | :----: |
| Create a Database | CREATE DATABASE database_name; |
| Select Database | USE database_name; |
| Create Table | CREATE TABLE students (column datatype,column2 datatype,<br/>column3 datatype,column4 datatype,column5 datatype); |
| Create Record | INSERT INTO students ( \`column1\`, \`column2\`, \`column3\`, \`column4\` )<br/>VALUES ('value1','value2','value3','value4'); |
| Read Data | SELECT * FROM table_name; |
| Update Table | UPDATE table_name SET column = 'value' where column='value'; |
| Delete Data | DELETE FROM table_name WHERE column = 'value';|