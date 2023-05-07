package moodAnalyser;

public class MoodException extends Exception {
    public MoodException(String message, Exception e) {
        super(message);
    }
}