package uz.yshub.miniotutorial.exception;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponseModel {
    private String status;
    private String errorCode;
    private String errorMessage;
    private LocalDateTime timestamp;
}
