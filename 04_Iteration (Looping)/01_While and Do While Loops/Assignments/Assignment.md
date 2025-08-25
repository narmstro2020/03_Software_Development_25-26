# Assignment 1: Password Validator

## Objective
Create a program that validates user passwords using a do-while loop. The program should keep asking for a password until the user enters one that meets the specified criteria.

## Requirements

### Password Criteria
A valid password must:
1. Be at least 8 characters long
2. Contain at least one uppercase letter
3. Contain at least one lowercase letter
4. Contain at least one digit (0-9)

### Program Specifications
1. Use a `do-while` loop to repeatedly ask for password input
2. After each invalid password attempt, display which criteria are not met
3. When a valid password is entered, congratulate the user and exit
4. Use the `Scanner` class for input
5. Use appropriate boolean variables to track each criterion
6. Use methods to check each password requirement

## Starter Code Template

```java
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean isValid = false;
        
        System.out.println("=== PASSWORD VALIDATOR ===");
        System.out.println("Password Requirements:");
        System.out.println("- At least 8 characters long");
        System.out.println("- At least one uppercase letter");
        System.out.println("- At least one lowercase letter");
        System.out.println("- At least one digit (0-9)");
        System.out.println();
        
        // TODO: Implement do-while loop here
        
        scanner.close();
    }
    
    // TODO: Create method to check if password has minimum length
    public static boolean hasMinimumLength(String password) {
        // Your code here
    }
    
    // TODO: Create method to check if password has uppercase letter
    public static boolean hasUppercase(String password) {
        // Your code here
    }
    
    // TODO: Create method to check if password has lowercase letter
    public static boolean hasLowercase(String password) {
        // Your code here
    }
    
    // TODO: Create method to check if password has at least one digit
    public static boolean hasDigit(String password) {
        // Your code here
    }
}
```

## Expected Output Example

```
=== PASSWORD VALIDATOR ===
Password Requirements:
- At least 8 characters long
- At least one uppercase letter
- At least one lowercase letter
- At least one digit (0-9)

Enter a password: hello
❌ Password is too short (minimum 8 characters)
❌ Password must contain at least one uppercase letter
❌ Password must contain at least one digit

Enter a password: HelloWorld
❌ Password must contain at least one digit

Enter a password: HelloWorld123
✅ Password is valid! Welcome!
```

## Hints
1. Use a `do-while` loop because you want to ask for a password at least once
2. For checking character types, you can iterate through each character in the string
3. Use `Character.isUpperCase()`, `Character.isLowerCase()`, and `Character.isDigit()` methods
4. Set `isValid` to `true` only when ALL criteria are met
5. Print specific error messages for each failed criterion

## Testing Your Program
Test your program with these passwords:
- `"hello"` (too short, no uppercase, no digit)
- `"HELLO123"` (no lowercase)
- `"hello123"` (no uppercase)
- `"HelloWorld"` (no digit)
- `"HelloWorld123"` (valid)

## Submission
Save your completed program as `PasswordValidator.java` and test it thoroughly before submission.

---
[Back to Main Notes](../1_Lecture%20Notes.md)