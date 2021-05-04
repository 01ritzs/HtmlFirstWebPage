package com.company;

public class Main {

    public static void main(String[] args) {
        // Video 60 - Challenge seconds and minutes
        getDurationString(61, 48);
    }

    // Create a method called getDurationString with 2 parameters, first
    // parameter minutes and 2nd parameter seconds.
    private static String getDurationString(double minutes, double seconds) {
        // validate that the first parameter minutes is >= 0
        // validate that the 2nd parameter seconds is >=0 and <= 59
        if (minutes < 0 && seconds < 0 && seconds > 59) {
            return "Invalid Value";
        }
        double hours = 0;
        hours = (int) minutes / 60;
        minutes = (int) (minutes % 60);
        return "Hours : " + hours + " Minutes : " + minutes
                + " Seconds : " + seconds;
    }

    public static String getDurationString(double seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        }
        int minutes = (int) seconds / 60;
        seconds = (int) seconds % 60;
        return getDurationString(minutes, seconds);

    }
}
