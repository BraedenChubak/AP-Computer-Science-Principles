import java.util.*;
import java.lang.Math;

public class PROJECT3 {
    public static double convert(double amt, double ratefrom, double rateto) {
        if (ratefrom >= rateto) {
            rateto /= ratefrom;
            return amt * rateto;
        } else {
            ratefrom /= rateto;
            return amt / ratefrom;
        }
    }
    public static void main(String[] args) {
        double[] lengthRates = {1000, 100, 39.37, 3.2808, 1.0936, 1, 0.0001, 0.0006214};
        String[] lengthOpts = {"mm", "cm", "in", "ft", "yd", "m", "km"};
        double[] weightRates = {1000000, 1000, 35.274, 2.2, 1}; // mg, g, oz, lb, kg
        String[] weightOpts = {"mg", "g", "oz", "lb", "kg"};
        double[] volRates = {10000, 1550, 10.76, 1.196, 1, 0.000001}; // cm, in, ft, yd, m, km
        String[] volOpts = {"cm", "in", "ft", "yd", "m", "km"};
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to convert length, weight, or volume (L, W, V)? ");
        String ans = input.next();
        ans = ans.toUpperCase();
        String from;
        String to;
        double fromRate = -1;
        double toRate = -1;
        int fromIndex = -1;
        int toIndex = -1;
        double amtBefore;
        if (ans.equals("L")) {
            System.out.print("What unit would you like to convert FROM? ");
            from = input.next().toLowerCase();
            for (int i = 0; i < lengthOpts.length; i++) {
                if (from.equals(lengthOpts[i])) {
                    fromRate = lengthRates[i];
                    fromIndex = i;
                }
            }
            if (fromRate == -1) {
                System.out.println("INVALID UNIT");
                return;
            }
            System.out.print("What unit would you like to convert TO? ");
            to = input.next();
            for (int i = 0; i < lengthOpts.length; i++) {
                if (to.equals(lengthOpts[i])) {
                    toRate = lengthRates[i];
                    toIndex = i;
                }
            }
            if (toRate == -1) {
                System.out.println("INVALID UNIT");
                return;
            }
            System.out.print("How much of the first unit are you converting? ");
            amtBefore = input.nextDouble();
            System.out.println(amtBefore + lengthOpts[fromIndex] + " = " + convert(amtBefore, fromRate, toRate) + lengthOpts[toIndex]);
        } else if (ans.equals("W")) {
            System.out.print("What unit would you like to convert FROM? ");
            from = input.next().toLowerCase();
            for (int i = 0; i < weightOpts.length; i++) {
                if (from.equals(weightOpts[i])) {
                    fromRate = weightRates[i];
                    fromIndex = i;
                }
            }
            if (fromRate == -1) {
                System.out.println("INVALID UNIT");
                return;
            }
            System.out.print("What unit would you like to convert TO? ");
            to = input.next();
            for (int i = 0; i < weightOpts.length; i++) {
                if (to.equals(weightOpts[i])) {
                    toRate = weightRates[i];
                    toIndex = i;
                }
            }
            if (toRate == -1) {
                System.out.println("INVALID UNIT");
                return;
            }
            System.out.print("How much of the first unit are you converting? ");
            amtBefore = input.nextDouble();
            System.out.println(amtBefore + weightOpts[fromIndex] + " = " + convert(amtBefore, fromRate, toRate) + weightOpts[toIndex]);
        } else if (ans.equals("V")) {
            System.out.print("What unit would you like to convert FROM? ");
            from = input.next().toLowerCase();
            for (int i = 0; i < volOpts.length; i++) {
                if (from.equals(volOpts[i])) {
                    fromRate = volRates[i];
                    fromIndex = i;
                }
            }
            if (fromRate == -1) {
                System.out.println("INVALID UNIT");
                return;
            }
            System.out.print("What unit would you like to convert TO? ");
            to = input.next();
            for (int i = 0; i < volOpts.length; i++) {
                if (to.equals(volOpts[i])) {
                    toRate = volRates[i];
                    toIndex = i;
                }
            }
            if (toRate == -1) {
                System.out.println("INVALID UNIT");
                return;
            }
            System.out.print("How much of the first unit are you converting? ");
            amtBefore = input.nextDouble();
            System.out.println(amtBefore + volOpts[fromIndex] + "^2 = " + convert(amtBefore, fromRate, toRate) + volOpts[toIndex] + "^2");
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}