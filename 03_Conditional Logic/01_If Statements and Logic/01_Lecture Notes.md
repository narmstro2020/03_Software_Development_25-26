# Java If Statements and Basic Boolean Logic
## Lecture Notes

---

## Table of Contents

| Topic | Description |
|-------|-------------|
| [1. If, Else If, and Else in Java](#1-if-else-if-and-else-in-java) | Basic conditional statements and syntax |
| [2. Flowcharting](#2-flowcharting) | Visual representation of program flow |
| [3. Boolean Logic Truth Tables](#3-boolean-logic-truth-tables) | Understanding logical operations |
| [4. De Morgan's Laws](#4-de-morgans-laws) | Advanced boolean logic principles |
| [Vocabulary](#vocabulary) | Key terms and definitions |
| [Code Examples](#code-examples) | Practical implementations |
| [Summary](#summary) | Key takeaways |
| [Additional Resources](#additional-resources) | Documentation and references |

---

## Vocabulary

**Conditional Statement**: A programming construct that performs different actions based on whether a condition is true or false.

**Boolean Expression**: An expression that evaluates to either `true` or `false`.

**If Statement**: A conditional statement that executes code only if a specified condition is true.

**Else Statement**: A statement that executes code when the if condition is false.

**Else If Statement**: A statement that checks additional conditions when the previous if/else if conditions are false.

**Flowchart**: A visual diagram that shows the flow of control through a program.

**Truth Table**: A table that shows all possible combinations of inputs and their corresponding outputs for logical operations.

**De Morgan's Laws**: Mathematical rules that describe how to distribute negation over logical AND and OR operations.

**Logical Operators**: Operators that work with boolean values (`&&`, `||`, `!`).

**Comparison Operators**: Operators that compare values and return boolean results (`==`, `!=`, `<`, `>`, `<=`, `>=`).

[↑ Back to Top](#java-if-statements-and-basic-boolean-logic)

---

## 1. If, Else If, and Else in Java

### Basic If Statement

The `if` statement is the most fundamental conditional statement in Java. It executes a block of code only if a specified condition evaluates to `true`.

**Syntax:**
```java
if (condition) {
    // Code to execute if condition is true
}
```

**Example:**
```java
int age = 18;
if (age >= 18) {
    System.out.println("You are eligible to vote!");
}
```

### If-Else Statement

The `else` statement provides an alternative path when the `if` condition is `false`.

**Syntax:**
```java
if (condition) {
    // Code to execute if condition is true
} else {
    // Code to execute if condition is false
}
```

**Example:**
```java
int temperature = 75;
if (temperature > 80) {
    System.out.println("It's hot outside!");
} else {
    System.out.println("It's not too hot outside.");
}
```

### If-Else If-Else Statement

When you need to check multiple conditions, you can chain `else if` statements together.

**Syntax:**
```java
if (condition1) {
    // Code for condition1
} else if (condition2) {
    // Code for condition2
} else if (condition3) {
    // Code for condition3
} else {
    // Default code if none of the above conditions are true
}
```

**Example:**
```java
int grade = 85;
if (grade >= 90) {
    System.out.println("Grade: A");
} else if (grade >= 80) {
    System.out.println("Grade: B");
} else if (grade >= 70) {
    System.out.println("Grade: C");
} else if (grade >= 60) {
    System.out.println("Grade: D");
} else {
    System.out.println("Grade: F");
}
```

### Nested If Statements

You can place if statements inside other if statements to create more complex logic.

**Example:**
```java
boolean isWeekend = true;
boolean isRaining = false;

if (isWeekend) {
    if (isRaining) {
        System.out.println("Stay inside and read a book!");
    } else {
        System.out.println("Go outside and enjoy the weekend!");
    }
} else {
    System.out.println("It's a weekday, time to work!");
}
```

### Using Boolean Variables and Operators

You can use boolean variables and operators (`&&`, `||`, `!`) to create complex conditions.

**Example:**
```java
boolean hasLicense = true;
boolean hasInsurance = true;
int age = 20;

if (hasLicense && hasInsurance && age >= 18) {
    System.out.println("You can drive legally!");
} else {
    System.out.println("You cannot drive legally.");
}
```

[↑ Back to Top](#java-if-statements-and-basic-boolean-logic)

---

## 2. Flowcharting

Flowcharts are visual representations that show the flow of control through a program. They help us understand and plan the logic before writing code.

### Basic Flowchart Symbols

- **Oval**: Start/End (Terminal)
- **Rectangle**: Process/Action
- **Diamond**: Decision/Condition
- **Parallelogram**: Input/Output
- **Arrow**: Flow direction

### Simple If Statement Flowchart

```
    [START]
       |
   [Read Input]
       |
   <Condition?>
    /        \
  Yes         No
   |           |
[Execute     [Skip to
 Action]      Next]
   |           |
    \         /
     \       /
   [Continue Program]
       |
     [END]
```

### If-Else Statement Flowchart

```
    [START]
       |
   [Read Input]
       |
   <Condition?>
    /        \
  Yes         No
   |           |
[Action A]  [Action B]
   |           |
    \         /
     \       /
   [Continue Program]
       |
     [END]
```

### Nested If Statement Example

Let's create a flowchart for determining if someone can vote based on age and citizenship:

```
    [START]
       |
   [Input age, citizenship]
       |
    <age >= 18?>
    /         \
  Yes          No
   |            |
<Is citizen?>   |
  /       \     |
Yes       No    |
 |         |    |
[Can Vote] |    |
 |         |    |
  \        |    |
   \       |    |
    \   [Cannot Vote]
     \      |    |
      \     |   /
       \    |  /
        \   | /
      [Display Result]
           |
         [END]
```

[↑ Back to Top](#java-if-statements-and-basic-boolean-logic)

---

## 3. Boolean Logic Truth Tables

Truth tables show all possible combinations of boolean inputs and their corresponding outputs for logical operations.

### AND Operator (&&)

The AND operator returns `true` only when both operands are `true`.

| A     | B     | A && B |
|-------|-------|--------|
| true  | true  | true   |
| true  | false | false  |
| false | true  | false  |
| false | false | false  |

**Example:**
```java
boolean hasKey = true;
boolean hasPermission = false;
boolean canEnter = hasKey && hasPermission; // false
```

### OR Operator (||)

The OR operator returns `true` when at least one operand is `true`.

| A     | B     | A \|\| B |
|-------|-------|----------|
| true  | true  | true     |
| true  | false | true     |
| false | true  | true     |
| false | false | false    |

**Example:**
```java
boolean isWeekend = true;
boolean isHoliday = false;
boolean noWork = isWeekend || isHoliday; // true
```

### NOT Operator (!)

The NOT operator inverts the boolean value.

| A     | !A    |
|-------|-------|
| true  | false |
| false | true  |

**Example:**
```java
boolean isRaining = false;
boolean isSunny = !isRaining; // true
```

### Complex Truth Table Example

For the expression: `(A && B) || (!A && C)`

| A     | B     | C     | A && B | !A    | !A && C | (A && B) \|\| (!A && C) |
|-------|-------|-------|--------|-------|---------|-------------------------|
| true  | true  | true  | true   | false | false   | true                    |
| true  | true  | false | true   | false | false   | true                    |
| true  | false | true  | false  | false | false   | false                   |
| true  | false | false | false  | false | false   | false                   |
| false | true  | true  | false  | true  | true    | true                    |
| false | true  | false | false  | true  | false   | false                   |
| false | false | true  | false  | true  | true    | true                    |
| false | false | false | false  | true  | false   | false                   |

[↑ Back to Top](#java-if-statements-and-basic-boolean-logic)

---

## 4. De Morgan's Laws

De Morgan's Laws are fundamental principles in boolean logic that describe how to distribute negation over AND and OR operations.

### First Law: !(A && B) = !A || !B

"The negation of (A AND B) equals (NOT A) OR (NOT B)"

**Truth Table:**

| A     | B     | A && B | !(A && B) | !A    | !B    | !A \|\| !B |
|-------|-------|--------|-----------|-------|-------|------------|
| true  | true  | true   | false     | false | false | false      |
| true  | false | false  | true      | false | true  | true       |
| false | true  | false  | true      | true  | false | true       |
| false | false | false  | true      | true  | true  | true       |

**Java Example:**
```java
boolean hasHomework = true;
boolean hasTest = true;

// These two expressions are equivalent:
boolean notBusyMethod1 = !(hasHomework && hasTest);
boolean notBusyMethod2 = !hasHomework || !hasTest;

System.out.println(notBusyMethod1 == notBusyMethod2); // true
```

### Second Law: !(A || B) = !A && !B

"The negation of (A OR B) equals (NOT A) AND (NOT B)"

**Truth Table:**

| A     | B     | A \|\| B | !(A \|\| B) | !A    | !B    | !A && !B |
|-------|-------|----------|-------------|-------|-------|----------|
| true  | true  | true     | false       | false | false | false    |
| true  | false | true     | false       | false | true  | false    |
| false | true  | true     | false       | true  | false | false    |
| false | false | false    | true        | true  | true  | true     |

**Java Example:**
```java
boolean isWeekend = false;
boolean isHoliday = false;

// These two expressions are equivalent:
boolean mustWorkMethod1 = !(isWeekend || isHoliday);
boolean mustWorkMethod2 = !isWeekend && !isHoliday;

System.out.println(mustWorkMethod1 == mustWorkMethod2); // true
```

### Practical Application

De Morgan's Laws are useful for simplifying complex boolean expressions and making code more readable.

**Before applying De Morgan's Law:**
```java
if (!(age >= 18 && hasLicense)) {
    System.out.println("Cannot drive");
}
```

**After applying De Morgan's Law:**
```java
if (age < 18 || !hasLicense) {
    System.out.println("Cannot drive");
}
```

The second version is often more intuitive to read.

[↑ Back to Top](#java-if-statements-and-basic-boolean-logic)

---

## Code Examples

### Example 1: Grade Calculator

```java
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your numerical grade: ");
        int grade = scanner.nextInt();
        
        String letterGrade;
        
        if (grade >= 90) {
            letterGrade = "A";
        } else if (grade >= 80) {
            letterGrade = "B";
        } else if (grade >= 70) {
            letterGrade = "C";
        } else if (grade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        
        System.out.println("Your letter grade is: " + letterGrade);
        
        // Determine if passing
        if (grade >= 60) {
            System.out.println("Congratulations! You passed!");
        } else {
            System.out.println("Sorry, you did not pass. Please try again.");
        }
        
        scanner.close();
    }
}
```

### Example 2: Login System

```java
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String correctUsername = "admin";
        String correctPassword = "password123";
        
        System.out.print("Enter username: ");
        String username = scanner.next();
        
        System.out.print("Enter password: ");
        String password = scanner.next();
        
        boolean validUsername = username.equals(correctUsername);
        boolean validPassword = password.equals(correctPassword);
        
        if (validUsername && validPassword) {
            System.out.println("Login successful! Welcome!");
        } else if (!validUsername && !validPassword) {
            System.out.println("Both username and password are incorrect.");
        } else if (!validUsername) {
            System.out.println("Username is incorrect.");
        } else {
            System.out.println("Password is incorrect.");
        }
        
        scanner.close();
    }
}
```

### Example 3: Number Guessing Game

```java
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Generate random number between 1 and 100
        int targetNumber = (int)(Math.random() * 100) + 1;
        
        System.out.println("I'm thinking of a number between 1 and 100!");
        System.out.print("Enter your guess: ");
        int guess = scanner.nextInt();
        
        if (guess == targetNumber) {
            System.out.println("Congratulations! You guessed it!");
        } else if (guess < targetNumber) {
            System.out.println("Too low! The number was " + targetNumber);
        } else {
            System.out.println("Too high! The number was " + targetNumber);
        }
        
        // Determine how close the guess was
        int difference = Math.abs(guess - targetNumber);
        
        if (difference == 0) {
            System.out.println("Perfect guess!");
        } else if (difference <= 5) {
            System.out.println("Very close!");
        } else if (difference <= 15) {
            System.out.println("Close!");
        } else {
            System.out.println("Not very close.");
        }
        
        scanner.close();
    }
}
```

[↑ Back to Top](#java-if-statements-and-basic-boolean-logic)

---

## Summary

### Key Concepts Learned

1. **If Statements**: Execute code conditionally based on boolean expressions
   - Basic if: `if (condition) { }`
   - If-else: `if (condition) { } else { }`
   - If-else if-else: Multiple condition checking

2. **Flowcharting**: Visual representation of program logic using standard symbols
   - Helps plan program structure before coding
   - Makes complex logic easier to understand

3. **Boolean Logic Truth Tables**: Systematic way to understand logical operations
   - AND (&&): True only when both operands are true
   - OR (||): True when at least one operand is true
   - NOT (!): Inverts the boolean value

4. **De Morgan's Laws**: Rules for transforming boolean expressions
   - `!(A && B) = !A || !B`
   - `!(A || B) = !A && !B`
   - Useful for simplifying complex conditions

### Best Practices

- Always use braces `{}` even for single-line if statements
- Keep conditions simple and readable
- Use boolean variables to make complex conditions more understandable
- Consider using De Morgan's Laws to simplify negative conditions
- Plan your logic with flowcharts for complex decision trees

### Common Mistakes to Avoid

- Using `=` instead of `==` for comparison
- Forgetting to handle all possible cases
- Creating overly complex nested conditions
- Not considering edge cases in your logic

[↑ Back to Top](#java-if-statements-and-basic-boolean-logic)

---

## Additional Resources

### Java Documentation
- [Oracle Java Documentation - Control Flow Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [Java Operators Documentation](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)

### W3Schools References
- [Java If...Else](https://www.w3schools.com/java/java_conditions.asp)
- [Java Booleans](https://www.w3schools.com/java/java_booleans.asp)
- [Java Operators](https://www.w3schools.com/java/java_operators.asp)

### Tools Used in This Course
- **IntelliJ IDEA**: Primary IDE for Java development
- **Git**: Version control system
- **GitHub**: Repository hosting and collaboration

### Practice Resources
- Practice boolean logic with online truth table generators
- Create flowcharts using tools like Lucidchart or draw.io
- Work through additional conditional logic problems

[↑ Back to Top](#java-if-statements-and-basic-boolean-logic)

---

*End of Lecture Notes*