package com.moodanalyser;

public class MoodAnalyserMain {

	public static void main(String[] args) {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String message = " I am in good mood";
		String mood = moodAnalyser.analyseMood(message);
		System.out.println(mood);
	}
}
