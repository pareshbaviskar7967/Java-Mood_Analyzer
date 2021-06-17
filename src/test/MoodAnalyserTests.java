package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.MoodAnalyzer;

class MoodAnalyserTests {

	@Test
	public void testMoodAnalyzer_Constructor_SadMessage_shouldReturn_SAD() {
		String mood = MoodAnalyzer.MoodAnalyzer(null);
		System.out.println(mood);
		mood = MoodAnalyzer.MoodAnalyzer();
		System.out.println(mood);
		assertEquals("HAPPY", mood);
	}
}
