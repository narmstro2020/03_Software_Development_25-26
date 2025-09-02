# Java For Loops - Lecture Notes

## Table of Contents
- [Introduction to For Loops](#introduction-to-for-loops)
- [For Loop Syntax and Structure](#for-loop-syntax-and-structure)
- [How For Loops Work](#how-for-loops-work)
- [Common For Loop Patterns](#common-for-loop-patterns)
- [Nested For Loops](#nested-for-loops)
- [For Loops with Methods](#for-loops-with-methods)
- [Common Mistakes and Debugging](#common-mistakes-and-debugging)
- [Summary](#summary)
- [Additional Resources](#additional-resources)

---

## Introduction to For Loops
[Back to Top](#java-for-loops---lecture-notes)

### What is a For Loop?

A **for loop** is a control structure that allows you to execute a block of code repeatedly for a specific number of times. It's one of the most commonly used loops in programming and is particularly useful when you know exactly how many times you want to repeat an action.

### Vocabulary Terms

- **Loop**: A programming construct that repeats a block of code
- **Iteration**: One complete execution of the loop body
- **Counter Variable**: A variable that keeps track of how many times the loop has executed
- **Initialization**: Setting the starting value of the counter variable
- **Condition**: The test that determines whether the loop should continue
- **Increment/Decrement**: Changing the counter variable after each iteration
- **Loop Body**: The code that gets executed during each iteration

### Why Use For Loops?

Before for loops, if we wanted to print "Hello" 5 times, we would have to write:

```java
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
System.out.println("Hello");
```

With a for loop, we can write:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Hello");
}
```

This is much more efficient and easier to maintain!

---

## For Loop Syntax and Structure
[Back to Top](#java-for-loops---lecture-notes)

### Basic Syntax

```java
for (initialization; condition; increment/decrement) {
    // Loop body - code to be repeated
}
```

### The Three Parts Explained

1. **Initialization**: `int i = 0`
   - Creates and sets the starting value of the counter variable
   - Executed only once, at the beginning

2. **Condition**: `i < 5`
   - A boolean expression that is checked before each iteration
   - If true, the loop body executes
   - If false, the loop stops

3. **Increment/Decrement**: `i++`
   - Changes the counter variable after each iteration
   - Usually increases (`i++`) or decreases (`i--`) by 1

### Visual Representation

```
Start → Initialization → Condition Check → Loop Body → Increment → Condition Check → ...
                            ↓ (false)                      ↑
                           End                             └─────┘
```

### Simple Example

```java
public class ForLoopExample {
    public static void main(String[] args) {
        // Print numbers 1 through 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
        System.out.println("Loop finished!");
    }
}
```

**Output:**
```
Number: 1
Number: 2
Number: 3
Number: 4
Number: 5
Loop finished!
```

---

## How For Loops Work
[Back to Top](#java-for-loops---lecture-notes)

### Step-by-Step Execution

Let's trace through this loop step by step:

```java
for (int i = 0; i < 3; i++) {
    System.out.println("Iteration: " + i);
}
```

**Step-by-step breakdown:**

1. **Step 1**: `int i = 0` - Initialize i to 0
2. **Step 2**: Check condition `i < 3` - Is 0 < 3? **True**
3. **Step 3**: Execute loop body - Print "Iteration: 0"
4. **Step 4**: `i++` - Increment i to 1
5. **Step 5**: Check condition `i < 3` - Is 1 < 3? **True**
6. **Step 6**: Execute loop body - Print "Iteration: 1"
7. **Step 7**: `i++` - Increment i to 2
8. **Step 8**: Check condition `i < 3` - Is 2 < 3? **True**
9. **Step 9**: Execute loop body - Print "Iteration: 2"
10. **Step 10**: `i++` - Increment i to 3
11. **Step 11**: Check condition `i < 3` - Is 3 < 3? **False**
12. **Step 12**: Exit loop

### Different Counter Variable Names

You can use any valid variable name for your counter:

```java
// Common names for counter variables
for (int i = 0; i < 5; i++) { } // Most common
for (int count = 0; count < 5; count++) { }
for (int num = 0; num < 5; num++) { }
for (int x = 0; x < 5; x++) { }
```

### Different Starting Values

```java
// Start from 1
for (int i = 1; i <= 5; i++) {
    System.out.println(i); // Prints 1, 2, 3, 4, 5
}

// Start from 10
for (int i = 10; i < 15; i++) {
    System.out.println(i); // Prints 10, 11, 12, 13, 14
}
```

---

## Common For Loop Patterns
[Back to Top](#java-for-loops---lecture-notes)

### Pattern 1: Counting Up

```java
// Count from 1 to 10
for (int i = 1; i <= 10; i++) {
    System.out.print(i + " ");
}
// Output: 1 2 3 4 5 6 7 8 9 10
```

### Pattern 2: Counting Down

```java
// Count from 10 to 1
for (int i = 10; i >= 1; i--) {
    System.out.print(i + " ");
}
// Output: 10 9 8 7 6 5 4 3 2 1
```

### Pattern 3: Counting by Different Amounts

```java
// Count by 2s
for (int i = 0; i <= 10; i += 2) {
    System.out.print(i + " ");
}
// Output: 0 2 4 6 8 10

// Count by 5s
for (int i = 5; i <= 25; i += 5) {
    System.out.print(i + " ");
}
// Output: 5 10 15 20 25
```

### Pattern 4: Using the Counter in Calculations

```java
// Print squares of numbers 1-5
for (int i = 1; i <= 5; i++) {
    int square = i * i;
    System.out.println(i + " squared is " + square);
}
```

**Output:**
```
1 squared is 1
2 squared is 4
3 squared is 9
4 squared is 16
5 squared is 25
```

### Pattern 5: Accumulating Values

```java
// Calculate sum of numbers 1-10
int sum = 0;
for (int i = 1; i <= 10; i++) {
    sum += i;
    System.out.println("Added " + i + ", sum is now " + sum);
}
System.out.println("Final sum: " + sum);
```

### Pattern 6: Using Math.random() with Loops

```java
// Generate 5 random numbers between 1-100
for (int i = 1; i <= 5; i++) {
    int randomNum = (int)(Math.random() * 100) + 1;
    System.out.println("Random number " + i + ": " + randomNum);
}
```

---

## Nested For Loops
[Back to Top](#java-for-loops---lecture-notes)

### What are Nested Loops?

A **nested loop** is a loop inside another loop. The inner loop completes all its iterations for each iteration of the outer loop.

### Basic Nested Loop Example

```java
// Print a 3x3 grid of stars
for (int row = 1; row <= 3; row++) {
    for (int col = 1; col <= 3; col++) {
        System.out.print("* ");
    }
    System.out.println(); // New line after each row
}
```

**Output:**
```
* * * 
* * * 
* * * 
```

### Understanding Nested Loop Execution

```java
for (int i = 1; i <= 2; i++) {
    System.out.println("Outer loop: " + i);
    for (int j = 1; j <= 3; j++) {
        System.out.println("  Inner loop: " + j);
    }
}
```

**Output:**
```
Outer loop: 1
  Inner loop: 1
  Inner loop: 2
  Inner loop: 3
Outer loop: 2
  Inner loop: 1
  Inner loop: 2
  Inner loop: 3
```

### Multiplication Table Example

```java
// Create a multiplication table
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 5; j++) {
        int product = i * j;
        System.out.print(product + "\t"); // \t adds a tab
    }
    System.out.println(); // New line after each row
}
```

**Output:**
```
1	2	3	4	5	
2	4	6	8	10	
3	6	9	12	15	
4	8	12	16	20	
5	10	15	20	25	
```

### Triangle Pattern Example

```java
// Print a triangle of numbers
for (int row = 1; row <= 4; row++) {
    for (int col = 1; col <= row; col++) {
        System.out.print(col + " ");
    }
    System.out.println();
}
```

**Output:**
```
1 
1 2 
1 2 3 
1 2 3 4 
```

---

## For Loops with Methods
[Back to Top](#java-for-loops---lecture-notes)

### Calling Methods in Loops

You can call methods inside for loops just like any other code:

```java
public class LoopMethods {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int result = multiplyByTwo(i);
            System.out.println(i + " * 2 = " + result);
        }
    }
    
    public static int multiplyByTwo(int number) {
        return number * 2;
    }
}
```

### Methods that Use For Loops

```java
public static void printPattern(int size) {
    for (int i = 1; i <= size; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

public static int calculateSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}

public static void countdown(int start) {
    for (int i = start; i >= 0; i--) {
        System.out.println(i);
        if (i == 0) {
            System.out.println("Blast off!");
        }
    }
}
```

### Using Scanner with For Loops

```java
import java.util.Scanner;

public class LoopInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers do you want to enter? ");
        int count = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }
        
        double average = (double)sum / count;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
```

---

## Common Mistakes and Debugging
[Back to Top](#java-for-loops---lecture-notes)

### Mistake 1: Off-by-One Errors

**Problem:** Loop runs one too many or one too few times

```java
// WRONG - This runs 6 times (0,1,2,3,4,5)
for (int i = 0; i <= 5; i++) {
    System.out.println(i);
}

// CORRECT - This runs 5 times (0,1,2,3,4)
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### Mistake 2: Infinite Loops

**Problem:** The condition never becomes false

```java
// WRONG - i never changes!
for (int i = 0; i < 5; ) {
    System.out.println(i);
    // Missing i++ causes infinite loop!
}

// WRONG - Condition will never be false
for (int i = 0; i > -1; i++) {
    System.out.println(i);
    // i keeps getting bigger, never less than -1
}
```

### Mistake 3: Wrong Comparison Operators

```java
// If you want to include the final number, use <= or >=
for (int i = 1; i <= 10; i++) { } // Includes 10

// If you want to exclude the final number, use < or >
for (int i = 1; i < 10; i++) { } // Goes up to 9
```

### Mistake 4: Scope Issues

```java
for (int i = 0; i < 5; i++) {
    int x = i * 2;
}
// System.out.println(i); // ERROR! i is not accessible here
// System.out.println(x); // ERROR! x is not accessible here
```

### Debugging Tips

1. **Add print statements** to see what your variables are doing:
```java
for (int i = 0; i < 5; i++) {
    System.out.println("i is now: " + i);
    // Your other code here
}
```

2. **Check your condition** carefully - does it do what you expect?

3. **Trace through manually** with small examples first

4. **Use the debugger** in IntelliJ to step through your code

---

## Summary
[Back to Top](#java-for-loops---lecture-notes)

### Key Concepts Learned

1. **For Loop Structure**: `for (initialization; condition; increment) { }`

2. **Three Parts**:
   - **Initialization**: Sets starting value (runs once)
   - **Condition**: Checked before each iteration (boolean expression)
   - **Increment/Decrement**: Changes counter after each iteration

3. **Common Patterns**:
   - Counting up: `for (int i = 1; i <= n; i++)`
   - Counting down: `for (int i = n; i >= 1; i--)`
   - Counting by steps: `for (int i = 0; i <= n; i += step)`

4. **Nested Loops**: Loops inside loops for 2D patterns and tables

5. **Best Practices**:
   - Use meaningful variable names
   - Be careful with boundary conditions
   - Watch out for infinite loops
   - Test with small examples first

### When to Use For Loops

- When you know exactly how many times to repeat something
- When working with sequences of numbers
- When creating patterns or tables
- When performing calculations on ranges of values
- When you need a counter variable

### Next Steps

In future lessons, we'll learn about:
- While loops and do-while loops
- Arrays (which work great with for loops!)
- Enhanced for loops (for-each loops)
- Break and continue statements

---

## Additional Resources
[Back to Top](#java-for-loops---lecture-notes)

### Official Documentation
- [Oracle Java Documentation - The for Statement](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html)
- [Oracle Java Language Specification](https://docs.oracle.com/javase/specs/jls/se11/html/jls-14.html#jls-14.14)

### W3Schools Resources
- [W3Schools Java For Loops](https://www.w3schools.com/java/java_for_loop.asp)
- [W3Schools Java While Loops](https://www.w3schools.com/java/java_while_loop.asp)

### Practice Resources
- [CodingBat Java Loops](https://codingbat.com/java)
- [HackerRank Java Loops](https://www.hackerrank.com/domains/java)

### Tools
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) - IDE for Java development
- [Git](https://git-scm.com/) - Version control
- [GitHub](https://github.com/) - Code repository hosting

---

*End of Lecture Notes*