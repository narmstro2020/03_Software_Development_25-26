# Java Classes, Objects, and OOP Fundamentals
*Lecture Notes*

---

## Table of Contents

| Topic | Link |
|-------|------|
| [Vocabulary](#vocabulary) | Quick reference for key terms |
| [1. Classes](#1-classes) | Introduction to Java classes |
| [2. Objects and Object Instances](#2-objects-and-object-instances) | Creating and using objects |
| [3. Static Fields, Methods and Initializer Blocks](#3-static-fields-methods-and-initializer-blocks) | Class-level components |
| [4. Instance Fields, Methods, and Initializer Blocks](#4-instance-fields-methods-and-initializer-blocks) | Object-level components |
| [5. Constructors and the new Keyword](#5-constructors-and-the-new-keyword) | Object creation and initialization |
| [6. References and Reference Types](#6-references-and-reference-types) | Understanding memory and references |
| [7. Initialization Order](#7-initialization-order) | Order of execution in Java |
| [8. Special Reference Types](#8-special-reference-types) | Wrapper classes, Strings, and Arrays |
| [9. What is "Pure" OOP](#9-what-is-pure-oop) | Object-oriented programming principles |
| [Summary](#summary) | Key takeaways |
| [Additional Resources](#additional-resources) | Documentation and references |

---

## Vocabulary

**Class**: A blueprint or template that defines the structure and behavior of objects
**Object**: An instance of a class; a specific entity created from a class blueprint
**Instance**: Another term for object; a specific occurrence of a class
**Field**: A variable that belongs to a class or object (also called attribute or property)
**Method**: A function that belongs to a class or object
**Static**: Belongs to the class itself, not to any specific instance
**Instance**: Belongs to a specific object, not to the class
**Constructor**: A special method used to create and initialize objects
**Reference**: A variable that stores the memory address of an object
**Reference Type**: A data type that stores references to objects rather than the objects themselves
**Initializer Block**: Code that runs when a class is loaded or when an object is created
**new Keyword**: Used to create new instances of objects in memory
**Pure OOP**: Programming using only objects and classes, avoiding procedural programming

[↑ Back to Top](#java-classes-objects-and-oop-fundamentals)

---

## 1. Classes

### What is a Class?

A **class** is like a blueprint or template that describes what an object should look like and what it can do. Think of it like a cookie cutter - the cookie cutter (class) defines the shape, but each cookie (object) made from it is a separate entity.

### Basic Class Structure

```java
public class ClassName {

    // Fields (variables that belong to the class)

    // Constructors (special methods for creating objects)

    // Methods (functions that belong to the class)
    
}
```

### Example: Creating a Simple Class

```java
public class Student {
    // Fields
    public String name;
    public int age;
    public double gpa;
    
    // Method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}
```

### Key Points About Classes:
- Class names should start with a capital letter (PascalCase)
- Classes are saved in files with the same name as the class (Student.java)
- The `public` keyword means the class can be accessed from other classes
- A class is a **reference type**, not a primitive type

[↑ Back to Top](#java-classes-objects-and-oop-fundamentals)

---

## 2. Objects and Object Instances

### What is an Object?

An **object** (also called an **instance**) is a specific entity created from a class blueprint. If a class is the blueprint for a house, then objects are the actual houses built from that blueprint.

### Creating Objects

To create an object, we use the `new` keyword:

```java
ClassName objectName = new ClassName();
```

### Example: Creating Student Objects

```java
public class StudentDemo {
    public static void main(String[] args) {
        // Create two Student objects
        Student student1 = new Student();
        Student student2 = new Student();
        
        // Set values for student1
        student1.name = "Alice";
        student1.age = 20;
        student1.gpa = 3.8;
        
        // Set values for student2
        student2.name = "Bob";
        student2.age = 19;
        student2.gpa = 3.2;
        
        // Use the objects
        student1.displayInfo();
        System.out.println(); // Empty line
        student2.displayInfo();
    }
}
```

**Output:**
```
Name: Alice
Age: 20
GPA: 3.8

Name: Bob
Age: 19
GPA: 3.2
```

### Object vs Class
- **Class**: The template/blueprint (Student)
- **Object/Instance**: The actual thing created from the template (student1, student2)
- Each object has its own copy of the fields
- Objects can have different values in their fields

[↑ Back to Top](#java-classes-objects-and-oop-fundamentals)

---

## 3. Static Fields, Methods and Initializer Blocks

### What is Static?

The `static` keyword means that something belongs to the **class itself**, not to any specific object. Static members are shared by all instances of the class.

### Static Fields

Static fields (also called class variables) are shared by all objects of the class:

```java
public class Counter {
    public static int totalCount = 0; // Static field
    public int instanceCount = 0;     // Instance field
    
    public void increment() {
        totalCount++;      // Shared by all Counter objects
        instanceCount++;   // Unique to each Counter object
    }
    
    public void displayCounts() {
        System.out.println("Total count (static): " + totalCount);
        System.out.println("Instance count: " + instanceCount);
    }
}
```

### Static Methods

Static methods belong to the class and can be called without creating an object:

```java
public class MathHelper {
    // Static method - can be called without creating an object
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Static method using another static method
    public static void printCircleArea(double radius) {
        double area = calculateCircleArea(radius);
        System.out.println("Circle area: " + area);
    }
}

// Usage in main method:
public class Demo {
    public static void main(String[] args) {
        // Call static methods using the class name
        double area = MathHelper.calculateCircleArea(5.0);
        System.out.println("Area: " + area);
        
        MathHelper.printCircleArea(3.0);
    }
}
```

### Static Initializer Blocks

Static initializer blocks run once when the class is first loaded:

```java
public class DatabaseConfig {
    public static String databaseUrl;
    public static String username;
    
    // Static initializer block - runs when class is loaded
    static {
        System.out.println("Loading database configuration...");
        databaseUrl = "jdbc:mysql://localhost:3306/mydb";
        username = "admin";
        System.out.println("Database configuration loaded!");
    }
    
    public static void printConfig() {
        System.out.println("Database URL: " + databaseUrl);
        System.out.println("Username: " + username);
    }
}
```

### Important Rules for Static:
- Static methods can only directly access other static fields and methods
- Static methods cannot use `this` keyword (no specific object)
- Static members are loaded when the class is first used
- Access static members using the class name: `ClassName.staticMember`

[↑ Back to Top](#java-classes-objects-and-oop-fundamentals)

---

## 4. Instance Fields, Methods, and Initializer Blocks

### Instance Fields

Instance fields (also called object fields) belong to specific objects. Each object has its own copy:

```java
public class BankAccount {
    // Instance fields - each object has its own copy
    public String accountNumber;
    public String ownerName;
    public double balance;
    
    // Instance method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount);
        System.out.println("New balance: $" + balance);
    }
    
    // Instance method
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
```

### Instance Methods

Instance methods work with specific objects and can access both instance and static members:

```java
public class Temperature {
    public double celsius;
    public static String unit = "Celsius"; // Static field
    
    // Instance method - works with specific object
    public double toFahrenheit() {
        return (celsius * 9.0/5.0) + 32;
    }
    
    // Instance method - can access both instance and static members
    public void displayTemperature() {
        System.out.println("Temperature: " + celsius + " " + unit);
        System.out.println("In Fahrenheit: " + toFahrenheit() + " F");
    }
}
```

### Instance Initializer Blocks

Instance initializer blocks run every time an object is created:

```java
public class GamePlayer {
    public String playerName;
    public int health;
    public int level;
    
    // Instance initializer block - runs for each new object
    {
        System.out.println("Creating new player...");
        health = 100;  // Default health
        level = 1;     // Default level
        System.out.println("Player initialized with health: " + health + ", level: " + level);
    }
    
    public void displayStats() {
        System.out.println("Player: " + playerName);
        System.out.println("Health: " + health);
        System.out.println("Level: " + level);
    }
}
```

### Usage Example:

```java
public class GameDemo {
    public static void main(String[] args) {
        GamePlayer player1 = new GamePlayer();
        player1.playerName = "Hero123";
        
        GamePlayer player2 = new GamePlayer();
        player2.playerName = "Warrior456";
        
        player1.displayStats();
        System.out.println();
        player2.displayStats();
    }
}
```

[↑ Back to Top](#java-classes-objects-and-oop-fundamentals)

---

## 5. Constructors and the new Keyword

### What are Constructors?

A **constructor** is a special method that is automatically called when you create a new object. Its job is to initialize (set up) the object.

### Constructor Rules:
- Must have the same name as the class
- No return type (not even `void`)
- Called automatically when using `new` keyword
- Can have parameters to customize object creation

### Default Constructor

If you don't write any constructor, Java provides a default one:

```java
public class SimpleClass {
    public String message;
    
    // Java automatically provides this default constructor:
    // public SimpleClass() {
    // }
}
```

### Custom Constructors

```java
public class Book {
    public String title;
    public String author;
    public int pages;
    
    // Constructor with no parameters
    public Book() {
        title = "Unknown";
        author = "Unknown";
        pages = 0;
        System.out.println("Book created with default values");
    }
    
    // Constructor with parameters
    public Book(String bookTitle, String bookAuthor, int bookPages) {
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
        System.out.println("Book created: " + title + " by " + author);
    }
    
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}
```

### The `new` Keyword

The `new` keyword does three things:
1. **Allocates memory** for the new object
2. **Calls the constructor** to initialize the object
3. **Returns a reference** to the newly created object

```java
public class BookDemo {
    public static void main(String[] args) {
        // Using new with default constructor
        Book book1 = new Book();
        
        // Using new with parameterized constructor
        Book book2 = new Book("1984", "George Orwell", 328);
        
        // Using new with different values
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 376);
        
        book1.displayBook();
        System.out.println();
        book2.displayBook();
        System.out.println();
        book3.displayBook();
    }
}
```

### Constructor Overloading

You can have multiple constructors with different parameters:

```java
public class Rectangle {
    public double width;
    public double height;
    
    // Constructor 1: No parameters (creates unit square)
    public Rectangle() {
        width = 1.0;
        height = 1.0;
    }
    
    // Constructor 2: One parameter (creates square)
    public Rectangle(double size) {
        width = size;
        height = size;
    }
    
    // Constructor 3: Two parameters (creates rectangle)
    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    
    public double calculateArea() {
        return width * height;
    }
    
    public void displayInfo() {
        System.out.println("Width: " + width + ", Height: " + height);
        System.out.println("Area: " + calculateArea());
    }
}
```

[↑ Back to Top](#java-classes-objects-and-oop-fundamentals)

---

## 6. References and Reference Types

### Understanding References

In Java, when you create an object, the variable doesn't store the actual object. Instead, it stores a **reference** (memory address) that points to where the object is located in memory.

### Primitive vs Reference Types

```java
public class ReferenceDemo {
    public static void main(String[] args) {
        // Primitive types store the actual value
        int num1 = 10;
        int num2 = num1;  // num2 gets a copy of the value
        num2 = 20;        // Changing num2 doesn't affect num1
        System.out.println("num1: " + num1); // Still 10
        System.out.println("num2: " + num2); // Now 20
        
        // Reference types store references to objects
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 20;
        
        Student student2 = student1;  // student2 gets a copy of the reference
        student2.name = "Bob";        // This changes the object that both references point to
        
        System.out.println("student1.name: " + student1.name); // Bob (changed!)
        System.out.println("student2.name: " + student2.name); // Bob
    }
}
```

### Visual Representation

```
Primitive Variables:
num1 [10]
num2 [20]

Reference Variables:
student1 [reference] -----> Student Object {name: "Bob", age: 20}
student2 [reference] ----/
```

### null References

A reference can point to "nothing" using the `null` keyword:

```java
public class NullDemo {
    public static void main(String[] args) {
        Student student = null;  // Reference points to nothing
        
        System.out.println("Student reference: " + student); // Prints: null
        
        // This would cause a NullPointerException:
        // student.name = "Alice";  // ERROR! Can't access fields of null
        
        // Check for null before using
        if (student != null) {
            student.name = "Alice";
        } else {
            System.out.println("Student is null, creating new student...");
            student = new Student();
            student.name = "Alice";
        }
    }
}
```

### Reference Assignment vs Object Creation

```java
public class ReferenceAssignment {
    public static void main(String[] args) {
        // Create two separate objects
        Student alice = new Student();
        alice.name = "Alice";
        alice.age = 20;
        
        Student bob = new Student();
        bob.name = "Bob";
        bob.age = 19;
        
        System.out.println("Before assignment:");
        System.out.println("Alice: " + alice.name);
        System.out.println("Bob: " + bob.name);
        
        // Reference assignment - bob now points to the same object as alice
        bob = alice;
        
        System.out.println("After assignment (bob = alice):");
        System.out.println("Alice: " + alice.name);
        System.out.println("Bob: " + bob.name);  // Both point to same object
        
        // Change through alice reference
        alice.name = "Changed Name";
        
        System.out.println("After changing alice.name:");
        System.out.println("Alice: " + alice.name);
        System.out.println("Bob: " + bob.name);    // Both show the change
    }
}
```

### Key Points About References:
- Reference variables store memory addresses, not objects
- Multiple references can point to the same object
- Changing an object affects all references pointing to it
- `null` means the reference doesn't point to any object
- Reference assignment copies the address, not the object

[↑ Back to Top](#java-classes-objects-and-oop-fundamentals)

---

## 7. Initialization Order

Understanding the order in which Java initializes classes and objects is crucial for avoiding bugs and understanding program behavior.

### Class Loading vs Object Creation

**Class Loading** happens once when the class is first used:
1. Static fields are initialized
2. Static initializer blocks run

**Object Creation** happens each time you use `new`:
1. Instance fields are initialized
2. Instance initializer blocks run
3. Constructor runs

### Complete Initialization Order Example

```java
public class InitializationOrder {
    // 1. Static field initialization (class loading)
    public static String staticField = initializeStaticField();
    
    // 3. Instance field initialization (object creation)
    public String instanceField = initializeInstanceField();
    public String name;
    
    // 2. Static initializer block (class loading)
    static {
        System.out.println("2. Static initializer block");
        staticField = staticField + " (modified in static block)";
    }
    
    // 4. Instance initializer block (object creation)
    {
        System.out.println("4. Instance initializer block");
        instanceField = instanceField + " (modified in instance block)";
    }
    
    // 5. Constructor (object creation)
    public InitializationOrder(String name) {
        System.out.println("5. Constructor called");
        this.name = name;
    }
    
    // Helper methods to show when fields are initialized
    public static String initializeStaticField() {
        System.out.println("1. Static field initialization");
        return "Static field value";
    }
    
    public String initializeInstanceField() {
        System.out.println("3. Instance field initialization");
        return "Instance field value";
    }
    
    public void displayFields() {
        System.out.println("Static field: " + staticField);
        System.out.println("Instance field: " + instanceField);
        System.out.println("Name: " + name);
    }
}
```

### Testing Initialization Order

```java
public class InitializationTest {
    public static void main(String[] args) {
        System.out.println("=== Creating first object ===");
        InitializationOrder obj1 = new InitializationOrder("Object 1");
        obj1.displayFields();
        
        System.out.println("\n=== Creating second object ===");
        InitializationOrder obj2 = new InitializationOrder("Object 2");
        obj2.displayFields();
    }
}
```

**Output:**
```
=== Creating first object ===
1. Static field initialization
2. Static initializer block
3. Instance field initialization
4. Instance initializer block
5. Constructor called
Static field: Static field value (modified in static block)
Instance field: Instance field value (modified in instance block)
Name: Object 1

=== Creating second object ===
3. Instance field initialization
4. Instance initializer block
5. Constructor called
Static field: Static field value (modified in static block)
Instance field: Instance field value (modified in instance block)
Name: Object 2
```

### Multiple Initializer Blocks

You can have multiple initializer blocks of the same type - they run in order:

```java
public class MultipleBlocks {
    public static int staticCounter = 0;
    public int instanceCounter = 0;
    
    // First static block
    static {
        System.out.println("First static block, staticCounter: " + staticCounter);
        staticCounter++;
    }
    
    // Second static block
    static {
        System.out.println("Second static block, staticCounter: " + staticCounter);
        staticCounter++;
    }
    
    // First instance block
    {
        System.out.println("First instance block, instanceCounter: " + instanceCounter);
        instanceCounter++;
    }
    
    // Second instance block
    {
        System.out.println("Second instance block, instanceCounter: " + instanceCounter);
        instanceCounter++;
    }
    
    public MultipleBlocks() {
        System.out.println("Constructor, instanceCounter: " + instanceCounter);
    }
}
```

[↑ Back to Top](#java-classes-objects-and-oop-fundamentals)

---

## 8. Special Reference Types

Some reference types in Java are special because they don't follow the typical pattern of having class files. Instead, they're handled specially by the Java Virtual Machine (JVM).

### String Class

Strings are objects, but they have special treatment:

```java
public class StringDemo {
    public static void main(String[] args) {
        // Different ways to create strings
        String str1 = "Hello";           // String literal (stored in string pool)
        String str2 = new String("Hello"); // Explicit object creation
        String str3 = "Hello";           // Another literal (reuses str1)
        
        // Reference comparison vs content comparison
        System.out.println("str1 == str2: " + (str1 == str2)); // false (different objects)
        System.out.println("str1 == str3: " + (str1 == str3)); // true (same object in pool)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true (same content)
        
        // Strings are immutable - methods return new strings
        String original = "Hello";
        String modified = original.toLowerCase(); // Creates new string
        System.out.println("Original: " + original);   // Still "Hello"
        System.out.println("Modified: " + modified);   // "hello"
    }
}
```

### Wrapper Classes

Wrapper classes convert primitive types into objects:

```java
public class WrapperDemo {
    public static void main(String[] args) {
        // Boxing - converting primitive to object
        Integer intObject1 = new Integer(10);      // Explicit (deprecated in newer Java)
        Integer intObject2 = Integer.valueOf(20);  // Preferred way
        Integer intObject3 = 30;                   // Autoboxing (automatic conversion)
        
        // Unboxing - converting object to primitive
        int primitive1 = intObject1.intValue();    // Explicit
        int primitive2 = intObject2;               // Auto-unboxing (automatic conversion)
        
        // Wrapper classes have useful methods
        System.out.println("Max int value: " + Integer.MAX_VALUE);
        System.out.println("Parse string to int: " + Integer.parseInt("123"));
        System.out.println("Int to binary string: " + Integer.toBinaryString(10));
        
        // Comparison with wrapper classes
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        
        System.out.println("a == b: " + (a == b)); // true (cached values -128 to 127)
        System.out.println("c == d: " + (c == d)); // false (not cached)
        System.out.println("c.equals(d): " + c.equals(d)); // true (content comparison)
    }
}
```

### Arrays (Brief Introduction)

Arrays are objects that store multiple values of the same type:

```java
public class BasicArrayDemo {
    public static void main(String[] args) {
        // Creating arrays (different ways)
        int[] numbers1 = new int[5];           // Array of 5 integers, all 0
        int[] numbers2 = {1, 2, 3, 4, 5};     // Array with initial values
        String[] names = new String[3];       // Array of 3 strings, all null
        
        // Arrays are objects with a length field
        System.out.println("numbers1 length: " + numbers1.length);
        System.out.println("numbers2 length: " + numbers2.length);
        
        // Accessing array elements (index starts at 0)
        numbers1[0] = 10;  // Set first element
        numbers1[1] = 20;  // Set second element
        
        System.out.println("First element: " + numbers1[0]);
        System.out.println("Second element: " + numbers1[1]);
        
        // Arrays are reference types
        int[] arrayRef1 = {1, 2, 3};
        int[] arrayRef2 = arrayRef1;  // Both point to same array
        arrayRef2[0] = 999;           // Changes the array
        
        System.out.println("arrayRef1[0]: " + arrayRef1[0]); // 999 (changed!)
    }
}
```

### Common Characteristics of Special Reference Types

1. **Strings**: Immutable objects with special literal syntax
2. **Wrapper Classes**: Convert primitives to objects with useful methods
3. **Arrays**: Objects that store multiple values with special syntax

All of these:
- Are reference types (stored as memory addresses)
- Can be `null`
- Have special JVM handling
- Don't require explicit class files in your project

[↑ Back to Top](#java-classes-objects-and-oop-fundamentals)

---

## 9. What is "Pure" OOP

### Understanding Pure Object-Oriented Programming

**Pure OOP** means writing programs using only objects and classes, without using procedural programming techniques. In pure OOP, everything is an object or belongs to an object.

### Non-Pure OOP Example (What We've Been Doing)

```java
// This is NOT pure OOP because we're using static main method
// and calling methods without creating objects
public class Calculator {
    public static void main(String[] args) {
        // Using static methods (procedural style)
        int result = addNumbers(5, 3);
        System.out.println("Result: " + result);
    }
    
    // Static method - belongs to class, not object
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
```

### Pure OOP Example

```java
// Pure OOP - everything goes through objects
public class Calculator {
    private int lastResult;
    
    // Instance method - belongs to object
    public int add(int a, int b) {
        lastResult = a + b;
        return lastResult;
    }
    
    public int multiply(int a, int b) {
        lastResult = a * b;
        return lastResult;
    }
    
    public int getLastResult() {
        return lastResult;
    }
    
    public void displayLastResult() {
        System.out.println("Last result: " + lastResult);
    }
}

// Separate class for running the program
public class CalculatorApp {
    public static void main(String[] args) {
        // Create objects to do the work
        Calculator calc = new Calculator();
        
        // Use objects to perform operations
        calc.add(5, 3);
        calc.displayLastResult();
        
        calc.multiply(4, 2);
        calc.displayLastResult();
    }
}
```

### Pure OOP Bank System Example

```java
// Pure OOP approach - each class has a specific responsibility
public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountInfo() {
        return "Account: " + accountNumber + ", Owner: " + ownerName + ", Balance: $" + balance;
    }
}

public class Bank {
    private String bankName;
    
    public Bank(String name) {
        this.bankName = name;
    }
    
    public void processDeposit(BankAccount account, double amount) {
        System.out.println(bankName + " processing deposit of $" + amount);
        account.deposit(amount);
        System.out.println("Deposit successful. " + account.getAccountInfo());
    }
    
    public void processWithdrawal(BankAccount account, double amount) {
        System.out.println(bankName + " processing withdrawal of $" + amount);
        boolean success = account.withdraw(amount);
        if (success) {
            System.out.println("Withdrawal successful. " + account.getAccountInfo());
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}

public class Customer {
    private String name;
    private BankAccount account;
    
    public Customer(String name) {
        this.name = name;
    }
    
    public void openAccount(String accountNumber, double initialDeposit) {
        account = new BankAccount(accountNumber, name, initialDeposit);
        System.out.println(name + " opened account: " + account.getAccountInfo());
    }
    
    public void makeDeposit(Bank bank, double amount) {
        if (account != null) {
            bank.processDeposit(account, amount);
        }
    }
    
    public void makeWithdrawal(Bank bank, double amount) {
        if (account != null) {
            bank.processWithdrawal(account, amount);
        }
    }
    
    public BankAccount getAccount() {
        return account;
    }
}

// Main application class
public class BankingApp {
    public static void main(String[] args) {
        // Create objects to represent real-world entities
        Bank myBank = new Bank("First National Bank");
        Customer alice = new Customer("Alice Johnson");
        Customer bob = new Customer("Bob Smith");
        
        // Objects interact with each other
        alice.openAccount("12345", 1000.0);
        bob.openAccount("67890", 500.0);
        
        alice.makeDeposit(myBank, 200.0);
        bob.makeWithdrawal(myBank, 100.0);
        bob.makeWithdrawal(myBank, 500.0); // Should fail
    }
}
```

### Benefits of Pure OOP

1. **Modularity**: Each class has a specific purpose
2. **Reusability**: Objects can be reused in different contexts
3. **Maintainability**: Changes to one class don't affect others
4. **Real-world modeling**: Code structure mirrors real-world relationships
5. **Encapsulation**: Data and methods are bundled together

### When to Use Pure OOP vs Mixed Approach

**Use Pure OOP when:**
- Building complex applications with many interacting components
- Need high maintainability and extensibility
- Working in a team where different people work on different classes

**Mixed approach is okay for:**
- Simple utility programs
- Educational examples (like we've been doing)
- Quick calculations or one-time scripts

### Key Principles of Pure OOP

1. **Everything is an object** (except primitives)
2. **Objects communicate through method calls**
3. **Avoid static methods** (except for main and utilities)
4. **Each class has a single responsibility**
5. **Objects encapsulate their data and behavior**

[↑ Back to Top](#java-classes-objects-and-oop-fundamentals)

---

## Summary

### Key Concepts Learned

**Classes and Objects**
- Classes are blueprints; objects are instances created from those blueprints
- Use the `new` keyword to create objects
- Each object has its own copy of instance fields

**Static vs Instance Members**
- **Static**: Belongs to the class, shared by all objects
- **Instance**: Belongs to specific objects, each object has its own copy
- Static members accessed via class name, instance members via object reference

**Constructors**
- Special methods for initializing objects
- Same name as class, no return type
- Can have multiple constructors (overloading)
- Called automatically when using `new`

**References and Memory**
- Object variables store references (memory addresses), not the actual objects
- Multiple references can point to the same object
- `null` means the reference points to nothing
- Reference assignment copies addresses, not objects

**Initialization Order**
1. **Class loading** (once): Static fields → Static blocks
2. **Object creation** (each time): Instance fields → Instance blocks → Constructor

**Special Reference Types**
- Strings, wrapper classes, and arrays have special JVM handling
- All are reference types but have unique characteristics

**Pure OOP**
- Programming using only objects and classes
- Each class has a specific responsibility
- Objects interact through method calls
- Avoids static methods except for utilities

### Best Practices

1. **Naming Conventions**
   - Classes: PascalCase (e.g., `StudentRecord`)
   - Variables/Methods: camelCase (e.g., `firstName`, `calculateTotal()`)
   - Constants: UPPER_SNAKE_CASE (e.g., `MAX_SIZE`)

2. **Code Organization**
   - One public class per file
   - File name matches class name
   - Group related functionality in the same class

3. **Object Creation**
   - Always initialize objects before using them
   - Check for `null` before accessing object members
   - Use meaningful constructor parameters

4. **Method Design**
   - Methods should have a single, clear purpose
   - Use descriptive method names
   - Keep methods reasonably short

### Common Mistakes to Avoid

1. **NullPointerException**: Accessing members of null references
2. **Confusing reference assignment with object copying**
3. **Trying to access instance members from static methods**
4. **Forgetting that objects are reference types**
5. **Not understanding initialization order**

### What's Next?

After mastering these concepts, you'll be ready to learn:
- Access modifiers (private, protected, public)
- Inheritance and polymorphism
- Interfaces and abstract classes
- Exception handling
- Collections and generics

[↑ Back to Top](#java-classes-objects-and-oop-fundamentals)

---

## Additional Resources

### Official Documentation
- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [Java Classes and Objects Tutorial](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)

### W3Schools References
- [Java Classes and Objects](https://www.w3schools.com/java/java_classes.asp)
- [Java Constructors](https://www.w3schools.com/java/java_constructors.asp)
- [Java Modifiers](https://www.w3schools.com/java/java_modifiers.asp)

### IntelliJ IDEA
- [IntelliJ IDEA Documentation](https://www.jetbrains.com/help/idea/)
- [Creating and Running Java Programs](https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.html)

### Git and GitHub
- [Git Documentation](https://git-scm.com/doc)
- [GitHub Guides](https://guides.github.com/)
- [Git Tutorial for Beginners](https://www.w3schools.com/git/)

[↑ Back to Top](#java-classes-objects-and-oop-fundamentals)
