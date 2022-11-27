package com.moodanalyser;

public class MoodAnalyser {

	String message;

	public MoodAnalyser(String message) {
		this .message = message;
	}

	public MoodAnalyser() {
		super();
	}

	public String analyseMood(String message) {
		try {
			if (message.contains("sad")) {
				return "SAD";
			}else {
				return "HAPPY";
			}
		}
		catch(Exception exception) {
			return "HAPPY";
		}
	}
}
