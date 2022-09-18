package lesson2;

public class LessonTwo {
    public static void main(String[] args) {
        System.out.println(convertToCelsius(-10));
        System.out.println(convertToCentimeters(12));
        System.out.println(compareThreeNumbers(1,2,3));
        System.out.println(sumOfNumbers(555));

    }

    //  4. Fahrenheit to Celsius
    public static double convertToCelsius(double degreeFahrenheit) {
        return Math.round((degreeFahrenheit - 32) * 5 / 9);
    }

    //  5. Inches to Centimeters
    public static double convertToCentimeters(double inches) {
        return inches * 2.54;
    }

    // 6. Compare three numbers
    public static double compareThreeNumbers(double firstNumber, double secondNumber, double thirdNumber) {
        double maxNumber = firstNumber;
        if (maxNumber < secondNumber) {
            maxNumber = secondNumber;
        }
        if (maxNumber < thirdNumber) {
            maxNumber = thirdNumber;
        }
        return maxNumber;
    }

    // 7. Sum of numbers
    public static int sumOfNumbers(int number) {
        String num = Integer.toString(number);

        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += Character.getNumericValue(num.charAt(i));
        }
        return sum;


    }
}
