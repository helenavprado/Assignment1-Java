package ca.ciccc;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.IllegalFormatPrecisionException;

public class Assignment1 {

    /**
     * Write a function to convert temperature from Fahrenheit to Celsius degree
     * Sample Input : 212
     *
     * @param degree
     * @return "212.0 degree Fahrenheit is equal to 100.0 in Celsius"
     */
    public static String fahrenheitToCelsius(double degree) {

        double celsius = (degree - 32) * ((double) 5 / 9);
        String result = String.format("%.1f degree Fahrenheit is equal to %.1f in Celsius", degree, celsius);

        return result;
    }

    /**
     * Write a function program that takes an integer in inches, converts in to meters.
     * Sample Input : 1000
     *
     * @param inches
     * @return "1000.0 inches is 25.4 meters"
     */
    public static String inchesToMeters(double inches) {
        double meters = inches * 0.0254;
        String result = (inches + " inches is " + meters + " meters");

        return result;
    }

    /**
     * Write a function that takes an integer between 0 and 1000 and adds all the digits.
     * Sample Input : 565
     *
     * @param number
     * @return "The sum of all digits in 565 is 16"
     */
    public static String addDigits(int number) {
        int digitOne = number % 10;
        int remainingNumber = number / 10;
        int digitTwo = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int digitThree = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int digitFour = remainingNumber % 10;
        int sumDigits = digitOne + digitTwo + digitThree + digitFour;
        String result = String.format("The sum of all digits in %d is %d", number, sumDigits);

        return result;
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        int totalMinInYear = 525600;
        int years = mins / totalMinInYear;
        int daysOne = mins % totalMinInYear;
        int daysTwo = daysOne / 1440;
        String result = mins + " minutes is approximately " + years + " years and " + daysTwo + " days";

        return result;
    }

    /**
     * Write a function that takes weight as Kgs(Kilograms) and height as meters and compute
     * body mass index (BMI)
     * Sample Input: kgs = 70, meters = 1.75
     *
     * @param kgs
     * @param meters
     * @return "Body Mass Index is 22.857"
     */
    public static String bmi(int kgs, double meters) {
        double newMeters = meters * meters;
        double oneBmi = kgs / newMeters;
        double n = (Math.round(oneBmi*1000.0)/1000.0);
        String result = "Body Mass Index is " + n;

        return result;
    }

    /**
     * Write a function that takes a distance (in meters) and the time was taken
     * (as three numbers: hours, minutes, seconds), and display the speed, in meters
     * per second, kilometers per hour and miles per hour
     * (hint: 1 mile = 1609 meters).
     * Sample Input :
     * meters = 2500
     * hours = 5
     * minutes = 56
     * seconds = 23
     *
     * @param meters
     * @param hours
     * @param minutes
     * @param seconds
     * @return
     *      "Your speed in meters/second is 0.1169
     *       Your speed in km/h is 0.4208
     *       Your speed in miles/h is 0.2615"
     */
    public static String speed(int meters, int hours, int minutes, int seconds) {

        // km/hour
        // converting meters to km:
        double toKm = (meters / 1000.0);

        //converting seconds and minutes to hours:
        double secondsToHour = seconds / 3600.0;
        double minutesToHour = minutes / 60.0;

        // calculating total in hours:
        double totalHour = hours + minutesToHour + secondsToHour;

        // getting the final result for km/hours:
        double kmHours = toKm / totalHour;


        // miles/hour
        float milesHours = (float) (kmHours / 1.609344);

        // converting hours and minutes to seconds
        double minutesToSeconds = minutes * 60;
        double hoursToSeconds = hours * 60 * 60;
        double totalSeconds = seconds + minutesToSeconds + hoursToSeconds;

        // getting the final result for meters/second:
        double metersSecond = meters / totalSeconds;
        DecimalFormat df = new DecimalFormat("#.####");

        df.setRoundingMode(RoundingMode.FLOOR);
        String meterPerSecond = df.format(metersSecond);
        String kmPerHour = df.format(kmHours);
        String milesPerHour = df.format(milesHours);


        String result = String.format("Your speed in meters/second is %s\nYour speed in km/h is %s\nYour speed in miles/h is %s",meterPerSecond, kmPerHour, milesPerHour);

        return result;

    }

    /**
     * Write a function that reads a number and display the square,
     * cube, and the fourth power.
     * Sample Input :
     * number = 5
     *
     * @param number
     * @return "Square: 25
     *          Cube: 125
     *          Fourth power: 625"
     */
    public static String powers(int number) {
        int square = number * number;
        int cube = number * number * number;
        int fourth = number * number * number * number;
        String result = String.format("Square: %d\nCube: %d\nFourth power: %d", square, cube, fourth);

        return result;
    }

    /**
     * Write a function that takes two integers a and b, then prints the sum,
     * the difference, the product, the average, the distance (absolute value of
     * the difference), the maximum, and the minimum between the two.
     * Sample Input :
     * a = 25
     * b = 5
     *
     * @param a
     * @param b
     * @return "Sum of two integers: 30
     *          Difference of two integers: 20
     *          Product of two integers: 125
     *          Average of two integers: 15.00
     *          Distance of two integers: 20
     *          Max integer: 25
     *          Min integer: 5"
     */
    public static String arithmetic(int a, int b) {
        int sum = a + b;
        int product = a * b;
        float average = (a + b) / 2;
        int difference = 0;
        if (a > b) {
            difference = a - b;
        } else if (a < b) {
            difference = b - a;
        }
        int max = 0;
        if (a > b) {
            max = a;
        } else if (b > a) {
            max = b;
        }

        int min = 0;
        if (a < b) {
            min = a;
        } else if (b < a) {
            min = b;
        }

        String result = String.format("Sum of two integers: %d\nDifference of two integers: %d\nProduct of two integers: %d\nAverage of two integers: %.2f\nDistance of two integers: %d\nMax integer: %d\nMin integer: %d", sum, difference, product, average, difference, max, min);
        return result;
    }
}
