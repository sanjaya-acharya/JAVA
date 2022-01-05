# Due Date : 00/01/2022
# Package in Java
Package in java is the collection of classes, interfaces and sub-packages. Packages offers facilities like reuseability, controlled access, data encryption, and so on.
## Types of Package
* Built-in / Pre-defined Package :
  * They are the packages which are already defined within the Java libraries.<br>Example: java.lang, java.util, java.math, etc.
* User-defined Package :
  * They are the package which are defined manually by the Java users.

**Syntax to define a java package**
``` java
package package_name;
```

**Syntax to import a java package**
``` java
import package_name;
```

### Static import
Static import allows to use all the static methods without using the class name.
``` java
import static package_name;

class Main {
	public static void main (String[] args) {
		myStaticFunction();
		// Here we don't need to write "className.myStaticFunction()"
		// static import allows us to use it without className.  
	}
}
```

## Access modifiers
The table below gives elaborates which type access is possible and which is not when using packages in Java
|   | private | protected | default | public |
|:-:|:-------:|:---------:|:------:|:------:|
| **same class** | ✓ | ✓ | ✓ | ✓ |
| **same package<br>subclasses** | ╳ | ✓ | ✓ | ✓ |
| **same package<br>non-subclasses** | ╳ | ✓ | ✓ | ✓ |
| **different packages<br>subclasses** | ╳ | ╳ | ✓ | ✓ |
| **different packages<br>non-subclasses** | ╳ | ╳ | ╳ | ✓ |

---
---

# Exception in Java
Exception is the unexpected event that disrupts the normal flow of the program during its execution.
If exception occurs inside a method, a Exception object is created with name and description of the exception, and current state of the program where exception has occurred. Which can be handled manually by using **try** ... **catch** or automatically using **throws** keywords. 

## Types of Exception
* **Built-in Exception**
   * Built-in exceptions are the exceptions which are already defined in java libraries. They can be catagorised as :
     * **Checked Exception**
            A checked exception is a type of exception that are checked at compile time. If a code throws a checked exception, then the compiler cannot compile it so it is compulsory to catch or declare checked exceptions.
           Example: **FileNotFoundException**, **IOException**, etc.
     * **Unchecked Exception**
            An unchecked exception is a type of exception that are checked at run time. Unchecked exceptions does not generate compilation errors.
           Example: **ArithmeticException**, **ArrayIndexOutOfBoundsException**, etc.
*  **User-defined Exception**
   * User-defined exceptions are the exceptions defined by programmers. **throw** keyword is used to throw a user-defined exception.
Example: **`throw new MyException(message);`**

# Exception handling
## try
**try** block contains a set of statements where an exception can occur. A try block must be followed by a catch or a finally block.

**Syntax**
```Java
try {
	statement(s);
}
```

**Example**
```Java
try {
	System.out.println(5/0);
	// ArithmeticException ( / by 0 ) occurs here.
}
```

## catch
**catch** block is used to handle the uncertain condition of try block. A catch block must always follow a try block.
**Syntax**
```Java
catch (ExceptionClass Object) {
	statement(s);
}
```
**Example**
```Java
catch (Exception e) {
	System.out.println(e.getMessage());
}
```

## finally
**finally** block is a set of statements that executes whether exception arise or not and whether the exception is handled or not. It is used to put important codes such as clean up code e.g. closing the file or closing the connection. A finally block must always follow a try block.
**Syntax**
```Java
finally {
	statement(s);
}
```
**Example**
```Java
finally {
	System.out.println("It executes whether exception arise or not");
	System.out.println("It executes whether exception is handled or not");
}
```

## throw
**throw** is a keyword used to create an exception object manually without any operation. It is used to create user-defined exceptions.
**Syntax**
```Java
throw new ExceptionName;
}
```
**Example**
```Java
throw new InvalidInput; // where InvalidInput is a user-defined exception class.
}
```

## throws
**throws** is a keyword that is used at method declaration after the parameters to declare that exception can occur inside that method.
**Syntax**
```Java
return_type methodName() throws ExceptionName {
	statement(s);
}

```
**Example**
```Java
void divide(int a, int b) throws ArithmeticException { // throws declared that exception can occur
	System.out.println(a / b); // if b = 0, exception occurs 
}
```

---
---
