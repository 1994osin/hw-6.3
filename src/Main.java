public class Main {
    public static void main(String[] args) {
        // Task 1
        int nowYear = 2022;
        int twoHundredYearsBeforeThisYear = nowYear - 200;
        int afterTheHundredthYearOfTheCurrentYear = nowYear + 100;
        for (int i = 0; i <= afterTheHundredthYearOfTheCurrentYear; i += 79) {
            if (i >= twoHundredYearsBeforeThisYear)
                System.out.println(i);
        }
        System.out.println();

        // Task 2
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 + " * " + i + " = " + (2 * i));
        }

    }
}