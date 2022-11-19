package Assignment1;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String date() {
        return (day + "/" + month + "/" + year);
    }

    public String nextDate() {
        for (int dummy : Months.OddDaysMonth) {
            if (month == dummy) {
                nextOddMonthDay();
                return date();
            }
        }

        for (int dummy : Months.EvenDaysMonth) {
            if (month == dummy) {
                nextEvenMonthDay();
                return date();
            }
        }

        if (month == Months.LeapMonth) {
            nextLeapMonthDay();
            return date();
        }

        return null;
    }

    public void nextOddMonthDay() {
        if (day == 31) {
            if (month == 12) {
                year++;
                day = 1;
                month = 1;
            } else {
                month++;
                day = 1;
            }
        } else day++;
    }

    public void nextEvenMonthDay() {
        if (day == 30) {
            month++;
            day = 1;
        } else day++;
    }

    public void nextLeapMonthDay() {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            if (day == 29) {
                month++;
                day = 1;
            } else day++;
        } else {
            if (day == 28) {
                month++;
                day = 1;
            } else day++;
        }
    }
}
