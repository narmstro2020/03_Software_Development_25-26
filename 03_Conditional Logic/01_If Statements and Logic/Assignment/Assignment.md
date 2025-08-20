# Assignment: Student Information System

## Objective
Create a Java program that processes student information and determines eligibility for various academic programs and services based on multiple criteria.

## Requirements

### Part 1: Student Data Collection
Collect the following information from the user:
1. Student name (String)
2. Age (int)
3. GPA (double)
4. Credits completed (int)
5. Is the student a resident? (boolean - true for in-state, false for out-of-state)
6. Does the student have financial aid? (boolean)

### Part 2: Academic Standing Classification
Based on the GPA, classify the student's academic standing:
- **Dean's List**: GPA >= 3.5
- **Good Standing**: GPA >= 2.0 and < 3.5
- **Academic Warning**: GPA >= 1.5 and < 2.0
- **Academic Probation**: GPA < 1.5

### Part 3: Class Level Determination
Based on credits completed, determine the student's class level:
- **Freshman**: 0-29 credits
- **Sophomore**: 30-59 credits
- **Junior**: 60-89 credits
- **Senior**: 90+ credits

### Part 4: Program Eligibility
Determine eligibility for various programs:

**Honor Society Eligibility:**
- Must be Dean's List AND
- Must be Junior or Senior AND
- Must have completed at least 60 credits

**Graduation Eligibility:**
- Must have 120+ credits AND
- Must have GPA >= 2.0

**Scholarship Eligibility:**
- Must have GPA >= 3.0 AND
- Must be a resident (in-state) AND
- Must not already have financial aid


## Input/Output Examples

### Example 1:
```
=== Student Information System ===
Enter student name: Alice Johnson
Enter age: 20
Enter GPA: 3.8
Enter credits completed: 75
Is student a resident? (true/false): true
Does student have financial aid? (true/false): false

=== STUDENT REPORT ===
Name: Alice Johnson
Age: 20
GPA: 3.8
Credits: 75
Resident: Yes
Financial Aid: No

Academic Standing: Dean's List
Class Level: Junior

=== ELIGIBILITY STATUS ===
Honor Society: Eligible
Graduation: Not Eligible (needs 45 more credits)
Scholarship: Eligible

```

### Example 2:
```
=== Student Information System ===
Enter student name: Bob Smith
Enter age: 22
Enter GPA: 1.8
Enter credits completed: 35
Is student a resident? (true/false): false
Does student have financial aid? (true/false): true

=== STUDENT REPORT ===
Name: Bob Smith
Age: 22
GPA: 1.8
Credits: 35
Resident: No
Financial Aid: Yes

Academic Standing: Academic Warning
Class Level: Sophomore

=== ELIGIBILITY STATUS ===
Honor Society: Not Eligible
Graduation: Not Eligible (needs 85 more credits)
Scholarship: Not Eligible

```



## Submission Requirements
- Submit your Java file named `StudentInfoSystem.java`
- Include comprehensive comments explaining your logic
- Test with both provided examples
- Ensure all eligibility criteria are correctly implemented

## Hints and Starter Code 

```java
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Student Information System ===");

        System.out.print("Enter student's name: ");
        String name = input.nextLine();
        System.out.print("Enter student's age: ");
        int age = input.nextInt();

        // TODO: you do the rest.
        boolean resident = input.nextBoolean();
        // gpa is a double, credits is an int, resident is a boolean, so is financial aid

        System.out.println();

        System.out.println("=== STUDENT REPORT ===");
        System.out.println("Name: " + name);
        // TODO: you can handle printing, age, gpa, credits.
        if (resident) {
            System.out.println("Resident: Yes");
        } else {
            System.out.println("Resident: No");
        }
        // TODO: similar for aid.

        System.out.println();

        int standing = 0;
        if (gpa >= 3.5) {
            standing = 4;
        } else if (gpa >= 2.0) {
            standing = 3;
        }// TODO: this for 2 and 1.  use else for 1.

        if (standing == 4) {
            System.out.println("Academic Standing: Dean's List");
        } else if (standing == 3) {
            System.out.println("Academic Standing: Good Standing");
        } // TODO: do 2 and 1. use else for 1

        int grade = 0;
        if (credits >= 90) {
            grade = 12;
        } else if (credits >= 60) {
            grade = 11;
        }// TODO: this for 10 and 9.  use else for 9.

        if (grade == 12) {
            System.out.println("Class Level: Senior");
        } else if (grade == 11) {
            System.out.println("Class Level: Junior");
        }// TODO: this for 10 and 9.  use else for 9.

        System.out.println();

        System.out.println("=== ELIGIBILITY STATUS ===");
        if (standing == 4 && grade >= 11 && credits >= 60) {
            System.out.println("Honor Society: Eligible");
        } else {
            System.out.println("Honor Society: Not Eligible");
        }

        if (credits >= 120 && gpa > 2.0) {
            System.out.println("Graduation: Eligible");
        } else {
            System.out.println("Graduation: Not Eligible (needs 120 more credits)");
        }

        // TODO: you do the financial renewal.  :)

        

    }

}

```
