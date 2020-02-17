package com.ojhasons.myappp.model;

import org.springframework.http.HttpStatus;

import java.util.Objects;

public class ErrorResponse {

    private HttpStatus httpStatus;

    private String message;

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorResponse that = (ErrorResponse) o;
        return httpStatus == that.httpStatus &&
            Objects.equals(message, that.message);
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
            "httpStatus=" + httpStatus +
            ", message='" + message + '\'' +
            '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(httpStatus, message);
    }
}
