public class SecondLesson {
    public static void main(String[] args) {
        // Convert Fahrenheit to Celsius
        double fahrenheitTemperature = 99;
        System.out.println("For fahrenheit temperature " + fahrenheitTemperature
                + " celsius temperature is: " + convertFahrenheitToCelsius(fahrenheitTemperature));

        // Convert Celsius to Fahrenheit
        float celsiusTemperature = 55;
        System.out.println("For celsius temperature " + celsiusTemperature
                + " Fahrenheit temperature is: " + convertCelsiusToFahrenheit(celsiusTemperature));

        // Convert Celsius to Kelvin
        System.out.println("For celsius temperature " + celsiusTemperature
                + " Kelvin temperature is: " + convertCelsiusToKelvin(celsiusTemperature));

        // Convert meters to inches
        // 1m = 39.37in
        double meters = 180;
        System.out.println(meters + " meters equals to "
                + convertMetersToInches(meters) + " Inches");

        // Convert inches to meters
        // 1m = 39.37in
        double inches = 6.5;
        System.out.println(inches + " inches equals to "
                + convertInchesToMeters(inches) + " meters");

        // Convert miles to kilometres
        // 1mi = 1.609km
        double miles = 22;
        System.out.println(miles + " miles equals to "
                + convertMilesToKilometres(miles) + " kilometres");

        // Convert kilometres to miles
        // 1mi = 1.609km
        double kilometres = 76;
        System.out.println(kilometres + " kilometres equals to "
                + convertKilometresToMiles(kilometres) + " miles");

        // Convert kilograms to pounds
        // 1kg = 2.2046lb
        double kilograms = 76;
        System.out.println(kilograms + " kilograms equals to "
                + convertKilogramsToPounds(kilograms) + " pounds");

        // Convert pounds to kilograms
        // 1kg = 2.2046lb
        double pounds = 84;
        System.out.println(pounds + " pounds equals to "
                + convertPoundsToKilograms(pounds) + " kilograms");

        // Convert speed km/hr to mi/hr
        // 1km/hr = 0.6214mi/hr
        double kilometresPerHour = 220;
        System.out.println(kilometresPerHour + " km/hr equals to "
                + convertKilometresPerHourToMilesPerHour(kilometresPerHour) + " mi/hr");

        // Convert speed mi/hr to km/hr
        // 1km/hr = 0.6214mi/hr
        double milesPerHour = 120;
        System.out.println(milesPerHour + " mi/hr equals to "
                + convertMilesPerHourKilometresPerHour(milesPerHour) + " km/hr");

        // calculate the test result percentage
        int maxTestScore = 180;
        float testMark = 178;
        System.out.println("You've done test with " + Math.round(calculatePercentage(maxTestScore, testMark)) + " percents");

        // Compare ages
        int husband = 31;
        int wife = 30;
        boolean compareResult = ageCompare(wife, husband);

        if (compareResult) {
            System.out.println("Both wife and husband have age less than 35");
        } else {
            System.out.println("Somebody has age more than 35");
        }

        // Incomes check
        float incomes = 5000;
        boolean incomesResult = incomesCheck(incomes);
        if (incomesResult) {
            System.out.println("Incomes between 20000 and 50000");
        } else {
            System.out.println("Incomes less than 20000 or more than 50000");
        }


        // Existing Apples check
        boolean firstApples = false;
        boolean secondApples = false;
        if (checkApplesExisting(firstApples, secondApples)) {
            System.out.println("Apples are in the shop");
        } else {
            System.out.println("No Apples are in the shop");
        }
    }

    private static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double convertCelsiusToKelvin(double celsius) {
        return celsius + 273.16;
    }

    private static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    private static boolean ageCompare(int x, int y) {
        return x < 35 & y < 35;
    }

    private static boolean incomesCheck(float x) {
        return x <= 50000 & x >= 20000;
    }

    private static double convertMetersToInches(double meters) {
        return meters / 39.37;
    }

    private static double convertInchesToMeters(double inches) {
        return 39.37 * inches;
    }

    private static double convertMilesToKilometres(double miles) {
        return 1.609 * miles;
    }

    private static double convertKilometresToMiles(double kilometres) {
        return kilometres / 1.609;
    }

    private static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.2046;
    }

    private static double convertPoundsToKilograms(double pounds) {
        return pounds / 2.2046;
    }

    private static double convertKilometresPerHourToMilesPerHour(double kilometresPerHour) {
        return kilometresPerHour * 0.6214;
    }

    private static double convertMilesPerHourKilometresPerHour(double milesPerHour) {
        return milesPerHour / 0.6214;
    }

    private static double calculatePercentage(int maxScore, float mark) {
        return mark / maxScore * 100;
    }

    private static boolean checkApplesExisting(boolean firstSort, boolean secondSort) {
        return firstSort | secondSort;
    }
}
