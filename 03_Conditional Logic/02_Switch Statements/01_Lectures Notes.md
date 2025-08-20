# Java Switch Statements - Lecture Notes

## Table of Contents
- [Introduction](#introduction)
- [Vocabulary](#vocabulary)
- [1. Switch Statements](#1-switch-statements)
- [2. Enhanced Switch Statements](#2-enhanced-switch-statements)
- [Code Examples](#code-examples)
- [Visual Aids](#visual-aids)
- [Summary](#summary)
- [Additional Resources](#additional-resources)

---

## Introduction
[↑ Back to Top](#java-switch-statements---lecture-notes)

Welcome to our lesson on Java Switch Statements! In this lesson, we'll explore how to use switch statements as an alternative to multiple if-else statements when dealing with discrete values. We'll cover both traditional switch statements and the enhanced switch expressions introduced in newer versions of Java.

**Prerequisites:** This lesson assumes you understand Java basics including printing, the main method, Scanner, comments, null, casting, wrapper classes, arithmetic operators, string operators, the Math class, Math.random, creating methods, boolean variables, and boolean operators.

**Tools Used:** IntelliJ IDEA, Git, GitHub

---

## Vocabulary
[↑ Back to Top](#java-switch-statements---lecture-notes)

- **Switch Statement**: A control flow statement that allows a variable to be tested for equality against a list of values
- **Case**: A specific value that the switch variable is compared against
- **Break**: A keyword used to exit a switch statement and prevent fall-through
- **Default**: A catch-all case that executes when no other cases match
- **Fall-through**: When execution continues from one case to the next without a break statement
- **Switch Expression**: An enhanced form of switch that returns a value (Java 12+)
- **Arrow Syntax**: The `->` operator used in enhanced switch statements
- **Yield**: A keyword used to return a value from a switch expression

---

## 1. Switch Statements
[↑ Back to Top](#java-switch-statements---lecture-notes)

### What is a Switch Statement?

A switch statement is a control structure that allows you to execute different blocks of code based on the value of a variable. It's often used as a cleaner alternative to multiple if-else statements when you need to compare a variable against several specific values.

### Basic Syntax

```java
switch (variable) {
    case value1:
        // code to execute if variable equals value1
        break;
    case value2:
        // code to execute if variable equals value2
        break;
    case value3:
        // code to execute if variable equals value3
        break;
    default:
        // code to execute if no cases match
        break;
}
```

### Detailed Explanation

1. **Switch Expression**: The variable or expression in parentheses after `switch`
2. **Case Labels**: Each `case` keyword followed by a value
3. **Break Statements**: Prevent fall-through to the next case
4. **Default Case**: Optional catch-all for unmatched values

### Data Types Supported

Switch statements work with:
- `int` and `Integer`
- `byte` and `Byte`
- `short` and `Short`
- `char` and `Character`
- `String` (Java 7+)
- `enum` types

### Example 1: Basic Switch with int

```java
public class BasicSwitch {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        String dayName;
        
        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        
        System.out.println("Day " + dayOfWeek + " is " + dayName);
    }
}
```

### Example 2: Switch with String

```java
import java.util.Scanner;

public class StringSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a grade letter (A, B, C, D, F): ");
        String grade = scanner.nextLine().toUpperCase();
        
        switch (grade) {
            case "A":
                System.out.println("Excellent! GPA: 4.0");
                break;
            case "B":
                System.out.println("Good! GPA: 3.0");
                break;
            case "C":
                System.out.println("Average. GPA: 2.0");
                break;
            case "D":
                System.out.println("Below Average. GPA: 1.0");
                break;
            case "F":
                System.out.println("Failing. GPA: 0.0");
                break;
            default:
                System.out.println("Invalid grade entered.");
                break;
        }
        
        scanner.close();
    }
}
```

### Fall-through Behavior

When you omit the `break` statement, execution "falls through" to the next case:

```java
public class FallThroughExample {
    public static void main(String[] args) {
        char grade = 'B';
        
        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Great job!");
                break;
            case 'C':
                System.out.println("Good work!");
                break;
            case 'D':
            case 'F':
                System.out.println("Need improvement!");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
```

### Switch vs If-Else Comparison

**Using if-else:**
```java
if (day == 1) {
    dayName = "Monday";
} else if (day == 2) {
    dayName = "Tuesday";
} else if (day == 3) {
    dayName = "Wednesday";
} else if (day == 4) {
    dayName = "Thursday";
} else if (day == 5) {
    dayName = "Friday";
} else if (day == 6) {
    dayName = "Saturday";
} else if (day == 7) {
    dayName = "Sunday";
} else {
    dayName = "Invalid day";
}
```

**Using switch:**
```java
switch (day) {
    case 1: dayName = "Monday"; break;
    case 2: dayName = "Tuesday"; break;
    case 3: dayName = "Wednesday"; break;
    case 4: dayName = "Thursday"; break;
    case 5: dayName = "Friday"; break;
    case 6: dayName = "Saturday"; break;
    case 7: dayName = "Sunday"; break;
    default: dayName = "Invalid day"; break;
}
```

---

## 2. Enhanced Switch Statements
[↑ Back to Top](#java-switch-statements---lecture-notes)

### What are Enhanced Switch Statements?

Enhanced switch statements (introduced in Java 12 as a preview feature and standardized in Java 14) provide a more concise and expressive syntax. They eliminate the need for break statements and can return values directly.

### Arrow Syntax

The enhanced switch uses the arrow operator (`->`) instead of colons and doesn't require break statements:

```java
switch (variable) {
    case value1 -> {
        // code to execute
    }
    case value2 -> {
        // code to execute
    }
    default -> {
        // default code
    }
}
```

### Switch Expressions

Enhanced switches can return values directly:

```java
String result = switch (variable) {
    case value1 -> "Result 1";
    case value2 -> "Result 2";
    default -> "Default result";
};
```

### Example 1: Enhanced Switch with Arrow Syntax

```java
public class EnhancedSwitchBasic {
    public static void main(String[] args) {
        int dayOfWeek = 3;
        
        String dayName = switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        
        System.out.println("Day " + dayOfWeek + " is " + dayName);
    }
}
```

### Example 2: Enhanced Switch with Blocks

```java
import java.util.Scanner;

public class EnhancedSwitchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");
        int month = scanner.nextInt();
        
        String season = switch (month) {
            case 12, 1, 2 -> {
                System.out.println("It's cold outside!");
                yield "Winter";
            }
            case 3, 4, 5 -> {
                System.out.println("Flowers are blooming!");
                yield "Spring";
            }
            case 6, 7, 8 -> {
                System.out.println("Time for vacation!");
                yield "Summer";
            }
            case 9, 10, 11 -> {
                System.out.println("Leaves are changing colors!");
                yield "Fall";
            }
            default -> {
                System.out.println("Invalid month!");
                yield "Unknown";
            }
        };
        
        System.out.println("Season: " + season);
        scanner.close();
    }
}
```

### Example 3: Multiple Case Labels

Enhanced switches allow multiple case labels in a single case:

```java
public class MultipleCaseLabels {
    public static void main(String[] args) {
        char grade = 'B';
        
        String message = switch (grade) {
            case 'A', 'a' -> "Excellent work!";
            case 'B', 'b' -> "Good job!";
            case 'C', 'c' -> "Satisfactory.";
            case 'D', 'd' -> "Needs improvement.";
            case 'F', 'f' -> "Please see me after class.";
            default -> "Invalid grade.";
        };
        
        System.out.println(message);
    }
}
```

### Using Yield in Switch Expressions

The `yield` keyword is used to return a value from a switch expression when using block syntax:

```java
public class YieldExample {
    public static void main(String[] args) {
        int number = 42;
        
        String description = switch (number % 2) {
            case 0 -> {
                System.out.println("Processing even number: " + number);
                yield "Even";
            }
            case 1 -> {
                System.out.println("Processing odd number: " + number);
                yield "Odd";
            }
            default -> {
                System.out.println("This should never happen");
                yield "Unknown";
            }
        };
        
        System.out.println("The number " + number + " is " + description);
    }
}
```

### Method with Enhanced Switch

```java
public class SwitchMethods {
    public static void main(String[] args) {
        System.out.println(getDayType(1)); // Weekday
        System.out.println(getDayType(6)); // Weekend
        System.out.println(getNumberWord(5)); // Five
    }
    
    public static String getDayType(int dayOfWeek) {
        return switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
    }
    
    public static String getNumberWord(int number) {
        return switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            default -> "Other";
        };
    }
}
```

---

## Code Examples
[↑ Back to Top](#java-switch-statements---lecture-notes)

### Complete Calculator Example

```java
import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter operation (+, -, *, /): ");
        String operation = scanner.next();
        
        // Traditional switch
        double result = 0;
        boolean validOperation = true;
        
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operation!");
                validOperation = false;
                break;
        }
        
        if (validOperation) {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        }
        
        scanner.close();
    }
}
```

### Enhanced Calculator Example

```java
import java.util.Scanner;

public class EnhancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Enter operation (+, -, *, /): ");
        String operation = scanner.next();
        
        // Enhanced switch expression
        String result = switch (operation) {
            case "+" -> String.valueOf(num1 + num2);
            case "-" -> String.valueOf(num1 - num2);
            case "*" -> String.valueOf(num1 * num2);
            case "/" -> {
                if (num2 != 0) {
                    yield String.valueOf(num1 / num2);
                } else {
                    yield "Error: Division by zero!";
                }
            }
            default -> "Error: Invalid operation!";
        };
        
        if (!result.startsWith("Error")) {
            System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
        } else {
            System.out.println(result);
        }
        
        scanner.close();
    }
}
```

---

## Visual Aids
[↑ Back to Top](#java-switch-statements---lecture-notes)

### Switch Statement Flow Chart

```
        [Start]
           |
    [Evaluate switch expression]
           |
    [Compare with case 1] → [Match?] → Yes → [Execute case 1] → [Break?] → Yes → [End]
           |                   |                    |             |
           No                  |                    |             No
           |                   |                    |             |
    [Compare with case 2] → [Match?] → Yes → [Execute case 2] → [Continue to next case]
           |                   |
           No                  |
           |                   |
    [Compare with case n] → [Match?] → Yes → [Execute case n] → [Break?] → Yes → [End]
           |                   |                    |             |
           No                  |                    |             No
           |                   |                    |             |
    [Execute default case] ←────┘                   |             |
           |                                        |             |
        [End] ←──────────────────────────────────────────────────┘
```

### Traditional vs Enhanced Switch Comparison

| Feature | Traditional Switch | Enhanced Switch |
|---------|-------------------|-----------------|
| Syntax | `case value:` | `case value ->` |
| Break Required | Yes | No |
| Fall-through | Default behavior | Not possible with arrows |
| Return Value | Not directly | Yes, with expressions |
| Multiple Labels | Separate cases | `case 1, 2, 3 ->` |
| Java Version | All versions | Java 12+ |

---


## Summary
[↑ Back to Top](#java-switch-statements---lecture-notes)

### Key Points Learned

1. **Switch Statements** provide a clean alternative to multiple if-else statements when comparing a variable against specific discrete values.

2. **Traditional Syntax** uses `case value:` with `break` statements to prevent fall-through behavior.

3. **Supported Data Types** include int, byte, short, char, String, enum, and their wrapper classes.

4. **Fall-through Behavior** occurs when break statements are omitted, allowing execution to continue to the next case.

5. **Enhanced Switch Statements** (Java 12+) use arrow syntax (`->`) and eliminate the need for break statements.

6. **Switch Expressions** can return values directly, making code more concise and functional.

7. **Multiple Case Labels** can be combined using commas in enhanced switches.

8. **Yield Keyword** is used to return values from switch expressions when using block syntax.

### Best Practices

- Always include a `default` case to handle unexpected values
- Use switch statements when comparing against discrete, known values
- Prefer enhanced switch expressions for cleaner, more readable code when using Java 12+
- Remember to include `break` statements in traditional switches to prevent unintended fall-through
- Use meaningful variable names and consistent formatting
- Consider the data types supported by switch statements

### When to Use Switch vs If-Else

**Use Switch When:**
- Comparing a single variable against multiple discrete values
- Values are constants (literals or final variables)
- You have many conditions (3 or more)
- Code readability would benefit from the structured format

**Use If-Else When:**
- Comparing different variables
- Using complex boolean expressions
- Checking ranges of values
- Only 1-2 conditions to check

---

## Additional Resources
[↑ Back to Top](#java-switch-statements---lecture-notes)

### Documentation Links
- [Oracle Java Documentation - Switch Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)
- [Oracle Java Documentation - Switch Expressions](https://docs.oracle.com/en/java/javase/17/language/switch-expressions.html)

### W3Schools References
- [W3Schools Java Switch](https://www.w3schools.com/java/java_switch.asp)
- [W3Schools Java Conditions](https://www.w3schools.com/java/java_conditions.asp)

### Practice Resources
- Practice implementing switch statements with different data types
- Experiment with both traditional and enhanced syntax
- Try converting existing if-else chains to switch statements
- Create menu-driven programs using switch statements

---

*End of Lecture Notes*