package org.example.prof.lessonTwentyThree.homeWorkTwentyThree.taskTwo;

public class StorageOverflowException extends RuntimeException{

    public StorageOverflowException(String message) {
        super(message);
    }

    public StorageOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageOverflowException(Throwable cause) {
        super(cause);
    }
}
