import java.util.*;

public class MSOE2009_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter lat of car (degrees): ");
        double cLat = input.nextDouble();
        cLat *= 3.14159 / 180;
        System.out.print("Enter long of car (degrees): ");
        double cLong = input.nextDouble();
        cLong *= 3.14159 / 180;
        System.out.print("Enter lat of you (degrees): ");
        double pLat = input.nextDouble();
        pLat *= 3.14159 / 180;
        System.out.print("Enter long of you (degrees): ");
        double pLong = input.nextDouble();
        pLong *= 3.14159 / 180;
        double r = 3963.1;

        double d = Math.cos(cLat) * Math.cos(cLong) * Math.cos(pLat) * Math.cos(pLong);
        d += Math.cos(cLat) * Math.sin(cLong) * Math.cos(pLat) * Math.sin(pLong);
        d += Math.sin(cLat) * Math.sin(pLat);
        d = Math.acos(d);
        d *= r;
        System.out.println("Your car is " + d + " miles away!");
    }
}
/*
Enter lat of car (degrees): 43.045
Enter long of car (degrees): -87.918
Enter lat of you (degrees): 43.043
Enter long of you (degrees): -87.905
Your car is 0.6715639801539808 miles away!
*/