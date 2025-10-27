package org.school.model;

import java.time.LocalDate;
import java.util.Objects;

public record Enrollment(Person person, Status status, LocalDate startDate) {
    public Enrollment {
        Objects.requireNonNull(person);
        Objects.requireNonNull(status);
        Objects.requireNonNull(startDate);
    }

    public String summary() {
        return "%s (%s) since %s"
                .formatted(person().fullName(), status(), startDate());
    }
}
