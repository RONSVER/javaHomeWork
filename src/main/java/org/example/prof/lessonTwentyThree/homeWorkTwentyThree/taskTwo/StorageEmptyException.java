package org.example.prof.lessonTwentyThree.homeWorkTwentyThree.taskTwo;

public class StorageEmptyException extends RuntimeException{

    public StorageEmptyException(String message) {
        super(message);
    }

    public StorageEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageEmptyException(Throwable cause) {
        super(cause);
    }
}
