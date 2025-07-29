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
---

## 🧠 Deep Dive: `main` Method Anatomy

The `main` method in Java has this exact signature:
```java
public static void main(String[] args)
```

### Why This Format?

- `public`: The JVM (Java Virtual Machine) must be able to access it from outside the class.
- `static`: It must run without creating an object of the class.
- `void`: It doesn’t return a value.
- `String[] args`: Command-line arguments passed when running the program.

### Analogy:
- Think of `main` like the "ignition key" that starts your car — without it, the engine (your code) won't run.

---

## 🧠 Analogy: Primitive vs Reference Types

- **Primitive = Actual Thing**
  - `int age = 16;` → like handing someone the number "16" on a card
- **Reference = Address to a Thing**
  - `String name = "Alex";` → like handing someone a locker number that holds a note with “Alex” on it

---

## 💡 Common Errors and Misconceptions

| Mistake | Why it Happens | Fix |
|--------|----------------|-----|
| Forgetting semicolons | New to syntax | Remind that every statement ends with `;` |
| Misspelling `System.out.println` | Long & case-sensitive | Use autocomplete in IDE |
| Using `==` for strings | Comes from comparing primitives | Use `.equals()` for strings |
| Mixing types | e.g., `int x = "hello";` | Java is statically typed | Explain types must match |

---

## 📈 Enrichment Ideas for Fast Finishers

- Ask students to create a second method:
  ```java
  public static void printFavoriteSubject() {
      System.out.println("My favorite subject is Computer Science!");
  }
  ```
  and call it from `main()`

- Let advanced students research `var` (Java 10+)

---

## 🎯 Sample Assessment Questions

1. What is the difference between `int` and `String`?
2. What does `static` mean in the `main` method?
3. Write a Java statement that declares and initializes a boolean called `isReady`.

---

## 🧑‍💼 Teacher Strategy Tips

- Encourage students to speak Java syntax out loud (“int age equals 17 semicolon”)
- Use colored pens or markers when drawing memory diagrams for reference vs primitive
- Pair up students for peer-teaching at the end: “Teach your partner one thing you learned.”