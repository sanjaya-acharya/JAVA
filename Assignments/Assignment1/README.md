Assignment 1
Assignment Date : 27th November, 2021
Deadline : 30th November, 2021


Reflection in Java

-It is a process which helps to manipulate classes and also everything in class.
-It can slow down a program because java virtual machine (JVM) cannot optimize the code.
-It cannot be used with applets.

Reflection in Java is used mainly in test tools, debuggers, Integrated Development Environment(IDEs).

Similarly, The classes required for reflection in java are present in the java.lang.reflect package.

Java.lang.class class
-The class performs two important tasks:
-It provides methid to get the metadata if a class at runtime.
-It provides methods to examine and change the behaviour of the class at run time.

There are three ways to get object of Class class-
a) forName() method of Class class.
b) getClass() method of Object class.
c) the.class syantax

a) forName() method of Class class-
The forName() method loads the class dynamically or at runtime.We should use it only if we know the fully qualified name of the class.
Example :
class Demo {}
class Test {
  public static void main(String args[]) {
    try {
      Class c = Class.forName("Demo");
      System.out.println(c.getName());
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }
}

b) getClass() method of Object class-
The getClass() method belongs to the Object class and it returns the instance of Class class. We should use it when we know the type.
Example :
class Demo {}
class Test {
  void printName(Object obj) {
    Class c = obj.getClass();
    System.out.println(c.getName());
  }
  public static void main(String args[]) {
    Demo obj = new Demo();
    Test t = new Test();
    t.printName(obj);
  }
}
c) the.class syantax-
Sometimes, there is a situation when a type is available but there is no instance of the class. In such cases, we can obtain the Class by appending the .class syntax to the name of the type.
Example :
class Demo {
  public static void main(String args[]) {
    Class c1 = boolean.class;
    System.out.println(c1.getName());
    Class c2 = Demo.class;
    System.out.println(c2.getName());
  }
}

Advantages of using Java Reflection
a) Java Reflection allows an application to use user-defined and external classes by creating instances of extensible objects using their fully-qualified names.
b) Debuggers make use of the property of reflection to detect the private members of a class. 

Disadvantages of using Java Reflection
a) The performance of operations of Reflection is slower than the non-reflective operations.
b) Reflective code violates the concept of abstraction and therefore there may be a change in the behavior with upgrades of the platform.