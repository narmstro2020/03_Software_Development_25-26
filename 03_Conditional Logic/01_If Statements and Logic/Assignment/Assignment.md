# Assignment 2: Student Information System

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

**Financial Aid Renewal:**
- Must have GPA >= 2.0 AND
- Must be making satisfactory progress (at least 12 credits per year based on age)

**Scholarship Eligibility:**
- Must have GPA >= 3.0 AND
- Must be a resident (in-state) AND
- Must not already have financial aid

### Part 5: Recommendations
Based on the student's information, provide recommendations:
- If GPA < 2.0: Suggest tutoring services
- If credits < expected for age: Suggest academic counseling
- If eligible for scholarship but no financial aid: Recommend applying for scholarships
- If close to graduation (100+ credits): Remind to meet with advisor

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
Financial Aid Renewal: N/A (no current aid)
Scholarship: Eligible

=== RECOMMENDATIONS ===
- You are eligible for scholarship programs! Consider applying.
- Keep up the excellent work to maintain Dean's List status.
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
Financial Aid Renewal: Not Eligible (GPA too low)
Scholarship: Not Eligible

=== RECOMMENDATIONS ===
- Your GPA is below 2.0. We strongly recommend tutoring services.
- You may be behind on credits for your age. Consider meeting with an academic counselor.
- Your financial aid may be at risk. Focus on improving your GPA this semester.
```

## Requirements Checklist
- [ ] Collect all required student information
- [ ] Correctly classify academic standing based on GPA
- [ ] Correctly determine class level based on credits
- [ ] Implement all eligibility checks using proper boolean logic
- [ ] Use if-else if statements for classifications
- [ ] Use boolean operators (&&, ||) for complex eligibility criteria
- [ ] Provide appropriate recommendations based on student status
- [ ] Format output clearly with proper sections
- [ ] Handle boolean input properly
- [ ] Use proper variable names and comments

## Technical Requirements
- Use Scanner for all input
- Use appropriate data types for each variable
- Use boolean variables to store true/false conditions
- Use if-else if-else statements for multi-option classifications
- Use compound boolean expressions for complex eligibility checks
- Display results in a clear, organized format

## Starter Code Hints
Your program structure should include:
1. Input collection section
2. Academic standing classification method
3. Class level determination method
4. Eligibility checking methods
5. Recommendation generation logic
6. Formatted output display

## Submission Requirements
- Submit your Java file named `StudentInfoSystem.java`
- Include comprehensive comments explaining your logic
- Test with both provided examples
- Ensure all eligibility criteria are correctly implemented
