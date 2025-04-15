package dev.cerqueira.runners.run;

import java.time.LocalDateTime;

public record Run(
    Integer id,
    String title,
    LocalDateTime startTime,
    LocalDateTime endTime,
    Integer kms,
    Location location
) {

}
