package moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void MoodWithSadMessageTest() throws MoodException {
        MoodAnalyserMain analyser = new MoodAnalyserMain("I am in Sad Mood");
        String mood = analyser.analyseMood();
        Assert.assertEquals("Sad", mood);
    }

    @Test
    public void MoodWithHappyMessageTest() throws MoodException {
        MoodAnalyserMain analyser = new MoodAnalyserMain("I am Happy");
        String mood = analyser.analyseMood();
        Assert.assertEquals("Happy", mood);
    }

    @Test
    public void MoodWithUnknownMessage() throws MoodException {
        MoodAnalyserMain analyser = new MoodAnalyserMain("I am feeling okay");
        String mood = analyser.analyseMood();
        Assert.assertEquals("Unknown", mood);
    }
}