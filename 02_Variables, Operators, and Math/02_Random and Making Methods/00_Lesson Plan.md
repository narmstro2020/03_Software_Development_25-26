# 🧠 W.A.R.R.I.O.R. Protocol Lesson Plan

**Unit/Topic:** Java Random Number Generation & Custom Method  
**# Days:** 1  
**Quarter:** 1  
**Session Length:** 86 minutes  

---

## 🕒 Timing Overview

| Section       | Time (min) | Activity                                                          |
|---------------|------------|-------------------------------------------------------------------|
| Welcome       | 5 min      | Warm-up: “Lucky Numbers”                                         |
| Aim           | 3 min      | Objective + Real-world Use Case (games, simulations)             |
| Review        | 8 min      | Concept check on `Math.random()` and method structure            |
| Relevant Instruction | 35 min     | Code walkthrough: RNG and custom methods                    |
| Interactive   | 20 min     | Build and use your own random number method                     |
| Ownership     | 10 min     | Create a dice, spinner, or lottery generator using a method     |
| Resonate      | 5 min      | Exit reflection: “Why use methods?”                             |

---

## 🟠 W - Welcome

**Teacher’s Role:**
- Greet students and display the warm-up:
  > “What’s your lucky number today? Pick a number from 1–100.”
- As students respond, simulate a random number using `Math.random()` to see whose pick was closest.
- Take attendance during the activity.

**Student’s Role:**
- Respond and participate in the “Lucky Number” draw.

---

## 🟢 A - Aim

> **Objective:** Students will generate random numbers using `Math.random()` and write their own custom method to encapsulate reusable random number logic.

**Why it matters:**
- Randomness is used in games, simulations, security, and testing.  
- Methods help you organize, reuse, and name your logic.

---

## 🟡 R - Review

**Review Questions (can be Kahoot, hand signals, or mini-whiteboards):**

1. What range of values does `Math.random()` generate?
2. How do you make `Math.random()` generate a number between 1 and 10?
3. What does a method header look like in Java?

```java
public static void methodName() {
    // code
}
```

---

## 🔵 R - Relevant Instruction

### 1. Using `Math.random()`

```java
double r = Math.random(); // 0.0 <= r < 1.0
```

To get a random int between 1–10:

```java
int r = (int)(Math.random() * 10) + 1;
```

### 2. Custom Method

Creating a method that returns a random number in a given range:

```java
public static int getRandomNumber(int min, int max) {
    return (int)(Math.random() * (max - min + 1)) + min;
}
```

Call it in `main`:
```java
int roll = getRandomNumber(1, 6); // Simulates a die roll
System.out.println("You rolled: " + roll);
```

**Instructional Methods Used:**
- ✅ Direct instruction
- ✅ Code walkthroughs
- ✅ Live coding
- ✅ Interactive simulation

**Differentiation:**
- ELL: Use annotated diagrams showing min-max logic
- Struggling learners: Provide a working method and ask them to modify it
- Advanced: Let them create overloaded versions or multiple RNG tools

---

## 🟣 I - Interactive

**Build Your Own Random Generator**

- Prompt: Create a custom method to simulate:
  - A 6-sided die
  - A coin flip
  - A random card from a deck (1–52)

- Steps:
  - Write a method that takes no input or two inputs (min, max)
  - Call the method multiple times and print output

**Teacher’s Role:**
- Guide with debugging support
- Reinforce method structure

**Flair:**
- Optional leaderboard: “Who rolls the highest today?”

---

## 🟤 O - Ownership

**Personal Project Prompt:**
- Create one of the following:
  - Dice roller
  - Slot machine
  - Spinner game
  - Lottery number picker

**Requirements:**
- Must use a method to generate the random numbers
- Must print output in a fun or creative way

---

## 🔴 R - Resonate

**Exit Ticket Questions:**
1. What does `Math.random()` return?
2. What parameters does your custom method use?
3. How is using a method different from repeating code?

**Optional Discussion:**
- “Where have you seen random number generators in real life?”

---

## 🧰 Supplies

- IDE with Java (Replit, IntelliJ, BlueJ)
- Slides or diagram of method structure
- Example code snippets
- Exit ticket or Google Form

---

## ✅ Differentiation & Support

- **Struggling students:** Use a scaffolded method and have them adjust values
- **ELL:** Provide labeled diagram with `Math.random()` formula and return statement
- **Advanced:** Explore Java’s `Random` class and compare it to `Math.random()`