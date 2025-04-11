import java.util.*;

class MSOE2021_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter water in reservoir: ");
        int reservoir = input.nextInt();
        System.out.print("Enter list of cup sizes separated by one space each: ");
        input.nextLine();
        String cups = input.nextLine();
        String[] tempCups = cups.split(" ");
        int[] cupInts = new int[tempCups.length];
        for (int i = 0; i < tempCups.length; i++) {
            cupInts[i] = Integer.parseInt(tempCups[i]);
            cupInts[i]++;
        }
        int count = 0;
        for (int i = 0; i < cupInts.length; i++) {
            reservoir -= cupInts[i];
            if (reservoir < 10) {
                System.out.println("Filled " + (i+1) + " cups.");
                break;
            }
        }
    }
}
/*
Enter water in reservoir: 34
Enter list of cup sizes separated by one space each: 4 6 6 4 4 8 6
Filled 5 cups.
*/