package org.example.prof.lessonTwentyThree.homeWorkTwentyThree.taskOne;

public class NoSuchBookException extends RuntimeException {

    public NoSuchBookException(String message) {
        super(message);
    }

    public NoSuchBookException(Throwable cause) {
        super(cause);
    }

    public NoSuchBookException(String message, Throwable cause) {
        super(message, cause);
    }
}
