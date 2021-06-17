package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.MoodAnalyzer;

public class MoodAnalyserTests {
	@Test
	public void testMoodAnalyzer_Constructor_SadMessage_shouldReturn_SAD() {
		try {
			String mood = MoodAnalyzer.MoodAnalyzer(null);
			System.out.println(mood);
			mood = MoodAnalyzer.MoodAnalyzer();
			System.out.println(mood);
			assertEquals("SAD", mood);
		} catch (CustomException e) {
			System.out.println(e);
		}
	}

	@Test
	public void testMoodAnalyzer_Constructor_SadMessage_shouldReturn_HAPPY() {
		try {
			String mood = MoodAnalyzer.MoodAnalyzer(null);
			System.out.println(mood);
			mood = MoodAnalyzer.MoodAnalyzer();
			System.out.println(mood);
			assertEquals("HAPPY", mood);
		} catch (CustomException e) {
			System.out.println(e);
		}
	}
}