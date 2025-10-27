package org.school.model;

import java.util.Objects;

public record ContactInfo(String email, String phone) {
    public ContactInfo {
        Objects.requireNonNull(email, "email");
        Objects.requireNonNull(phone, "phone");
        // TODO: Add validation for valid email (must contain '@')
        if (!email.contains("@")) throw new IllegalArgumentException("Invalid email");
    }
}
