# 📚 Teacher Lecture Notes - Day 03: Output, Input, Comments, null, Casting, Wrapper Classes

---

## 🖨️ 1. Java Output

Java uses the `System.out` object to print text to the console.

```java
System.out.print("Hello");
System.out.println(" world!");
```

- `print()` keeps the cursor on the same line
- `println()` adds a newline after printing

---

## 🎤 2. Java Input with Scanner

To take user input, we use the `Scanner` class from the `java.util` package.

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
```

Common Scanner methods:
| Method           | Description           |
|------------------|-----------------------|
| `nextLine()`     | Reads a full line     |
| `nextInt()`      | Reads an int          |
| `nextDouble()`   | Reads a double        |
| `nextBoolean()`  | Reads a boolean       |

---

## 💬 3. Comments in Java

**Single-line comment:**

```java
// This is a single-line comment
```

**Multi-line comment:**

```java
/*
  This is a multi-line comment
  used for longer explanations.
*/
```

---

## 🕳️ 4. null for Reference Types

- Only reference types can be `null`
- If you try to access a method/field of a `null` object, you'll get a `NullPointerException`

```java
String message = null;

if (message == null) {
    System.out.println("No message found.");
}
```

---

## 🔁 5. Type Casting

### Implicit Casting (Widening):
```java
int x = 10;
double y = x;  // int to double
```

### Explicit Casting (Narrowing):
```java
double pi = 3.14;
int approx = (int) pi;  // double to int
```

- Casting is used when converting between compatible primitive types

---

## 📦 6. Wrapper Classes

Java has wrapper classes for each primitive type, enabling objects instead of primitives.

| Primitive | Wrapper    |
|-----------|------------|
| `int`     | `Integer`  |
| `double`  | `Double`   |
| `boolean` | `Boolean`  |
| `char`    | `Character`|
| `byte`    | `Byte`     |
| `short`   | `Short`    |
| `long`    | `Long`     |
| `float`   | `Float`    |

### Autoboxing

```java
Integer x = 10;  // primitive int to Integer
```

### Unboxing

```java
int y = x;  // Integer to primitive int
```

### Conversions with Wrapper Methods

```java
String s = "42";
int i = Integer.parseInt(s);

double d = Double.valueOf("3.14");
boolean b = Boolean.parseBoolean("true");
```

---



## 🧠 Teaching Tips

- Use pseudocode or sketch diagrams for type conversion
- Create reference vs. primitive memory diagrams
- Emphasize `.parseXxx()` and `valueOf()` for common parsing tasks

---

## ❓ Review Questions

1. What's the difference between `print` and `println`?
2. What happens when you try to use a null reference?
3. How do wrapper classes support parsing from strings?