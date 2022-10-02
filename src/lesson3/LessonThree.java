package lesson3;

import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Multiplication Table
        getMultiplicationTable(scanner);

        // 2. Every Seventh Number
        getEverySeventhNumber(scanner);

        // 3. Sequence of Numbers
        getSequenceOfNumbers(scanner);

        // 4. Population Size
        getPopulationSize();

        // 5-6. Final Deposit Sum
        getFinalDeposit(scanner);

        // 7-8. Day of Week
        getDayOfWeek(scanner);

        // 9. Factorial
        getFactorial(scanner);
    }

    public static void getMultiplicationTable(Scanner scanner) {
        int attempt = 0;
        while (attempt != 3) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number > 9 || number < 1) {
                System.out.println("Enter from 1 to 9.");
            } else {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(number + "*" + i + "=" + number * i);
                }
                break;
            }
            attempt++;
        }
    }

    public static void getEverySeventhNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 7; i <= number; i += 7) {
            System.out.print(i + " ");
        }
    }

    public static void getSequenceOfNumbers(Scanner scanner) {
        System.out.print("Enter a length of a sequence: ");
        int length = scanner.nextInt();
        for (int i = 1, b = 1; i <= length; i++, b *= 2) {
            System.out.print(b + " ");
        }
    }

    public static void getPopulationSize() {
        int currentPopulation = 10_000_000;
        double birthRate = 0.014f, deathRate = 0.008f;
        for (int i = 1; i <= 10; i++) {
            currentPopulation += (currentPopulation * birthRate) - (currentPopulation * deathRate);
        }
        System.out.println(currentPopulation);
    }

    public static void getFinalDeposit(Scanner scanner) {
        System.out.print("Enter a deposit amount: ");
        double depositSum = scanner.nextDouble();
        System.out.print("Enter a number of months: ");
        int months = scanner.nextInt();
        double percent = 0.07f;
        for (int i = 1; i <= months; i++) {
            depositSum += depositSum * percent;
        }

//        int i = 1;
//        while (i <= months){
//            depositSum += depositSum * percent;
//            i++;
//        }
        System.out.println("The final amount of the deposit for " + months + " months: " + depositSum);
    }

    public static void getDayOfWeek(Scanner scanner) {
        int attempt = 0;
        while (attempt != 3) {
            System.out.print("Enter a number from 1 to 7: ");
            int number = scanner.nextInt();
            if (number < 1 || number > 7) {
                System.out.println("Enter a number from 1 to 7.");
            } else {
                if (number == 1) {
                    System.out.println("Monday");
                } else if (number == 2) {
                    System.out.println("Tuesday");
                } else if (number == 3) {
                    System.out.println("Wednesday");
                } else if (number == 4) {
                    System.out.println("Thursday");
                } else if (number == 5) {
                    System.out.println("Friday");
                } else {
                    System.out.println("Holiday");
                }

//                switch (number) {
//                    case 1:
//                        System.out.println("Monday");
//                        break;
//                    case 2:
//                        System.out.println("Tuesday");
//                        break;
//                    case 3:
//                        System.out.println("Wednesday");
//                        break;
//                    case 4:
//                        System.out.println("Thursday");
//                        break;
//                    case 5:
//                        System.out.println("Friday");
//                        break;
//                    case 6:
//                    case 7:
//                        System.out.println("Holiday");
//                        break;
//                }
                break;
            }
            attempt++;
        }
    }

    public static void getFactorial(Scanner scanner) {
        System.out.print("Enter a number: ");
        long number = scanner.nextLong(), result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(number + "! = " + result);
    }

}
