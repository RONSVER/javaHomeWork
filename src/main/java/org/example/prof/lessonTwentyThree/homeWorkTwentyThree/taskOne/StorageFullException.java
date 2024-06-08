package org.example.prof.lessonTwentyThree.homeWorkTwentyThree.taskOne;

public class StorageFullException extends RuntimeException {
    public StorageFullException(String message) {
        super(message);
    }

    public StorageFullException(Throwable cause) {
        super(cause);
    }

    public StorageFullException(String message, Throwable cause) {
        super(message, cause);
    }
}
