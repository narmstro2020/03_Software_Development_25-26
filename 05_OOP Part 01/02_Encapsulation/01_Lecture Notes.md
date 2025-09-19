# Java Classes and Objects - Lecture Notes

## Table of Contents
- [Introduction](#introduction)
- [Vocabulary](#vocabulary)
- [1. Understanding Classes and Objects](#1-understanding-classes-and-objects)
- [2. The `new` Keyword and Object Creation](#2-the-new-keyword-and-object-creation)
- [3. Stack vs. Heap Memory and Object References](#3-stack-vs-heap-memory-and-object-references)
- [4. Instance Variables and Methods](#4-instance-variables-and-methods)
- [5. The `toString` Method](#5-the-tostring-method)
- [6. Encapsulation and Access Modifiers](#6-encapsulation-and-access-modifiers)
- [7. Getters and Setters](#7-getters-and-setters)
- [8. Constructors](#8-constructors)
- [9. Initializer Blocks](#9-initializer-blocks)
- [10. Order of Initialization](#10-order-of-initialization)
- [11. The `final` Keyword](#11-the-final-keyword)
- [12. Pure Object-Oriented Programming (OOP)](#12-pure-object-oriented-programming-oop)
- [Summary](#summary)
- [Additional Resources](#additional-resources)
- [Assignments](#assignments)

---

## Introduction
[⬆ Back to Top](#table-of-contents)

Welcome to our exploration of Java Classes and Objects! This lesson will introduce you to the fundamental concepts of Object-Oriented Programming (OOP) in Java. You'll learn how to create your own custom data types, work with objects in memory, and follow best practices for encapsulation.

**Prerequisites:** You should be familiar with Java printing, the main method, Scanner, comments, null, casting, wrapper classes, arithmetic and string operators, the Math class, creating methods, boolean variables, and Java operators.

**Tools:** We'll be using IntelliJ IDEA for development, along with git and GitHub for version control.

---

## Vocabulary
[⬆ Back to Top](#table-of-contents)

**Class**: A blueprint or template for creating objects. Defines the structure and behavior that objects of this type will have.

**Object**: An instance of a class. A specific entity created from the class blueprint.

**Instance**: Another term for an object - a specific occurrence of a class.

**Instance Variable**: A variable that belongs to a specific object (also called a field or attribute).

**Instance Method**: A method that operates on a specific object and can access that object's instance variables.

**Reference**: A variable that stores the memory address of an object, not the object itself.

**Reference Type**: Data types that store references to objects (like String, Scanner, or custom classes).

**Heap Memory**: The area of memory where objects are stored.

**Stack Memory**: The area of memory where local variables and method calls are stored.

**Constructor**: A special method used to initialize objects when they are created.

**Encapsulation**: The practice of hiding internal details and providing controlled access to an object's data.

**Access Modifier**: Keywords like `public`, `private`, and `protected` that control visibility and access.

**Getter Method**: A method that returns the value of a private instance variable.

**Setter Method**: A method that sets the value of a private instance variable.

**Initializer Block**: A block of code that runs when an object is created, before the constructor.

**`new` Keyword**: The keyword used to create new objects and allocate memory for them.

**`final` Keyword**: A modifier that prevents reassignment of variables, overriding of methods, or extension of classes.

**Constant**: A variable declared with `final` whose value cannot be changed after initialization.

**Static Final Variable**: A class-level constant shared by all instances of the class.

---

## 1. Understanding Classes and Objects
[⬆ Back to Top](#table-of-contents)

### What is a Class?

Think of a class as a blueprint or template. Just like an architectural blueprint defines what a house will look like, a Java class defines what objects of that type will contain and what they can do.

### What is an Object?

An object is a specific instance created from a class blueprint. If a class is like a cookie cutter, objects are the individual cookies made with that cutter.

### Your First Class

Let's create a simple `Student` class:

```java
public class Student {
    // Instance variables (fields)
    String name;
    int age;
    double gpa;
    
    // Instance method
    public void study() {
        System.out.println(name + " is studying!");
    }
}
```

### Using the Class

```java
public class StudentDemo {
    public static void main(String[] args) {
        // Create objects (instances) of Student class
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
        
        // Call methods
        student1.study(); // Output: Alice is studying!
        student2.study(); // Output: Bob is studying!
        
        // Access variables
        System.out.println("Student 1: " + student1.name + ", Age: " + student1.age);
        System.out.println("Student 2: " + student2.name + ", Age: " + student2.age);
    }
}
```

---

## 2. The `new` Keyword and Object Creation
[⬆ Back to Top](#table-of-contents)

### What Does `new` Do?

The `new` keyword:
1. Allocates memory in the heap for the new object
2. Initializes the object's instance variables to default values
3. Calls the constructor (if one exists)
4. Returns a reference to the newly created object

### Memory Allocation Process

```java
Student myStudent = new Student();
```

This line does several things:
1. `Student myStudent` - Declares a reference variable of type Student
2. `new Student()` - Creates a new Student object in heap memory
3. `=` - Assigns the memory address of the new object to the reference variable

### Default Values

When you create an object, instance variables are automatically initialized:
- `int`, `double`, `float`, etc. → 0
- `boolean` → false
- Reference types (String, etc.) → null

```java
public class DefaultValuesDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Name: " + s.name);    // null
        System.out.println("Age: " + s.age);      // 0
        System.out.println("GPA: " + s.gpa);      // 0.0
    }
}
```

---

## 3. Stack vs. Heap Memory and Object References
[⬆ Back to Top](#table-of-contents)

### Memory Layout Visual

```
STACK MEMORY                    HEAP MEMORY
+------------------+           +------------------------+
| main method      |           |                        |
| +-------------+  |           |  +----------------+    |
| | student1    |--+---------->|  | Student Object |    |
| | (reference) |  |           |  | name: "Alice"  |    |
| +-------------+  |           |  | age: 20        |    |
| | student2    |--+---------->|  | gpa: 3.8       |    |
| | (reference) |  |           |  +----------------+    |
| +-------------+  |           |                        |
+------------------+           |  +----------------+    |
                               |  | Student Object |    |
                               |  | name: "Bob"    |    |
                               |  | age: 19        |    |
                               |  | gpa: 3.2       |    |
                               |  +----------------+    |
                               +------------------------+
```

### Key Concepts

**Stack Memory**:
- Stores local variables and method calls
- Fast access
- Limited size
- Automatically managed

**Heap Memory**:
- Stores objects
- Larger capacity
- Managed by garbage collector
- Slower access than stack

### Reference Variables

```java
Student student1 = new Student();
Student student2 = new Student();
Student student3 = student1;  // student3 refers to same object as student1

student1.name = "Charlie";
System.out.println(student3.name); // Output: Charlie (same object!)

student2.name = "Diana";
System.out.println(student1.name); // Output: Charlie (different objects)
```

### Null References

```java
Student student = null;  // Reference points to nothing
// student.name = "Test";  // This would cause NullPointerException!

if (student != null) {
    student.name = "Safe to use";
}
```

---

## 4. Instance Variables and Methods
[⬆ Back to Top](#table-of-contents)

### Instance Variables

Instance variables belong to each individual object:

```java
public class Car {
    String make;
    String model;
    int year;
    double mileage;
    boolean isRunning;
}
```

### Instance Methods

Instance methods can access and modify instance variables:

```java
public class Car {
    String make;
    String model;
    int year;
    double mileage;
    boolean isRunning;
    
    public void start() {
        isRunning = true;
        System.out.println("The " + make + " " + model + " is now running!");
    }
    
    public void stop() {
        isRunning = false;
        System.out.println("The car has stopped.");
    }
    
    public void drive(double miles) {
        if (isRunning) {
            mileage += miles;
            System.out.println("Drove " + miles + " miles. Total mileage: " + mileage);
        } else {
            System.out.println("Can't drive - car is not running!");
        }
    }
}
```

### Using Instance Methods

```java
public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2020;
        
        myCar.start();           // Start the car
        myCar.drive(25.5);       // Drive 25.5 miles
        myCar.drive(10.0);       // Drive another 10 miles
        myCar.stop();            // Stop the car
    }
}
```

---

## 5. The `toString` Method
[⬆ Back to Top](#table-of-contents)

### What is `toString`?

The `toString` method is a special method that returns a string representation of an object. Every class in Java automatically inherits this method, but the default version isn't very useful.

### Default `toString` Behavior

```java
Student student = new Student();
student.name = "Alex";
System.out.println(student); // Output: Student@15db9742 (not helpful!)
```

### Creating a Custom `toString` Method

```java
public class Student {
    String name;
    int age;
    double gpa;
    
    public void study() {
        System.out.println(name + " is studying!");
    }
    
    // Custom toString method
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", gpa=" + gpa + "}";
    }
}
```

### Using the Custom `toString`

```java
public class ToStringDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Sarah";
        student.age = 21;
        student.gpa = 3.9;
        
        System.out.println(student); 
        // Output: Student{name='Sarah', age=21, gpa=3.9}
        
        // toString is called automatically when printing
        System.out.println("My student: " + student);
        // Output: My student: Student{name='Sarah', age=21, gpa=3.9}
    }
}
```

### When `toString` is Called

The `toString` method is automatically called when:
- You print an object with `System.out.println()`
- You concatenate an object with a string using `+`
- You explicitly call `object.toString()`

---

## 6. Encapsulation and Access Modifiers
[⬆ Back to Top](#table-of-contents)

### What is Encapsulation?

Encapsulation is the practice of hiding the internal details of an object and controlling access to its data. This protects the object's integrity and makes code more maintainable.

### Access Modifiers

**`public`**: Accessible from anywhere
**`private`**: Only accessible within the same class
**`protected`**: Accessible within the same package and subclasses (we'll learn this later)
**Default (no modifier)**: Accessible within the same package

### Why Use `private`?

```java
public class BankAccount {
    private double balance;  // Protected from direct access
    private String accountNumber;
    
    // Methods to safely interact with private data
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
            return false;
        }
    }
    
    public double getBalance() {
        return balance;
    }
}
```

### Benefits of Encapsulation

Without encapsulation:
```java
BankAccount account = new BankAccount();
account.balance = -1000;  // Oops! Negative balance - this shouldn't be allowed
```

With encapsulation:
```java
BankAccount account = new BankAccount();
// account.balance = -1000;  // Compile error - balance is private!
account.deposit(1000);       // Safe way to modify balance
account.withdraw(500);       // Controlled withdrawal
```

---

## 7. Getters and Setters
[⬆ Back to Top](#table-of-contents)

### What are Getters and Setters?

**Getter**: A method that returns the value of a private instance variable
**Setter**: A method that sets the value of a private instance variable (with validation if needed)

### Naming Convention

- Getters: `get` + VariableName (e.g., `getName()`)
- Setters: `set` + VariableName (e.g., `setName()`)
- Boolean getters: `is` + VariableName (e.g., `isActive()`)

### Complete Example

```java
public class Person {
    private String name;
    private int age;
    private boolean isEmployed;
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name with validation
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name provided");
        }
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age provided");
        }
    }
    
    // Boolean getter
    public boolean isEmployed() {
        return isEmployed;
    }
    
    // Setter for employment status
    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }
    
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", employed=" + isEmployed + "}";
    }
}
```

### Using Getters and Setters

```java
public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        
        // Using setters
        person.setName("John Doe");
        person.setAge(30);
        person.setEmployed(true);
        
        // Using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Employed: " + person.isEmployed());
        
        // Trying invalid values
        person.setAge(-5);    // Output: Invalid age provided
        person.setName("");   // Output: Invalid name provided
        
        System.out.println(person); // Uses toString method
    }
}
```

### The `this` Keyword

The `this` keyword refers to the current object:

```java
public void setName(String name) {
    this.name = name;  // this.name is the instance variable
                       // name is the parameter
}
```

---

## 8. Constructors
[⬆ Back to Top](#table-of-contents)

### What is a Constructor?

A constructor is a special method that initializes an object when it's created. It has the same name as the class and no return type.

### Default Constructor

If you don't provide a constructor, Java creates a default one:

```java
public class Student {
    String name;
    int age;
    
    // Java automatically provides this:
    // public Student() {
    //     // Empty constructor
    // }
}
```

### Custom Constructors

```java
public class Student {
    private String name;
    private int age;
    private double gpa;
    
    // Constructor with parameters
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    // Constructor with just name
    public Student(String name) {
        this.name = name;
        this.age = 18;        // Default age
        this.gpa = 0.0;       // Default GPA
    }
    
    // Default constructor (no parameters)
    public Student() {
        this.name = "Unknown";
        this.age = 18;
        this.gpa = 0.0;
    }
    
    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", gpa=" + gpa + "}";
    }
}
```

### Using Constructors

```java
public class ConstructorDemo {
    public static void main(String[] args) {
        // Using different constructors
        Student student1 = new Student("Alice", 20, 3.8);
        Student student2 = new Student("Bob");
        Student student3 = new Student();
        
        System.out.println(student1);  // Full info
        System.out.println(student2);  // Just name provided
        System.out.println(student3);  // All defaults
    }
}
```

### Constructor Rules

1. Must have the same name as the class
2. No return type (not even `void`)
3. Called automatically when object is created
4. Can have multiple constructors (overloading)
5. If you create any constructor, Java won't provide the default one

---

## 9. Initializer Blocks
[⬆ Back to Top](#table-of-contents)

### What are Initializer Blocks?

Initializer blocks are blocks of code that run when an object is created, before the constructor executes. They're useful for code that should run regardless of which constructor is called.

### Instance Initializer Block

```java
public class Student {
    private String name;
    private int age;
    private double gpa;
    private String studentId;
    
    // Instance initializer block
    {
        System.out.println("Initializer block running...");
        studentId = "STU" + Math.round(Math.random() * 10000);
        System.out.println("Generated student ID: " + studentId);
    }
    
    public Student(String name, int age, double gpa) {
        System.out.println("Constructor running...");
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    public Student(String name) {
        System.out.println("Name-only constructor running...");
        this.name = name;
        this.age = 18;
        this.gpa = 0.0;
    }
    
    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    
    public String toString() {
        return "Student{id='" + studentId + "', name='" + name + 
               "', age=" + age + ", gpa=" + gpa + "}";
    }
}
```

### Multiple Initializer Blocks

You can have multiple initializer blocks - they execute in the order they appear:

```java
public class InitializerExample {
    private String value1;
    private String value2;
    
    // First initializer block
    {
        System.out.println("First initializer block");
        value1 = "First";
    }
    
    // Second initializer block
    {
        System.out.println("Second initializer block");
        value2 = "Second";
    }
    
    public InitializerExample() {
        System.out.println("Constructor");
        System.out.println("value1: " + value1 + ", value2: " + value2);
    }
}
```

### When to Use Initializer Blocks

Initializer blocks are useful when:
- You need to perform complex initialization that's common to all constructors
- You need to initialize final variables with complex logic
- You want to ensure certain code runs before any constructor

---

## 10. Order of Initialization
[⬆ Back to Top](#table-of-contents)

### Initialization Order

When you create an object, things happen in this specific order:

1. **Default values assigned** to instance variables
2. **Initializer blocks** execute (in order of appearance)
3. **Constructor** executes

### Detailed Example

```java
public class InitializationOrder {
    private String name = "Default Name";  // Step 1: Default assignment
    
    // Step 2a: First initializer block
    {
        System.out.println("1. First initializer block");
        System.out.println("   name is currently: " + name);
        name = "Initializer Name";
    }
    
    private int number = 42;  // Step 1: Default assignment
    
    // Step 2b: Second initializer block
    {
        System.out.println("2. Second initializer block");
        System.out.println("   name is currently: " + name);
        System.out.println("   number is currently: " + number);
        number = 100;
    }
    
    // Step 3: Constructor
    public InitializationOrder(String constructorName) {
        System.out.println("3. Constructor executing");
        System.out.println("   name before constructor: " + name);
        System.out.println("   number before constructor: " + number);
        this.name = constructorName;
        System.out.println("   name after constructor: " + name);
    }
    
    public String toString() {
        return "Object{name='" + name + "', number=" + number + "}";
    }
}
```

### Testing the Order

```java
public class OrderDemo {
    public static void main(String[] args) {
        System.out.println("Creating object...");
        InitializationOrder obj = new InitializationOrder("Constructor Name");
        System.out.println("Final result: " + obj);
    }
}
```

**Output:**
```
Creating object...
1. First initializer block
   name is currently: Default Name
2. Second initializer block
   name is currently: Initializer Name
   number is currently: 42
3. Constructor executing
   name before constructor: Initializer Name
   number before constructor: 100
   name after constructor: Constructor Name
Final result: Object{name='Constructor Name', number=100}
```

---

## 11. The `final` Keyword
[⬆ Back to Top](#table-of-contents)

### What is `final`?

The `final` keyword in Java is a modifier that can be applied to variables, methods, and classes. When something is marked as `final`, it cannot be changed or modified after it's been set or defined.

### Final Variables (Constants)

When you declare a variable as `final`, it becomes a **constant** - its value cannot be changed after initialization.

#### Instance Final Variables

```java
public class Circle {
    private final double PI = 3.14159;  // Must be initialized
    private final double radius;         // Can be initialized in constructor
    
    public Circle(double radius) {
        this.radius = radius;  // Final variable initialized in constructor
        // this.radius = 5.0;  // ERROR: Cannot reassign final variable
    }
    
    public double getArea() {
        return PI * radius * radius;
    }
    
    public double getRadius() {
        return radius;  // Getter is fine - we're not changing the value
    }
    
    // public void setRadius(double newRadius) {
    //     this.radius = newRadius;  // ERROR: Cannot modify final variable
    // }
}
```

#### Static Final Variables (Class Constants)

```java
public class MathConstants {
    public static final double PI = 3.14159;
    public static final int MAX_STUDENTS = 30;
    public static final String UNIVERSITY_NAME = "Java University";
    
    private String name;
    
    public MathConstants(String name) {
        this.name = name;
    }
}
```

#### Using Class Constants

```java
public class MathDemo {
    public static void main(String[] args) {
        // Access static final variables without creating objects
        System.out.println("Pi value: " + MathConstants.PI);
        System.out.println("Max students: " + MathConstants.MAX_STUDENTS);
        
        Circle circle = new Circle(5.0);
        System.out.println("Circle area: " + circle.getArea());
    }
}
```

### Final Local Variables

Local variables in methods can also be final:

```java
public class Calculator {
    public void calculateTax(double amount) {
        final double TAX_RATE = 0.08;  // Local constant
        
        double tax = amount * TAX_RATE;
        System.out.println("Tax on $" + amount + " is $" + tax);
        
        // TAX_RATE = 0.10;  // ERROR: Cannot reassign final variable
    }
}
```

### Benefits of Using `final` Variables

1. **Prevents accidental changes** to important values
2. **Makes code more readable** - clearly indicates constants
3. **Compiler optimizations** - compiler can optimize final variables
4. **Thread safety** - final variables are inherently thread-safe

### Final Variables with Objects

**Important:** `final` means the reference cannot be changed, but the object itself can still be modified:

```java
public class StudentManager {
    private final Student defaultStudent;
    
    public StudentManager() {
        defaultStudent = new Student("Default", "default@school.edu");
    }
    
    public void demonstrateFinalReference() {
        // This is allowed - modifying the object's state
        defaultStudent.setName("Updated Default");
        
        // This would cause an ERROR - changing the reference
        // defaultStudent = new Student("New", "new@school.edu");
    }
}
```

### Final Methods (Preview)

Although we haven't covered inheritance yet, it's worth knowing that methods can be `final`:

```java
public class Shape {
    private String color;
    
    // Final method cannot be overridden in subclasses
    public final void setColor(String color) {
        this.color = color;
    }
    
    // Regular method can be overridden
    public void draw() {
        System.out.println("Drawing a shape");
    }
}
```

### Final Classes (Preview)

Classes can also be `final`, which prevents them from being extended:

```java
// This class cannot be subclassed
public final class ImmutablePoint {
    private final int x;
    private final int y;
    
    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() { return x; }
    public int getY() { return y; }
}
```

### Common Naming Convention for Constants

Constants (static final variables) are typically written in ALL_CAPS with underscores:

```java
public class GameConstants {
    public static final int MAX_PLAYERS = 4;
    public static final double GRAVITY = 9.81;
    public static final String DEFAULT_DIFFICULTY = "NORMAL";
    public static final boolean DEBUG_MODE = false;
}
```

### Practical Example: Enhanced Student Class

```java
public class Student {
    // Class constants
    public static final double MIN_GPA = 0.0;
    public static final double MAX_GPA = 4.0;
    public static final int MIN_CREDITS = 0;
    public static final int CREDITS_TO_GRADUATE = 120;
    
    // Instance constants
    private final String studentId;     // Never changes after creation
    private final String universityName; // Same for all instances
    
    // Regular instance variables
    private String name;
    private double gpa;
    private int credits;
    
    public Student(String name, String universityName) {
        this.studentId = "STU" + System.currentTimeMillis();
        this.universityName = universityName;
        this.name = name;
        this.gpa = MIN_GPA;  // Using constant
        this.credits = MIN_CREDITS;  // Using constant
    }
    
    public void setGpa(double gpa) {
        if (gpa >= MIN_GPA && gpa <= MAX_GPA) {  // Using constants
            this.gpa = gpa;
        } else {
            System.out.println("GPA must be between " + MIN_GPA + " and " + MAX_GPA);
        }
    }
    
    public boolean canGraduate() {
        return credits >= CREDITS_TO_GRADUATE && gpa >= 2.0;
    }
    
    // Getters for final variables
    public String getStudentId() { return studentId; }
    public String getUniversityName() { return universityName; }
    
    public String toString() {
        return name + " (ID: " + studentId + ") - " + universityName;
    }
}
```

### When to Use `final`

**Use `final` for variables when:**
- The value should never change (true constants)
- You want to prevent accidental reassignment
- The variable represents a configuration value
- You're creating an immutable object

**Use `final` for methods when:** (Future lesson)
- You want to prevent the method from being overridden
- The method implements critical functionality that shouldn't be changed

**Use `final` for classes when:** (Future lesson)  
- You want to create a class that cannot be extended
- You're creating utility classes or immutable classes

### Common Mistakes with `final`

```java
public class FinalMistakes {
    private final List<String> names;  // Reference is final, not the list contents
    
    public FinalMistakes() {
        names = new ArrayList<>();  // OK - initializing final variable
    }
    
    public void addName(String name) {
        names.add(name);  // OK - modifying the list, not the reference
    }
    
    public void replacelist() {
        // names = new ArrayList<>();  // ERROR - cannot reassign final reference
    }
    
    public void demonstrateLocalFinal() {
        final int x = 5;
        // int x = 10;  // ERROR - cannot redeclare final variable
        // x = 10;      // ERROR - cannot reassign final variable
        
        System.out.println("Final local variable: " + x);
    }
}
```

### Summary of `final` Usage

| Context | Effect | Example |
|---------|--------|---------|
| **Instance Variable** | Value cannot be changed after initialization | `private final String id;` |
| **Static Variable** | Class constant, shared by all instances | `public static final double PI = 3.14;` |
| **Local Variable** | Value cannot be changed within method | `final int count = 10;` |
| **Method Parameter** | Parameter value cannot be reassigned | `public void print(final String message)` |
| **Method** | Cannot be overridden (inheritance topic) | `public final void setId(String id)` |
| **Class** | Cannot be extended (inheritance topic) | `public final class String` |

The `final` keyword is a powerful tool for creating more robust, maintainable code by preventing unintended modifications and clearly communicating design intent.

---

## 12. Pure Object-Oriented Programming (OOP)
[⬆ Back to Top](#table-of-contents)

### What is Pure OOP?

Pure Object-Oriented Programming means organizing your code around objects and their interactions, rather than just using procedural programming with methods.

### Example: Non-OOP Approach

```java
// Procedural approach - not ideal
public class StudentManager {
    public static void main(String[] args) {
        String studentName = "Alice";
        int studentAge = 20;
        double studentGpa = 3.8;
        
        printStudent(studentName, studentAge, studentGpa);
        updateGpa(studentGpa, 3.9);  // This doesn't actually update the original!
    }
    
    public static void printStudent(String name, int age, double gpa) {
        System.out.println("Student: " + name + ", Age: " + age + ", GPA: " + gpa);
    }
    
    public static void updateGpa(double gpa, double newGpa) {
        gpa = newGpa;  // This only changes the local parameter
    }
}
```

### Pure OOP Approach

```java
// Object-oriented approach - better!
public class Student {
    private String name;
    private int age;
    private double gpa;
    
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    public void printInfo() {
        System.out.println("Student: " + name + ", Age: " + age + ", GPA: " + gpa);
    }
    
    public void updateGpa(double newGpa) {
        if (newGpa >= 0.0 && newGpa <= 4.0) {
            this.gpa = newGpa;
            System.out.println("GPA updated to: " + gpa);
        } else {
            System.out.println("Invalid GPA value");
        }
    }
    
    public void study() {
        System.out.println(name + " is studying hard!");
        // Could potentially improve GPA
        if (gpa < 4.0) {
            gpa = Math.min(4.0, gpa + 0.1);
        }
    }
    
    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", gpa=" + gpa + "}";
    }
}
```

### Using Pure OOP

```java
public class StudentDemo {
    public static void main(String[] args) {
        // Create objects
        Student student1 = new Student("Alice", 20, 3.8);
        Student student2 = new Student("Bob", 19, 3.2);
        
        // Objects manage their own state
        student1.printInfo();
        student1.updateGpa(3.9);  // This actually updates the object's GPA
        student1.study();
        student1.printInfo();
        
        student2.printInfo();
        student2.study();
        student2.study();  // Study more!
        student2.printInfo();
    }
}
```

### Benefits of Pure OOP

1. **Encapsulation**: Data and methods are bundled together
2. **State Management**: Objects maintain their own state
3. **Reusability**: Objects can be easily reused
4. **Maintainability**: Changes are localized to classes
5. **Intuitive**: Mirrors real-world thinking about objects

---

## Summary
[⬆ Back to Top](#table-of-contents)

### Key Concepts Covered

**Classes and Objects**:
- Classes are blueprints, objects are instances
- Use the `new` keyword to create objects
- Objects have their own identity and state

**Memory Management**:
- Stack stores references and local variables
- Heap stores objects
- References point to objects in memory
- Null references point to nothing

**Instance Variables and Methods**:
- Instance variables belong to specific objects
- Instance methods operate on specific objects
- Default values are assigned automatically

**Encapsulation**:
- Use `private` to hide implementation details
- Provide `public` methods for controlled access
- Getters retrieve values, setters modify values

**Constructors**:
- Initialize objects when created
- Same name as class, no return type
- Can have multiple constructors (overloading)

**Initializer Blocks**:
- Run before constructors
- Useful for common initialization code
- Execute in order of appearance

**Order of Initialization**:
1. Default values assigned
2. Initializer blocks execute
3. Constructor executes

**The `final` Keyword**:
- Use `final` with variables to create constants
- Final variables cannot be reassigned after initialization
- Static final variables are class constants
- Final references prevent reassignment but allow object modification
- Improves code safety and readability

**Pure OOP**:
- Organize code around objects and their interactions
- Objects manage their own state and behavior
- More maintainable and reusable than procedural code

### Best Practices

1. Make instance variables `private`
2. Provide getters and setters for controlled access
3. Use meaningful names for classes, variables, and methods
4. Include a `toString` method for easy debugging
5. Validate input in setters and constructors
6. Use initializer blocks for complex initialization
7. Think in terms of objects and their responsibilities
8. Use `final` for constants and variables that shouldn't change
9. Follow naming conventions (ALL_CAPS for constants)
10. Use class constants (static final) for shared values

---

## Additional Resources
[⬆ Back to Top](#table-of-contents)

### Oracle Java Documentation
- [Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- [Object Creation](https://docs.oracle.com/javase/tutorial/java/javaOO/objectcreation.html)
- [Constructors](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)

### W3Schools Java References
- [Java Classes and Objects](https://www.w3schools.com/java/java_classes.asp)
- [Java Constructors](https://www.w3schools.com/java/java_constructors.asp)
- [Java Encapsulation](https://www.w3schools.com/java/java_encapsulation.asp)

### IntelliJ IDEA Tips
- Use Alt+Insert (Windows/Linux) or Cmd+N (Mac) to generate getters, setters, and constructors
- Use Ctrl+Alt+L (Windows/Linux) or Cmd+Alt+L (Mac) to format code
- Use Ctrl+Space for code completion

### Git and GitHub
- Remember to commit your work regularly
- Use descriptive commit messages
- Push your assignments to your GitHub repository

---

*Happy coding! Remember to practice these concepts by creating your own classes and experimenting with different designs.*
