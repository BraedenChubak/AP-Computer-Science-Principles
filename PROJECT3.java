import java.util.*;
import java.lang.Math;

public class PROJECT3 {
    public static double convert(double amt, double ratefrom, double rateto) {
        return amt * rateto / ratefrom;
    }
    public static void main(String[] args) {
        double[] lengthRates = [1000, 100, 39.37, 3.28, 1.09, 1, 0.0001, 0.0006];
        String[] lengthOpts = ["mm", "cm", "in", "ft", "yd", "m", "km"];
        double[] weightRates = [1000000, 1000, 35.27, 2.2, 1]; // mg, g, oz, lb, kg
        String[] weightOpts = ["mg", "g", "oz", "lb", "kg"];
        double[] volRates = [10000, 1550, 10.76, 1.196, 1, 0.000001]; // cm, in, ft, yd, m, km
        String[] volOpts = ["cm", "in", "ft", "yd", "m", "km"];
        Scanner input = new Scanner(System.in());
        System.out.print("Would you like to convert length, weight, or volume (L, W, V)? ");
        String ans = input.next();
        ans = ans.toUpperCase();
        String from;
        String to;
        if (ans.equals("L")) {
            System.out.println("What unit would you like to convert FROM? ")
            from = input.next().toLowerCase();
            for (int i = 0; i < lengthOpts.length; i++) {
                if (from.equals(lengthOpts[i])) {
                    
                }
            }
            System.out.println("What unit would you like to convert TO? ")
            to = input.next();
        } else if (ans.equals("W")) {
            System.out.println("What unit would you like to convert FROM? ")
            from = input.next();
            System.out.println("What unit would you like to convert TO? ")
            to = input.next();
        } else if (ans.equals("V")) {
            System.out.println("What unit would you like to convert FROM? ")
            from = input.next();
            System.out.println("What unit would you like to convert TO? ")
            to = input.next();
        } else {
            System.out.println("INVALID INPUT")
        }
    }
}