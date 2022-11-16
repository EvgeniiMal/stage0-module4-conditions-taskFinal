package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year <= 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }
        boolean yearIsLeap = (0 == year % 400) || (0 == year % 4 && 0 != year % 100);
        int daysInFeb = yearIsLeap ? 29 : 28;

        if (month == 2) {
            System.out.println(daysInFeb);
        } else if (month % 2 == 0) {
            System.out.println(30);
        } else {
            System.out.println(30);
        }
    }
}
