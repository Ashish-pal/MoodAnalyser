package moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void testAnalyseMood() {
        MoodAnalyserMain analyser = new MoodAnalyserMain("I am in Any Mood");
        String mood = analyser.analyseMood();
        Assert.assertEquals("Sad", mood);
    }
}