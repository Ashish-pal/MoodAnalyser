package moodAnalyser;

public class MoodException extends Exception {
    public MoodException(String message) {
        super(message);
    }

    public MoodException(String message, Throwable cause) {
        super(message, cause);
    }
}