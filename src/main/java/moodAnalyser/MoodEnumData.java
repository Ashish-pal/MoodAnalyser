package moodAnalyser;

public class MoodEnumData {
    public static enum MoodType {
        EMPTY("Invalid mood: empty message"),
        NULL("Invalid mood: null message");

        private final String message;

        MoodType(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
