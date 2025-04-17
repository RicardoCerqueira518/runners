package dev.cerqueira.runners.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record Run(
    Integer id,
    @NotEmpty
    String title,
    LocalDateTime startTime,
    LocalDateTime endTime,
    @Positive
    Integer kms,
    Location location
) {

    public Run {
        if (!endTime.isAfter(startTime)) {
            throw new IllegalArgumentException("End time must be after start time");
         }
    }


}
