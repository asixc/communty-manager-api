package dev.jotxee.security.auth.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@Slf4j
@ControllerAdvice
public class AuthenticationExceptionManager {

    @ExceptionHandler(AuthenticationException.class)
    protected ResponseEntity<Object> handleConflict(){
        final String msg = "User not validated";
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(msg);
    }
}
