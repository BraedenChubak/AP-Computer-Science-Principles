import java.util.*;

public class MSOE2007_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] addresses = input.nextLine().split(" ");

        double ns1 = Double.parseDouble(addresses[0]);
        if (addresses[1].equals("S")) { ns1 *= -1; }
        double ew1 = Double.parseDouble(addresses[2]);
        if (addresses[3].equals("W")) { ew1 *= -1; }

        double ns2 = Double.parseDouble(addresses[5]);
        if (addresses[6].equals("S")) { ns2 *= -1; }
        double ew2 = Double.parseDouble(addresses[7]);
        if (addresses[8].equals("W")) { ew2 *= -1; }

        ew1 /= 800;
        ew2 /= 800;
        double ew = Math.abs(ew1-ew2);
        ns1 /= 1200;
        ns2 /= 1200;
        double ns = Math.abs(ns1-ns2);

        double miles = Math.sqrt(Math.pow(ew, 2) + Math.pow(ns, 2));
        System.out.println(miles + " mi");
    }
}
/*
100 S 25 E to 310 N 445 W
0.6796266336093011 mi
*/