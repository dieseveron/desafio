package com.gestordoc.exception;

public class DocumentMismatchException extends RuntimeException {
    public DocumentMismatchException() {
        super();
    }

    public DocumentMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public DocumentMismatchException(final String message) {
        super(message);
    }

    public DocumentMismatchException(final Throwable cause) {
        super(cause);
    }
}
