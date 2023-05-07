package moodAnalyser;

public class MoodAnalyserMain {
    private String message;

    public MoodAnalyserMain(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("happy")) {
            return "Happy";
        } else if (message.contains("sad")) {
            return "Sad";
        } else {
            return "Unknown";
        }
    }
    public static void main(String[] args) {
        MoodAnalyserMain analyser = new MoodAnalyserMain("I am Any today.");
        String mood = analyser.analyseMood();
        System.out.println("Mood: " + mood);
    }
}
