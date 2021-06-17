package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.MoodAnalyserException;
import main.MoodAnalyzer;

class MoodAnalyserTests {

	@Test
	public void testMoodAnalyzer_Constructor_SadMessage_shouldReturn_SAD() throws Exception {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		String mood;
		try {
			mood = moodAnalyzer.analyseMood();
			assertEquals("SAD", mood);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test
	public void testMoodAnalyzer_Constructor_SadMessage_shouldReturn_HAPPY() throws MoodAnalyserException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood ");
		String mood;
		try {
			mood = moodAnalyzer.analyseMood();
			assertEquals("HAPPY", mood);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Test
	public void testMoodAnalyzer_Constructor_SadMessage_shouldReturn_Empty() throws MoodAnalyserException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(" ");
		String mood;
		try {
			mood = moodAnalyzer.analyseMood();
			assertEquals("Empty", mood);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Test
	public void testMoodAnalyzer_Constructor_SadMessage_shouldReturn_Null() throws MoodAnalyserException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		String mood;
		try {
			mood = moodAnalyzer.analyseMood();
			assertEquals("null", mood);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
