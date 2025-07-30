# 🧠 W.A.R.R.I.O.R. Protocol Lesson Plan

**Unit/Topic:** Java Output, Input, Comments, `null`, Casting, Wrapper Classes  
**# Days:** 1  
**Quarter:** 1  
**Session Length:** 86 minutes  

---

## 🕒 Timing Overview

| Section       | Time (min) | Activity                                                          |
|---------------|------------|-------------------------------------------------------------------|
| Welcome       | 5 min      | Warm-up Q & Attendance                                            |
| Aim           | 3 min      | Share Learning Objectives and Agenda                              |
| Review        | 8 min      | Quick Recap (Primitive vs Reference types)                        |
| Relevant Instruction | 35 min     | Direct instruction, live code examples, modeling               |
| Interactive   | 20 min     | Hands-on coding: Create a bio form with input/output              |
| Ownership     | 10 min     | Code reflection, add casting & wrapper example to bio program     |
| Resonate      | 5 min      | Class reflection and exit slip                                    |

---

## 🟠 W - Welcome

**Teacher’s Role:**
- Greet students and project this warm-up question:
  > “What’s one way a computer program can talk to the user?”
- Take attendance while students write their responses on the board or digitally.

**Student’s Role:**
- Answer warm-up (output, print, pop-up, prompt, etc.)
- Discuss their ideas in pairs

---

## 🟢 A - Aim

> **Objective:** Students will demonstrate the ability to perform console input/output, use comments, handle `null`, cast between types, and utilize wrapper classes.

**Why it matters:**
- These are core building blocks for every Java program with interaction and memory management.

---

## 🟡 R - Review

**Teacher’s Role:**
- Post three review questions from Day 02:
  1. What’s the difference between primitive and reference types?
  2. What is the purpose of the `main` method?
  3. Which primitive types did we use yesterday?

**Student’s Role:**
- Respond aloud or via review cards
- Compare answers with a partner

---

## 🔵 R - Relevant Instruction

**Activity 1: Java Output**

- `System.out.println("Hello, world!");`
- `System.out.print()` vs `println()`

**Activity 2: Java Input**

```java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = input.nextLine();
```

**Activity 3: Comments**

- Single-line: `// This is a comment`
- Multi-line:
  ```java
  /*
   This is a multi-line comment
  */
  ```

**Activity 4: `null` and Reference Types**

```java
String message = null;
if (message == null) {
    System.out.println("No message received.");
}
```

- Only reference types can be `null`
- NullPointerException warning

**Activity 5: Casting**

- Implicit: `int x = 10; double y = x;`
- Explicit: `double x = 10.5; int y = (int) x;`

**Activity 6: Wrapper Classes**

| Primitive | Wrapper      |
|----------|---------------|
| `int`     | `Integer`     |
| `double`  | `Double`      |
| `boolean` | `Boolean`     |
| `char`    | `Character`   |
| `byte`    | `Byte`        |
| `short`   | `Short`       |
| `long`    | `Long`        |
| `float`   | `Float`       |

- Autoboxing: `Integer x = 5;`
- Unboxing: `int y = x;`

**Instructional Methods Used:**
- ✅ Mini-lesson/direct instruction  
- ✅ Guided notes  
- ✅ Modeling/demonstration  
- ✅ Visual aids  
- ✅ Partner coding  

**Differentiation:**
- ELL: Visual flowcharts for casting and wrapper class conversion  
- Advanced: Create a helper method to validate input using a wrapper class

---

## 🟣 I - Interactive

**Activity: Bio Input Program**

- Students create a program that:
  - Asks for their name, age, GPA (use `Scanner`)
  - Prints the values out
  - Casts GPA to an `int`
  - Uses `Integer.valueOf(age)` to demonstrate wrapper class
  - Adds a `null` variable and explains it with a comment

**Teacher’s Role:**
- Circulate and troubleshoot
- Ask questions about each part of the student code

**Student’s Role:**
- Build, test, debug their code
- Share with a neighbor

**Flair/Fun:**
- “Bio Showdown”: Who has the funniest/friendliest bio printout?

---

## 🟤 O - Ownership

**Activity: Self-Check & Expansion**

- Students:
  - Add 2+ lines of comments to explain their code
  - Print out a `null` variable and explain in a comment
  - Use `Double.parseDouble()` or `Boolean.valueOf()` with dummy values

**Differentiation:**
- Scaffolded template for students who need help
- Optional advanced challenge: prompt user for numeric string and cast it

---

## 🔴 R - Resonate

**Exit Reflection Questions:**
1. How does Java collect input from users?
2. What’s one difference between casting and wrapper classes?
3. Rate your understanding of today’s content (1–5)

**Student’s Role:**
- Answer reflection on exit ticket
- Discuss key takeaways

---

## 🧰 Supplies

- IDE with Java (Replit, IntelliJ, BlueJ, etc.)
- Guided notes
- Exit ticket form
- Starter code (optional)
- Type conversion and wrapper chart

---

## ✅ Differentiation & Support

- **Struggling students:** Use scaffolded code template, step-by-step input tutorial
- **ELL:** Diagrams, vocabulary list, highlighted syntax cards
- **Advanced:** Try regex-based input validation, explore `Objects.isNull()`