package main;

import java.util.*;
import test.CustomException;

public class MoodAnalyzer {
	public static String MoodAnalyzer() throws CustomException {
		String message = " ";
		try {
			if (message == " ")
				return "Empty";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new CustomException("Empty Mood.....Enter valid Mood");
		}
	}

	public static String MoodAnalyzer(String message) throws CustomException {
		try {
			if (message == " ")
				return "Empty";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new CustomException("Empty Mood.....Enter valid mood ");
		}
	}
}