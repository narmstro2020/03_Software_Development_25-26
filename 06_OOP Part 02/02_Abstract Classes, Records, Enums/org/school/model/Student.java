package org.school.model;

public class Student extends Person {
    private final int gradeLevel;

    // TODO: Complete constructor and call super()
    public Student(String first, String last, int gradeLevel) {
        super(first, last);
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String present() {
        // TODO: Return formatted string like: "Hi, I'm Alex Smith, a grade 11 student."
        return "Hi, I'm %s, a grade %d student.".formatted(fullName(), gradeLevel);
    }
}
