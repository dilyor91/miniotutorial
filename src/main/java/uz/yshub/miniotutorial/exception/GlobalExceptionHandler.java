package uz.yshub.miniotutorial.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseModel> error(Exception error) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(ErrorResponseModel.builder()
                .status("err")
                .errorCode("klj")
                .errorMessage(error.getMessage())
                .timestamp(LocalDateTime.now()).build());
    }
}
