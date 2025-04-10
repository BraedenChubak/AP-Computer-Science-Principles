import java.util.*;

class MSOE2018_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minute = 0;
        int hour = 0;
        int day = 0; // add 1 at end
        int month = 0; // add 1 at end
        int[] daysMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = 1970;
        System.out.print("Enter positive int: ");
        int time = input.nextInt();
        minute = time / 60;
        hour = minute / 60;
        minute = minute % 60;
        day = hour / 24;
        hour = hour % 24;
        while (day >= daysMonths[month]) {
            if (year % 4 == 0) { daysMonths[1] = 29; }
            else { daysMonths[1] = 28; }
            day -= daysMonths[month];
            month++;
            if (month == 12) {
                month = 0;
                year++;
            }
        }
        day++; // adding 1 now
        month++; // adding 1 now
        if (hour > 12) {
            hour -= 12;
            System.out.print(hour + ":" + minute + " PM, ");
        } else {
            System.out.print(hour + ":" + minute + " AM, ");
        }
        System.out.println(month + "/" + day + "/" + year);
    }
}
/*
Enter positive int: 1234567890
11:31 PM, 2/13/2009
*/