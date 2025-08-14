# 📚 Teacher Lecture Notes – Boolean Variables, Boolean Operators, and Java 24 Operators

---

## 🔘 1. Boolean Variables

### Syntax:
```java
boolean isRaining = true;
boolean hasUmbrella = false;
```

- A boolean variable holds only two possible values: `true` or `false`.
- Common use: control flow in `if` statements.

**Example:**
```java
if (isRaining && hasUmbrella) {
    System.out.println("You're good to go!");
}
```

---

## ⚙️ 2. Boolean Operators

| Operator | Name  | Description                             | Example                     | Result |
|----------|--------|-----------------------------------------|-----------------------------|--------|
| `&&`     | AND   | true if both operands are true          | `true && false`             | false  |
| `||`    | OR    | true if at least one operand is true    | `true || false`             | true   |
| `!`      | NOT   | inverts the boolean value               | `!true`                     | false  |

**Example:**
```java
boolean isWeekend = true;
boolean isSunny = false;
System.out.println(isWeekend && isSunny); // false
System.out.println(!isWeekend);           // false
```

---

## 🧮 3. Comparison Operators

These are used to compare two values:

| Operator | Meaning               | Example        | Result  |
|----------|------------------------|----------------|---------|
| `==`     | Equal to              | `5 == 5`       | true    |
| `!=`     | Not equal to          | `3 != 4`       | true    |
| `>`      | Greater than          | `5 > 3`        | true    |
| `<`      | Less than             | `2 < 4`        | true    |
| `>=`     | Greater than or equal | `4 >= 4`       | true    |
| `<=`     | Less than or equal    | `3 <= 2`       | false   |

---

## 🧾 4. Assignment Operators

These assign values to variables.

| Operator | Example         | Equivalent          |
|----------|------------------|---------------------|
| `=`      | `x = 10`         | —                   |
| `+=`     | `x += 5`         | `x = x + 5`         |
| `-=`     | `x -= 2`         | `x = x - 2`         |
| `*=`     | `x *= 3`         | `x = x * 3`         |
| `/=`     | `x /= 2`         | `x = x / 2`         |
| `%=`     | `x %= 3`         | `x = x % 3`         |

---

## ➕ 5. Unary Operators

Operate on a single operand.

| Operator | Description               | Example        | Result |
|----------|---------------------------|----------------|--------|
| `+`      | Positive (unary plus)     | `+3`           | 3      |
| `-`      | Negation                  | `-5`           | -5     |
| `++`     | Increment by 1            | `x++`          | x = x+1|
| `--`     | Decrement by 1            | `x--`          | x = x-1|
| `!`      | Boolean NOT               | `!true`        | false  |
| `~`      | Bitwise complement        | `~5`           | -6     |

---

## ⚡ 6. Bitwise Operators

Operate on the bit level.

| Operator | Description                  |
|----------|------------------------------|
| `&`      | Bitwise AND                  |
| `|`      | Bitwise OR                   |
| `^`      | Bitwise XOR                  |
| `~`      | Bitwise Complement           |
| `<<`     | Left shift                   |
| `>>`     | Right shift (sign-propagating) |
| `>>>`    | Right shift (zero fill)      |

**Example:**
```java
int x = 5;   // 0101
int y = 3;   // 0011
System.out.println(x & y);  // 0001 → 1
System.out.println(x | y);  // 0111 → 7
```

---

## ❓ 7. Ternary Operator

Shorthand for `if-else`.

```java
String result = (grade >= 70) ? "Pass" : "Fail";
System.out.println(result);
```

---

## 🔍 8. `instanceof` (Pattern Matching from Java 16+)

Checks and casts in one step.

```java
Object obj = "Hello";
if (obj instanceof String s) {
    System.out.println("Length: " + s.length());
}
```

---

## 👨‍🏫 Teaching Strategies

- Show truth tables for AND, OR, and NOT
- Use small live demos to compare `==` and `=`
- Highlight operator precedence in multi-step expressions
- Use analogy: operators are the "verbs" of programming logic

---

## 🧠 Review Questions

1. What does `||` return if both operands are false?
2. Which operator lets you test a condition and return one of two values?
3. What does the following return?
```java
int a = 5, b = 2;
boolean result = (a > b) && (b < 1);
```

---

## 💡 Best Practices

- Use parentheses to clarify order:
  ```java
  if ((a > b) && (c < d)) { ... }
  ```

- Avoid chaining complex ternary expressions
- Only use bitwise if explicitly needed (i.e., flags or optimization)

---

## 🔚 Summary

- Boolean logic is the foundation for control flow
- Java has a rich set of operators beyond arithmetic
- Understanding all operator types prepares students for advanced decision-making and efficient coding
