<hr>
Lab 1
<br>
<hr>

Date : 9th December, 2021 - 16th December, 2021

<hr>
<br>
<hr>

Qn 1)
Types of costructor in java are:
i) Default Constructor
If no constructor is defined inside a class, Java compiler inserts a default constructor into the code which is known as default constructor.
Default constructor is used to provide the default values to the object properties like 0, null, etc., depending on their type.

ii) Non-Parameterized / No argument Constructor
The constructor method without any parameters is known as non-parameterized or no argument constructor.

iii) Parameterized Constructor
The constructor method with some parameters is known as parameterized constructor.

Java doesnot support copy constructors like other programming languages but contents of one object can be copied into another by passing object as argument.

<hr>
<br>
<hr>

Qn 2)
Stack is a memory usage mechanism used to store temporary data. It behaves as a first-in last-out buffer.
To implement it using array, we need an identifier that indicates where the current stack memory location is. And we need methods like push, pop to store data into stack and delete data from stack.

<hr>
<br>
<hr>

Qn 3)
An abstract class is a class that is labeled with the keyword abstract. Abstract classes cannot be instantiated, but they can be extended. Abstract classes are usually used to achieve data hiding.
-> Abstract method is the method with declaration but no definition.
-> During inheritance, abstract methods must be overridden.
-> Abstract class can contain abstract methods.

<hr>
<br>
<hr>

Qn 4) 
In java, extending a child class from two or more parent classes is not supported due to ambiguity. But multiple inheritance can be acheived by using interface.
We don't need to use the keyword 'abstract' to declare an abstract method inside a interface beacause methods of interface are <b>public</b> and <b>abstract</b> by default.
Interfaces don't have constructors like classes.

<hr>
<br>
<hr>

Qn 5)
Command Line Arguments are the data passed to the main function from command line just before the runtime of program.
The parameter of main function (i.e. a String array) stores the command line arguments.
We can pass number of arguments by separating them with a 'space'.

<hr>
<br>
<hr>

Qn 6)
this - 'this' pointer refers to the current object.
super - 'super' keyword is used to call the constructor of the parent class.
final - 'final' keyword is used to declare final variable (constants).

<hr>
<br>
<hr>

Qn 7)
Default method:
Before Java 8, interfaces could have only abstract methods.
The implementation of these methods has to be provided in a separate class. So, if a new method is to be added in an interface, then its implementation code has to be provided in the class implementing the same interface.
To overcome this issue, Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation without affecting the classes that implement the interface.

<hr>
<br>
<hr>

Qn 8)
Static methods are the methods that are associated with the class not to the objects.
They can be called without creating an instance.

Static variables / class variables are the variables that are created only once and is shared by all the objects.
<br>
<hr>