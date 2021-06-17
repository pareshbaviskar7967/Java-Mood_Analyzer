package main;

public class MoodAnalyzer {
	public static String MoodAnalyzer() {
		String message = null;
		try {
			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}

	public static String MoodAnalyzer(String message) {
		try {
			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}