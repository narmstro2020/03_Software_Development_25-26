# 🧠 W.A.R.R.I.O.R. Protocol Lesson Plan

**Unit/Topic:** Java Arithmetic Operators, String Operators, Math Class  
**# Days:** 1  
**Quarter:** 1  
**Session Length:** 86 minutes  

---

## 🕒 Timing Overview

| Section       | Time (min) | Activity                                                    |
|---------------|------------|-------------------------------------------------------------|
| Welcome       | 5 min      | SEL warm-up or quick problem of the day                    |
| Aim           | 3 min      | Learning objective + why it matters                        |
| Review        | 8 min      | Mini quiz or concept check (casting, input/output)         |
| Relevant Instruction | 35 min     | Direct instruction, examples, and modeling              |
| Interactive   | 20 min     | Expression evaluator + String manipulations                |
| Ownership     | 10 min     | Creative expression + math challenge program               |
| Resonate      | 5 min      | Exit reflection and discussion                             |

---

## 🟠 W - Welcome

**Teacher’s Role:**
- Greet students and display:
  > “Would you rather: Work with numbers 🧮 or words ✍️ in a program?”
- Mark attendance while prompting students to vote by raising hands or posting answers on a Jamboard.

**Student’s Role:**
- Share a preference and discuss why with a neighbor.
- Be mentally activated with the two themes of the day: **numbers** and **strings**.

---

## 🟢 A - Aim

> **Objective:** Students will use arithmetic and string operators, and apply the Java `Math` class to write simple calculations and manipulate strings.

**Why it matters:**
- These tools allow programs to compute, analyze, and respond to user input in real-world applications.

---

## 🟡 R - Review

**Activity: Mini Quiz (5 mins)**

**Questions:**
1. What does casting do in Java?
2. What’s the result of `System.out.println("2" + 3);`?
3. What happens if a reference type is set to `null` and you use it?

**Follow-up:**
- Show a few common math expressions in Java and ask students to predict outputs.

---

## 🔵 R - Relevant Instruction

### Arithmetic Operators

| Operator | Meaning         | Example       |
|----------|------------------|---------------|
| `+`      | Addition         | `5 + 3` → 8   |
| `-`      | Subtraction      | `10 - 2` → 8  |
| `*`      | Multiplication   | `4 * 6` → 24  |
| `/`      | Division         | `9 / 2` → 4 (int) or 4.5 (double) |
| `%`      | Modulus (remainder) | `10 % 3` → 1 |

```java
int a = 10, b = 3;
System.out.println(a % b); // 1
```

### String Operators

- Java uses `+` for **string concatenation**.

```java
String first = "Java";
String second = "Rocks!";
System.out.println(first + " " + second); // Java Rocks!
```

- `+=` can be used to append:

```java
String message = "Hello";
message += " world!";
```

### Java Math Class

- Common methods:
  - `Math.pow(x, y)`
  - `Math.sqrt(x)`
  - `Math.abs(x)`
  - `Math.max(a, b)`
  - `Math.min(a, b)`
  - `Math.round(x)`
  - `Math.random()` (returns a double from 0.0 to 1.0)

**Example:**
```java
double area = Math.PI * Math.pow(3, 2); // Circle with radius 3
```

**Instructional Methods Used:**
- ✅ Direct instruction
- ✅ Code demonstrations
- ✅ Visual comparison of outputs
- ✅ Partner coding demos

---

## 🟣 I - Interactive

**Activity 1: Arithmetic Expression Evaluator**

- Write a program that:
  - Prompts for two numbers
  - Prints results of all five arithmetic operations

**Activity 2: String Formatter**

- Prompt for user’s name and favorite food
- Print a sentence like: “Alex loves pizza!” using concatenation

**Teacher’s Role:**
- Circulate to answer questions and help debug
- Encourage students to try `Math.pow`, `Math.sqrt`, or `Math.round`

**Flair/Fun:**
- Challenge: Use `Math.random()` to make a random number trivia game

---

## 🟤 O - Ownership

**Activity: Personalized Calculator Program**

- Students:
  - Choose a theme (e.g. currency conversion, geometry, calorie calculator)
  - Use at least:
    - 3 arithmetic operations
    - 1 `Math` method
    - 1 concatenated string

**Differentiation:**
- Scaffold with example templates
- Advanced challenge: include type casting and formatted output

---

## 🔴 R - Resonate

**Exit Ticket Questions:**
1. What’s one new math method you used today?
2. How does Java treat `"3" + 4` differently from `3 + 4`?
3. Rate how confident you feel using Java math and string tools.

---

## 🧰 Supplies

- IDE with Java (Replit, IntelliJ, BlueJ)
- Guided notes on operators and Math class
- Exit ticket form
- Template for arithmetic evaluator

---

## ✅ Differentiation & Support

- **Struggling learners:** Use pre-written code snippets with blanks
- **ELL:** Include vocabulary cards for “modulus”, “concatenation”, “evaluate”
- **Advanced learners:** Use `Math.random()` with a loop or guessing game