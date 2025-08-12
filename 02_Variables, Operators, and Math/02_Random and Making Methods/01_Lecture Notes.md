# 📚 Teacher Lecture Notes – Day 06: Math.random, Random Number Generators, and Custom Methods

---

## 🎲 1. What is `Math.random()`?

### Syntax:
```java
double r = Math.random();
```

- Returns a `double` value from **0.0** (inclusive) to **1.0** (exclusive).
- Example output: 0.271835, 0.999991, 0.057321

---

## 🎯 2. Creating a Range

To generate a random **integer** between `min` and `max`:

### Formula:
```java
int rand = (int)(Math.random() * (max - min + 1)) + min;
```

### Example – Number from 1 to 6:
```java
int diceRoll = (int)(Math.random() * 6) + 1;
System.out.println("You rolled: " + diceRoll);
```

### Example – Number from 10 to 20:
```java
int num = (int)(Math.random() * 11) + 10; // 11 = (20 - 10 + 1)
System.out.println("Random number: " + num);
```

---

## 🛠️ 3. Writing Your First Custom Method

### Structure of a Method:
```java
public static ReturnType methodName(Parameters) {
    // body
    return something;
}
```

### Custom Method Example – Dice Roller
```java
public static int getRandomNumber(int min, int max) {
    return (int)(Math.random() * (max - min + 1)) + min;
}
```

### Using the Method:
```java
int roll = getRandomNumber(1, 6);
System.out.println("Dice roll: " + roll);
```

---

## 💡 4. Why Use Methods?

- **Reusability:** Write once, call many times.
- **Readability:** Break code into named sections.
- **Maintainability:** Easier to update logic in one place.

---

## 🎮 5. Example Generators

### Coin Flip:
```java
public static String coinFlip() {
    return Math.random() < 0.5 ? "Heads" : "Tails";
}
```

### Lottery Number Generator (1–99):
```java
public static int getLotteryPick() {
    return (int)(Math.random() * 99) + 1;
}
```

### Spinner (1–8):
```java
public static int spinWheel() {
    return (int)(Math.random() * 8) + 1;
}
```

---

## 🧠 6. Common Mistakes

| Mistake                              | Fix                                           |
|--------------------------------------|-----------------------------------------------|
| Forgetting `(int)` to cast to int   | Always cast `Math.random()` when needed       |
| Wrong range math                    | Use `(max - min + 1)`                         |
| Not using return statement in method | All `non-void` methods must return a value    |
| Not calling the method               | Use `methodName(args)` inside `main()`       |

---

## 👨‍🏫 Live Demo Plan

1. Show `Math.random()` results in console
2. Write and test `getRandomNumber(int, int)`
3. Flip a coin using a method
4. Have students create a themed RNG method:
   - Dice
   - Spinner
   - Card picker
   - Lucky number

---

## ❓ Review Questions

1. What range does `Math.random()` return by default?
2. How can you get a number between 50 and 100?
3. Why use a method to generate a random number instead of copying the formula?

---

## ✏️ Sample Exit Ticket Answer Key

1. Between 0.0 (inclusive) and 1.0 (exclusive)
2. `(int)(Math.random() * 51) + 50`
3. Methods let us name and reuse logic instead of copying and pasting