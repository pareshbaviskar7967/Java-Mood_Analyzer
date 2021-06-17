package main;

import java.util.*;
import test.CustomException;
import main.MoodAnalyserException.Code;

public class MoodAnalyzer {
	public String message;

	public MoodAnalyzer() {

	}

	public MoodAnalyzer(String message) throws MoodAnalyserException {
		super();
		this.message = message;

	}

	public String analyseMood() throws Exception {
		try {
			if (message == null)
				throw new MoodAnalyserException(Code.NULL, "Null Mood");
			else if (message.trim().isEmpty())
				throw new MoodAnalyserException(Code.EMPTY, "Empty Mood");
			else if (message.toLowerCase().contains("sad")) {
				System.out.println("SAD");
				return "SAD";
			} else if (message.toLowerCase().contains("happy")) {
				System.out.println("HAPPY");
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalyserException(Code.INVALID, "Empty Mood.....Enter valid Mood");
		}
		return null;
	}
}
