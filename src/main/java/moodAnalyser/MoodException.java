package moodAnalyser;

public class MoodException extends Exception {
    MoodEnumData.EnumExceptionType type;

    public MoodException(MoodEnumData.EnumExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}