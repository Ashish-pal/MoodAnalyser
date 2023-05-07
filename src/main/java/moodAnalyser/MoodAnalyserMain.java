package moodAnalyser;

public class MoodAnalyserMain {
    private String message;

    public MoodAnalyserMain(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodException {
        try {
            if (message.contains("happy")) {
                return "Happy";
            } else if (message.contains("sad")) {
                return "Sad";
            } else {
                return "Unknown";
            }
        } catch (Exception e) {
            throw new MoodException("Invalid mood", e);
        }
    }
    public static void main(String[] args) throws MoodException {
        MoodAnalyserMain analyser = new MoodAnalyserMain("I am Happy today.");
        String mood = analyser.analyseMood();
        System.out.println("Mood: " + mood);
    }
}
