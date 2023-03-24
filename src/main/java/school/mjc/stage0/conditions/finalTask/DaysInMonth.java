package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

        boolean is_leap_year = false;

        if (year % 4 == 0) {
            is_leap_year = true;

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    is_leap_year = true;
                else
                    is_leap_year = false;
            }
        }
        else
            is_leap_year = false;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println(31);
            }
            case 4, 6, 9, 11 -> {
                System.out.println(30);
            }
            case 2 -> {
                if (!is_leap_year)
                    System.out.println(28);
                else
                    System.out.println(29);
            }
            default -> {
                System.out.println("invalid date");
            }
        }
    }
}
