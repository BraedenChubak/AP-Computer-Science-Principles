import java.util.*;
import java.lang.Math;

public class PROJECT3OLD {
    static double[] lengthRates = {1000, 100, 39.37, 3.2808, 1.0936, 1, 0.0001, 0.0006214};
    static String[] lengthOpts = {"mm", "cm", "in", "ft", "yd", "m", "km"};
    static double[] weightRates = {1000000, 1000, 35.274, 2.2, 1};
    static String[] weightOpts = {"mg", "g", "oz", "lb", "kg"};
    static double[] volRates = {10000, 1550, 10.76, 1.196, 1, 0.000001};
    static String[] volOpts = {"cm", "in", "ft", "yd", "m", "km"};
    public static String convert(double amt, String fromType, String toType, String type) {
        double fromrate = -1;
        double torate = -1;
        if (type.equals("L")) {
            for (int i = 0; i < lengthOpts.length; i++) {
                if (fromType.equals(lengthOpts[i])) {fromrate = lengthRates[i];}
                if (toType.equals(lengthOpts[i])) {torate = lengthRates[i];}
            }
            return (amt + fromType + " = " + (amt * torate / fromrate) + toType);
        } else if (type.equals("W")) {
            for (int i = 0; i < weightOpts.length; i++) {
                if (fromType.equals(weightOpts[i])) {fromrate = weightRates[i];}
                if (toType.equals(weightOpts[i])) {torate = weightRates[i];}
            }
            return (amt + fromType + " = " + (amt * torate / fromrate) + toType);
        } else if (type.equals("V")) {
            for (int i = 0; i < volOpts.length; i++) {
                if (fromType.equals(volOpts[i])) {fromrate = volRates[i];}
                if (toType.equals(volOpts[i])) {torate = volRates[i];}
            }
            return (amt + fromType + "^3 = " + (amt * torate / fromrate) + toType + "^3");
        } else {
            return "ERROR";
        }
    }
    public static void main(String[] args) {
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
            System.out.println(convert(amtBefore, from, to, ans));
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
            System.out.println(convert(amtBefore, from, to, ans));
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
            System.out.println(convert(amtBefore, from, to, ans));
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}