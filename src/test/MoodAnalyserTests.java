package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.MoodAnalyzer;

class MoodAnalyserTests {

	MoodAnalyzer moodanalyzer = new MoodAnalyzer();

	@Test
	public void testMoodAnalyzer() throws Exception {
		System.out.println("Welcome to the mood analyzer");
		String mood = moodanalyzer.analyseMood("I am in Sad Mood");
		assertEquals("SAD", mood);
	}
}
