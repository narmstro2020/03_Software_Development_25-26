# 🧠 W.A.R.R.I.O.R. Protocol Lesson Plan

**Unit/Topic:** Boolean Variables, Boolean Operators, Remaining Java 24 Operators  
**# Days:** 1  
**Quarter:** TBD  
**Session Length:** 86 minutes  

---

## 🕒 Timing Overview

| Section       | Time (min) | Activity                                                          |
|---------------|------------|-------------------------------------------------------------------|
| Welcome       | 5 min      | Warm-up logic puzzle or "True or False" challenge                |
| Aim           | 3 min      | Objectives and relevance of boolean logic and operators          |
| Review        | 8 min      | Recap of arithmetic, string, and random number logic             |
| Relevant Instruction | 35 min     | Code walkthrough: boolean variables and all Java 24 operators |
| Interactive   | 20 min     | Build a boolean expression evaluator                             |
| Ownership     | 10 min     | Student-created code using 5+ different operator types           |
| Resonate      | 5 min      | Exit reflection and operator knowledge check                     |

---

## 🟠 W - Welcome

**Teacher’s Role:**
- Greet students and project a logic teaser:
  > "If it's raining and I have an umbrella, I stay dry. It's raining. Do I stay dry?"
- Quick think-pair-share, then take attendance.

**Student’s Role:**
- Discuss and evaluate logical outcomes.
- Warm up their logical reasoning skills.

---

## 🟢 A - Aim

> **Objective:** Students will declare and evaluate boolean variables, apply boolean operators (`&&`, `||`, `!`), and explore all remaining Java 24 operators, including bitwise, ternary, assignment, and instanceof.

**Why it matters:**
- Boolean logic controls all decision-making in programming.
- Understanding all operators strengthens debugging and logic implementation.

---

## 🟡 R - Review

**Teacher’s Role:**
- Display quick review questions:
  1. What does `+` do with numbers? What about strings?
  2. How do you generate a random number in Java?
  3. What’s the structure of a method?

**Student’s Role:**
- Respond on mini-whiteboards or discuss in pairs.

---

## 🔵 R - Relevant Instruction

### 1. Boolean Variables
```java
boolean isRainy = true;
boolean isWeekend = false;
```

### 2. Boolean Operators

| Operator | Name           | Example                    | Result |
|----------|----------------|----------------------------|--------|
| `&&`     | AND            | `true && false`            | false  |
| `||`     | OR             | `true || false`            | true   |
| `!`      | NOT            | `!true`                    | false  |

### 3. All Remaining Operators (Java 24)

#### Comparison Operators:
- `==`, `!=`, `>`, `<`, `>=`, `<=`

#### Assignment Operators:
- `=`, `+=`, `-=`, `*=`, `/=`, `%=`

#### Unary Operators:
- `+`, `-`, `++`, `--`, `~`, `!`

#### Bitwise Operators:
- `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`

#### Ternary Operator:
```java
String result = (score >= 60) ? "Pass" : "Fail";
```

#### `instanceof` (Pattern Matching Java 16+)
```java
if (obj instanceof String s) {
    System.out.println("It is a string: " + s);
}
```

---

## 🟣 I - Interactive

**Activity: Boolean Expression Builder**

- Students will:
  - Declare boolean variables
  - Create 3+ complex expressions using boolean and comparison operators
  - Evaluate expressions and print results

**Sample Starter:**
```java
boolean isSunny = true;
boolean isWarm = false;
System.out.println("Go outside? " + (isSunny && isWarm));
```

**Optional:**
- Add a scoring system using ternary logic

---

## 🟤 O - Ownership

**Mini Project Prompt:**
- Build a logic-driven method that:
  - Uses at least 3 types of operators
  - Accepts inputs (simulated or real)
  - Produces a boolean or categorized result

**Examples:**
- Age checker
- Discount calculator
- Eligibility test (voting, driving, etc.)

---

## 🔴 R - Resonate

**Exit Ticket Questions:**
1. What does the `&&` operator mean?
2. What’s the difference between `==` and `=`?
3. Name one operator you saw today that was new to you.

---

## 🧰 Supplies

- IDE or online Java compiler
- Slides or handout with operator reference table
- Guided practice template
- Exit ticket (paper or digital)

---

## ✅ Differentiation & Support

- **Struggling students:** Provide fill-in-the-blank code samples
- **ELL:** Use color-coded examples for each operator type
- **Advanced learners:** Bitwise operator puzzles, ternary logic chains