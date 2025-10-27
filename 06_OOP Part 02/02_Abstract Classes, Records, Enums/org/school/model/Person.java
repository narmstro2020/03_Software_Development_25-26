package org.school.model;

public abstract class Person {
    private final String firstName;
    private final String lastName;

    protected Person(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public String firstName() { return firstName; }
    public String lastName()  { return lastName; }

    // TODO: Implement this in subclasses
    public abstract String present();

    public String fullName() {
        return "%s %s".formatted(firstName, lastName);
    }
}
