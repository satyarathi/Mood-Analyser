package com.moodanalyser;

public class MoodAnalyserMain {

	public static void main(String[] args) {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String message = " I am happy";
		String mood = moodAnalyser.analyseMood(message);
		System.out.println(mood);
	}
}
