package main;

public class MoodAnalyzer {
	public String analyseMood(String message) {
		if (message.contains("Sad")) {
			System.out.println("SAD");
			return "SAD";
		} else {
			System.out.println("HAPPY");
			return "HAPPY";
		}
	}
}