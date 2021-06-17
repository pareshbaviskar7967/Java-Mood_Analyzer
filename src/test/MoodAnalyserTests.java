package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.MoodAnalyzer;

class MoodAnalyserTests {

	MoodAnalyzer moodanalyzer = new MoodAnalyzer();

	@Test
	public void testMoodAnalyzer_anyMOod_shouldReturn_Happy() {
		String mood = moodanalyzer.analyseMood("I am in Any Mood");
		assertEquals("HAPPY", mood);
	}
}
