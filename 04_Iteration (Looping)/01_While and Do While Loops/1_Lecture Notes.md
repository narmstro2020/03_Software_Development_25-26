# Java While and Do While Loops - Lecture Notes

## Table of Contents
- [Introduction](#introduction)
- [1. While Loops](#1-while-loops)
- [2. Do While Loops](#2-do-while-loops)
- [3. Flowcharting Loops](#3-flowcharting-loops)
- [Vocabulary](#vocabulary)
- [Summary](#summary)
- [Additional Resources](#additional-resources)

---

## Introduction
[Back to Top](#java-while-and-do-while-loops---lecture-notes)

Loops are fundamental programming constructs that allow us to execute code repeatedly based on certain conditions. In this lesson, we'll explore two types of loops in Java: **while loops** and **do-while loops**. These loops help us avoid writing repetitive code and make our programs more efficient.

**Prerequisites:** This lesson assumes you understand Java basics including printing, the main method, Scanner, comments, variables, boolean operators, arithmetic operators, and methods.

---

## 1. While Loops
[Back to Top](#java-while-and-do-while-loops---lecture-notes)

### What is a While Loop?

A **while loop** repeatedly executes a block of code as long as a specified condition remains `true`. It's called a "pre-test" loop because the condition is checked before each iteration.

### Syntax

```java
while (condition) {
    // Code to be executed repeatedly
    // This is called the loop body
}
```

### Key Components

1. **Condition**: A boolean expression that determines whether the loop continues
2. **Loop Body**: The code that executes repeatedly
3. **Loop Control Variable**: A variable that changes during each iteration to eventually make the condition false

### Basic Example

```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int count = 1; // Loop control variable
        
        while (count <= 5) { // Condition
            System.out.println("Count is: " + count);
            count++; // Increment the control variable
        }
        
        System.out.println("Loop finished!");
    }
}
```

**Output:**
```
Count is: 1
Count is: 2
Count is: 3
Count is: 4
Count is: 5
Loop finished!
```

### Important Concepts

#### Infinite Loops
If the condition never becomes false, you'll have an infinite loop:

```java
// DON'T DO THIS - Infinite loop!
int x = 1;
while (x > 0) {
    System.out.println("This will run forever!");
    // x never changes, so x > 0 is always true
}
```

#### Loop Control Variables
Always ensure your loop control variable changes in a way that will eventually make the condition false:

```java
public class CountdownExample {
    public static void main(String[] args) {
        int countdown = 10;
        
        while (countdown > 0) {
            System.out.println("T-minus " + countdown);
            countdown--; // Decrement to eventually reach 0
        }
        
        System.out.println("Blast off!");
    }
}
```

### Using Scanner with While Loops

```java
import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        
        // Keep asking until user enters a positive number
        while (number <= 0) {
            System.out.print("Enter a positive number: ");
            number = scanner.nextInt();
            
            if (number <= 0) {
                System.out.println("That's not positive! Try again.");
            }
        }
        
        System.out.println("Thank you! You entered: " + number);
        scanner.close();
    }
}
```

### Mathematical Applications

```java
public class PowerCalculator {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = 1;
        int counter = 0;
        
        System.out.println("Calculating " + base + "^" + exponent);
        
        while (counter < exponent) {
            result = result * base;
            counter++;
            System.out.println("Step " + counter + ": " + result);
        }
        
        System.out.println("Final result: " + base + "^" + exponent + " = " + result);
    }
}
```

---

## 2. Do While Loops
[Back to Top](#java-while-and-do-while-loops---lecture-notes)

### What is a Do-While Loop?

A **do-while loop** is similar to a while loop, but it's a "post-test" loop. This means the code block executes at least once before the condition is checked.

### Syntax

```java
do {
    // Code to be executed
    // This runs at least once
} while (condition);
```

**Note:** Don't forget the semicolon after the while condition!

### Key Difference from While Loops

- **While Loop**: Tests condition first, may never execute
- **Do-While Loop**: Executes once, then tests condition

### Basic Example

```java
public class DoWhileExample {
    public static void main(String[] args) {
        int count = 1;
        
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <= 5);
        
        System.out.println("Loop finished!");
    }
}
```

### When to Use Do-While Loops

Do-while loops are perfect for situations where you need to execute code at least once, such as:

1. **Menu Systems**
2. **Input Validation**
3. **Game Loops**

### Menu System Example

```java
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            // Display menu
            System.out.println("\n=== CALCULATOR MENU ===");
            System.out.println("1. Add two numbers");
            System.out.println("2. Subtract two numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            choice = scanner.nextInt();
            
            if (choice == 1) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                System.out.println("Result: " + (num1 + num2));
            } else if (choice == 2) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                System.out.println("Result: " + (num1 - num2));
            } else if (choice == 3) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
            
        } while (choice != 3);
        
        scanner.close();
    }
}
```

### Comparison: While vs Do-While

```java
public class LoopComparison {
    public static void main(String[] args) {
        System.out.println("=== WHILE LOOP ===");
        int i = 10;
        while (i < 5) {
            System.out.println("This won't print because 10 < 5 is false");
            i++;
        }
        System.out.println("While loop finished");
        
        System.out.println("\n=== DO-WHILE LOOP ===");
        int j = 10;
        do {
            System.out.println("This prints once even though 10 < 5 is false");
            j++;
        } while (j < 5);
        System.out.println("Do-while loop finished");
    }
}
```

### Using Math.random() with Do-While

```java
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = (int)(Math.random() * 10) + 1; // Random number 1-10
        int guess;
        int attempts = 0;
        
        System.out.println("I'm thinking of a number between 1 and 10!");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            }
            
        } while (guess != targetNumber);
        
        System.out.println("Congratulations! You guessed it in " + attempts + " attempts!");
        scanner.close();
    }
}
```

---

## 3. Flowcharting Loops
[Back to Top](#java-while-and-do-while-loops---lecture-notes)

### What is a Flowchart?

A **flowchart** is a visual representation of a program's logic using standardized symbols. For loops, flowcharts help us understand the flow of execution and decision-making process.

### Flowchart Symbols

- **Oval**: Start/End
- **Rectangle**: Process/Action
- **Diamond**: Decision/Condition
- **Arrow**: Flow direction
- **Parallelogram**: Input/Output

### While Loop Flowchart

```
    [START]
       |
       v
  [Initialize Variable]
       |
       v
    <Condition?>
    /         \
   No          Yes
   |            |
   v            v
[END]     [Execute Loop Body]
             |
             v
        [Update Variable]
             |
             v
          (Back to Condition)
```

### Do-While Loop Flowchart

```
    [START]
       |
       v
  [Initialize Variable]
       |
       v
  [Execute Loop Body]
       |
       v
  [Update Variable]
       |
       v
    <Condition?>
    /         \
   No          Yes
   |            |
   v            v
[END]     (Back to Execute Loop Body)
```

### Example: Flowchart for Counting 1 to 5

**While Loop Logic:**
1. Start
2. Set count = 1
3. Is count ≤ 5?
   - If No: End
   - If Yes: Print count, increment count, go back to step 3

**Do-While Loop Logic:**
1. Start
2. Set count = 1
3. Print count
4. Increment count
5. Is count ≤ 5?
   - If Yes: Go back to step 3
   - If No: End

### Creating Your Own Flowcharts

When designing loops, ask yourself:
1. What is my starting condition?
2. What needs to happen in each iteration?
3. How will the condition eventually become false?
4. What should happen after the loop ends?

---

## Vocabulary
[Back to Top](#java-while-and-do-while-loops---lecture-notes)

- **Loop**: A programming construct that repeats a block of code
- **While Loop**: A pre-test loop that checks the condition before each iteration
- **Do-While Loop**: A post-test loop that executes the body at least once before checking the condition
- **Iteration**: One complete execution of the loop body
- **Loop Body**: The code that executes repeatedly inside the loop
- **Loop Control Variable**: A variable that changes during loop execution to eventually terminate the loop
- **Condition**: A boolean expression that determines whether the loop continues
- **Infinite Loop**: A loop that never terminates because its condition never becomes false
- **Pre-test Loop**: A loop that tests the condition before executing the body (while loop)
- **Post-test Loop**: A loop that tests the condition after executing the body (do-while loop)
- **Flowchart**: A visual diagram showing the flow of a program's logic
- **Increment**: Increasing a variable's value (usually by 1)
- **Decrement**: Decreasing a variable's value (usually by 1)



---

## Summary
[Back to Top](#java-while-and-do-while-loops---lecture-notes)

In this lesson, we learned about two important types of loops in Java:

**While Loops:**
- Pre-test loops that check the condition before each iteration
- May never execute if the initial condition is false
- Perfect for situations where you might not need to execute the loop body at all
- Syntax: `while (condition) { /* body */ }`

**Do-While Loops:**
- Post-test loops that execute the body at least once before checking the condition
- Guaranteed to execute at least one time
- Ideal for menus, input validation, and situations requiring at least one execution
- Syntax: `do { /* body */ } while (condition);`

**Key Points to Remember:**
1. Always ensure your loop control variable changes to avoid infinite loops
2. Choose the right loop type based on whether you need guaranteed execution
3. Use flowcharts to plan your loop logic before coding
4. Test your loops with different inputs to ensure they work correctly
5. Remember the semicolon after the while condition in do-while loops

**Best Practices:**
- Initialize loop control variables before the loop
- Update loop control variables inside the loop body
- Use meaningful variable names
- Add comments to explain complex loop logic
- Test edge cases (like when the condition is initially false)

---

## Additional Resources
[Back to Top](#java-while-and-do-while-loops---lecture-notes)

### Official Documentation
- [Oracle Java Documentation - while and for Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html)
- [Oracle Java Documentation - Branching Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html)

### W3Schools References
- [W3Schools Java While Loop](https://www.w3schools.com/java/java_while_loop.asp)
- [W3Schools Java Break and Continue](https://www.w3schools.com/java/java_break.asp)

### Practice Platforms
- [Coding Bat - Java Logic Problems](https://codingbat.com/java)
- [LeetCode - Easy Java Problems](https://leetcode.com/problemset/all/?difficulty=Easy&page=1&topicSlugs=array)

### Tools
- [IntelliJ IDEA Download](https://www.jetbrains.com/idea/)
- [Git Documentation](https://git-scm.com/doc)
- [GitHub Guides](https://guides.github.com/)

---

*Last Updated: August 2025*
