public class Date {
    private int month;
    private int day;
    private int year;

    private static final String[] MONTHS = {
        "January", "February", "March", "April", "May", "June", "July", "August",
        "September", "October", "November", "December"
    };

    private static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }


    public Date(String monthName, int day, int year) {
        this.month = findMonthIndex(monthName);
        this.day = day;
        this.year = year;
    }

    public Date(int dayOfYear, int year) {
        this.year = year;
        setDateFromDayOfYear(dayOfYear);
    }

    private int findMonthIndex(String monthName) {
        for (int i = 0; i < MONTHS.length; i++) {
            if (MONTHS[i].equalsIgnoreCase(monthName)) {
                return i + 1;
            }
        }
        throw new IllegalArgumentException("Mês inválido.");
    }

    private void setDateFromDayOfYear(int dayOfYear) {
        int month = 0;
        while (dayOfYear > DAYS_IN_MONTH[month]) {
            dayOfYear -= DAYS_IN_MONTH[month];
            month++;
        }
        this.month = month + 1;
        this.day = dayOfYear;
    }

    public void displayDateInMMDDYYYY() {
        System.out.printf("%02d/%02d/%d%n", month, day, year);
    }

    public void displayDateInMonthDayYear() {
        System.out.printf("%s %d, %d%n", MONTHS[month - 1], day, year);
    }

    public void displayDateInDDDYYYY() {
        System.out.printf("%d %d%n", getDayOfYear(), year);
    }

    private int getDayOfYear() {
        int dayOfYear = day;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += DAYS_IN_MONTH[i];
        }
        return dayOfYear;
    }

    public static void main(String[] args) {
        Date date1 = new Date(6, 14, 1992);
        date1.displayDateInMMDDYYYY();
        date1.displayDateInMonthDayYear();
        date1.displayDateInDDDYYYY();

        Date date2 = new Date("June", 14, 1992);
        date2.displayDateInMMDDYYYY();
        date2.displayDateInMonthDayYear();
        date2.displayDateInDDDYYYY();

        Date date3 = new Date(165, 1992);
        date3.displayDateInMMDDYYYY();
        date3.displayDateInMonthDayYear();
        date3.displayDateInDDDYYYY();
    }
}
