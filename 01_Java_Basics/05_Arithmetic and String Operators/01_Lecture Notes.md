# 📚 Teacher Lecture Notes - Day 04: Arithmetic Operators, String Operators, Java Math Class

---

## ➕ 1. Arithmetic Operators

Java supports five basic arithmetic operators for numeric data types like `int` and `double`.

| Operator | Name          | Example             | Output |
|----------|---------------|---------------------|--------|
| `+`      | Addition       | `5 + 3`             | 8      |
| `-`      | Subtraction    | `10 - 4`            | 6      |
| `*`      | Multiplication | `6 * 2`             | 12     |
| `/`      | Division       | `8 / 2`             | 4      |
| `%`      | Modulus        | `10 % 3`            | 1      |

**Code Example:**
```java
int a = 15;
int b = 4;

System.out.println("a + b = " + (a + b));
System.out.println("a - b = " + (a - b));
System.out.println("a * b = " + (a * b));
System.out.println("a / b = " + (a / b)); // int division
System.out.println("a % b = " + (a % b)); // remainder
```

---

## 🧵 2. String Operators

Java allows string concatenation using the `+` operator.

```java
String first = "Hello";
String second = "World";
System.out.println(first + " " + second); // Hello World
```

You can also use `+=`:

```java
String name = "Alex";
name += " Smith";
System.out.println(name); // Alex Smith
```

⚠️ When mixing strings and numbers, Java converts the number to a string:

```java
System.out.println("Score: " + 90); // Score: 90
System.out.println("2 + 3 = " + 2 + 3);   // 2 + 3 = 23
System.out.println("2 + 3 = " + (2 + 3)); // 2 + 3 = 5
```

---

## 🧮 3. Java Math Class

The `Math` class provides many built-in methods to perform advanced calculations.

| Method            | Description                     | Example                   |
|-------------------|---------------------------------|---------------------------|
| `Math.abs(x)`     | Absolute value                  | `Math.abs(-5)` → 5        |
| `Math.pow(x, y)`  | x raised to the power y         | `Math.pow(2, 3)` → 8.0    |
| `Math.sqrt(x)`    | Square root                     | `Math.sqrt(16)` → 4.0     |
| `Math.max(x, y)`  | Larger of two values            | `Math.max(5, 8)` → 8      |
| `Math.min(x, y)`  | Smaller of two values           | `Math.min(5, 8)` → 5      |
| `Math.round(x)`   | Round to nearest whole number   | `Math.round(3.6)` → 4     |
| `Math.random()`   | Random double (0.0 to < 1.0)    | `Math.random()` → 0.75    |

**Code Example:**
```java
double radius = 4.5;
double area = Math.PI * Math.pow(radius, 2);
System.out.println("Area: " + area);
```

### Generate a Random Number Between 1 and 10
```java
int randomNum = (int)(Math.random() * 10) + 1;
System.out.println("Lucky number: " + randomNum);
```

---

## 🧠 Practice Problems (For Live Demo or Guided Practice)

1. Calculate the result of each expression:
   - `5 + 2 * 3`
   - `(5 + 2) * 3`
   - `10 % 4`
   - `"Java" + 5 + 10`

2. Use the `Math` class to:
   - Find the square root of 81
   - Round the number 4.78
   - Get the maximum of 12 and 18

3. Write a method that takes two numbers and prints:
   - Their sum
   - Their difference
   - Their product
   - Which one is bigger

---

## 📌 Teaching Tips

- Emphasize integer vs floating point division:
  ```java
  System.out.println(5 / 2); // 2 (int)
  System.out.println(5.0 / 2); // 2.5 (double)
  ```
- Use parentheses to control order of operations
- For string concatenation, demonstrate how parentheses change output
- Let students experiment with `Math.random()` to simulate dice or coin flips

---

## ❓ Review Questions

1. What operator do you use to get the remainder in division?
2. What’s the difference between `System.out.println("2" + 3);` and `System.out.println(2 + 3);`?
3. What does `Math.pow(2, 4)` return?

---

## 📊 Full List of Java Arithmetic and String Operators

### 🔢 Arithmetic Operators

These operators are used for performing mathematical calculations on numeric data types.

| Operator | Name          | Example         | Result | Description                        |
|----------|---------------|-----------------|--------|------------------------------------|
| `+`      | Addition      | `5 + 3`         | 8      | Adds two numbers                   |
| `-`      | Subtraction   | `9 - 2`         | 7      | Subtracts second number from first|
| `*`      | Multiplication| `4 * 2`         | 8      | Multiplies two numbers             |
| `/`      | Division      | `10 / 2`        | 5      | Divides numerator by denominator  |
| `%`      | Modulus       | `10 % 3`        | 1      | Remainder after division           |
| `++`     | Increment     | `x++` or `++x`  | x + 1  | Increases value by 1               |
| `--`     | Decrement     | `x--` or `--x`  | x - 1  | Decreases value by 1               |

### Example:
```java
int x = 5;
x++;
System.out.println(x); // 6
```

---

### 🧵 String Operators

Java only has one string operator: `+` for **concatenation**.

| Operator | Description                                  | Example                     | Output            |
|----------|----------------------------------------------|-----------------------------|-------------------|
| `+`      | Concatenates strings                         | `"Hello " + "World"`        | `"Hello World"`   |
| `+=`     | Appends and assigns                          | `name += " Smith"`          | `"John Smith"`    |

⚠️ Note: When using `+` with strings and numbers, Java will convert numbers to strings **if** the first value is a string.

```java
System.out.println("Age: " + 17);        // Age: 17
System.out.println(5 + 5 + " apples");   // 10 apples
System.out.println("apples " + 5 + 5);   // apples 55
```

Use parentheses to control order:
```java
System.out.println("apples " + (5 + 5)); // apples 10
```