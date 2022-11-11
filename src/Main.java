public class Main {
    public static void main(String[] args) {
        // Task 1
        int now_a_Year = 2022;
        int twoHundredYearsBeforeThisYear = now_a_Year - 200;
        int afterTheHundredthYearOfTheCurrentYear = now_a_Year + 100;
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