package edu.epam.array.exception;

public class InfoException extends Exception {
    public InfoException() {
    }

    public InfoException(String message) {
        super(message);
    }

    public InfoException(Throwable cause) {
        super(cause);
    }

    public InfoException(String message, Throwable cause) {
        super(message, cause);
    }
}
