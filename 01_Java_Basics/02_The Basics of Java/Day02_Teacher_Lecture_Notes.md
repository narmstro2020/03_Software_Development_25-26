# 📚 Teacher Lecture Notes - Day 02: Java Basics

## 🧱 Basic Java Structure

Every Java program starts with a class definition. The `main` method is the entry point of the program.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

### Key Terms:
- `class`: Blueprint from which objects are created. All code must be inside a class.
- `public`: An access modifier meaning the method/class is accessible by any other class.
- `static`: Means the method belongs to the class, not instances of it.
- `void`: Return type; it means this method does not return anything.
- `main`: Special method that serves as the entry point.
- `String[] args`: Used to receive command-line arguments.

---

## 🔢 Variables

### Declaration and Initialization
A variable is a container for storing data values.

**Syntax:**
```java
type variableName = value;
```

Example:
```java
int age = 16;
double height = 5.9;
```

---

## 🧮 Primitive Data Types

Java has 8 primitive types:

| Type     | Size     | Description                 | Example        |
|----------|----------|-----------------------------|----------------|
| `byte`   | 8-bit    | Small integers               | `byte b = 100;`|
| `short`  | 16-bit   | Larger integers              | `short s = 1000;`|
| `int`    | 32-bit   | Standard integers            | `int age = 18;`|
| `long`   | 64-bit   | Very large integers          | `long bigNum = 123456789L;`|
| `float`  | 32-bit   | Decimal values (less precise)| `float f = 3.14f;`|
| `double` | 64-bit   | Decimal values (precise)     | `double d = 3.14159;`|
| `char`   | 16-bit   | Single Unicode characters    | `char c = 'A';`|
| `boolean`| 1-bit    | `true` or `false`            | `boolean isJavaFun = true;`|

---

## 🧾 Reference Types

Reference types store the memory address of an object.

- Common examples: `String`, arrays, classes
- Unlike primitives, reference types can be `null`

**Example:**
```java
String name = "Jordan";
int[] scores = {90, 80, 85};
```

---

## 🔁 Summary of Differences

| Primitive Type         | Reference Type            |
|------------------------|---------------------------|
| Stores actual value     | Stores memory address     |
| Cannot be `null`        | Can be `null`             |
| Faster access           | Slower (heap allocated)   |
| Examples: `int`, `char` | Examples: `String`, array |

---

## 👩‍🏫 Instructional Tips

- Use the analogy of LEGO bricks (primitives) vs. LEGO instructions (reference types)
- Reinforce syntax rules like semicolons and braces
- Watch for common mistakes:
  - Forgetting `;` at the end of a line
  - Case sensitivity (`String` vs `string`)
  - Using `==` with `String` instead of `.equals()`

## 📌 Checks for Understanding

- Ask: “What happens if I remove the `main` method?”
- Pair up students and let them write one primitive and one reference type
- Live code demo with print statements for variable values

## 🧠 Extension

- Advanced: Introduce `var` keyword (Java 10+)
- Add a custom method and call it from `main`

---

## 📋 Exit Questions to Reinforce

1. What are the two main types of data in Java?
2. Why is the `main` method important?
3. What’s one thing you learned today that was new?