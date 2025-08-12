# ✅ Day 06 Assignment – Math.random and Custom Method

---


## ✅ Task 1: Create a Method that Returns a Random Number in a Range

```java
public class RandomDemo {
    public static int getRandomNumber(int min, int max) {
        // TODO: write the method
    }

    public static void main(String[] args) {
        int result = getRandomNumber(5, 15);
        System.out.println("Random number between 5 and 15: " + result);
    }
}
```

---

## ✅ Task 2: Coin Flip Method

```java
public class RandomDemo {
    public static int getRandomNumber(int min, int max) {
        // TODO: From task 1
    }

    public static String flipCoin() {
        if (Math.random() < 0.5){
            // TODO: return the string Heads
        }else{
            // TODO: return the string Tails
        }
    }

    public static void main(String[] args) {
        // TODO: Task 1 code.  

        
        System.out.println("Coin flip: " + flipCoin());
    }
}
```

---

## ✅ Task 3: Dice Roller Method

```java
public class RandomDemo {
    public static int getRandomNumber(int min, int max) {
        // TODO: From task 1
    }

    public static String flipCoin() {
        // TODO: From part 2
    }

    public static int rollDice() {
        // TODO: returns a random number between and including 1 and 6.
    }

    public static void main(String[] args) {
        // TODO: Task 1 code.  
        // TODO: Task 2 code.
        
        System.out.println("You rolled a " + rollDice());
    }
}
```

---

## ✅ Task 4: Spinner (1–8)

```java
public class RandomDemo {
    
    public static int getRandomNumber(int min, int max) {
        // TODO: From task 1
    }

    public static String flipCoin() {
        // TODO: From part 2
    }

    public static int rollDice() {
        // TODO: From part 3
    }

    public static int spinWheel() {
        // TODO: returns a random number between and including 1 and 8.
    }

    public static void main(String[] args) {
        // TODO: Task 1 code.  
        // TODO: Task 2 code.
        // TODO: Task 3 code.
        
        System.out.println("Spinner result: " + spinWheel());
    }
}
```

---

## ✅ Task 5: Lottery Pick (5 numbers from 1–99)

```java
public class RandomDemo {

    public static int getRandomNumber(int min, int max) {
        // TODO: From task 1
    }

    public static String flipCoin() {
        // TODO: From part 2
    }

    public static int rollDice() {
        // TODO: From part 3
    }

    public static int spinWheel() {
        // TODO: From part 4
    }

    public static int getPick() {
        // TODO: returns a random number between and including 1 and 99.
    }

    public static void main(String[] args) {
        // TODO: Task 1 code.  
        // TODO: Task 2 code.
        // TODO: Task 3 code.
        // TODO: Task 4 code.
    
        System.out.println("Your lottery picks:");
        for (int i = 0; i < 5; i++) {
            System.out.println(getPick());
        }
    }
}
```

---
