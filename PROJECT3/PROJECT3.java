import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PROJECT3 extends JFrame {
    static double[] lengthRates = {1000, 100, 39.37, 3.2808, 1.0936, 1, 0.0001, 0.0006214};
    static String[] lengthOpts = {"mm", "cm", "in", "ft", "yd", "m", "km"};
    static double[] weightRates = {1000000, 1000, 35.274, 2.2, 1};
    static String[] weightOpts = {"mg", "g", "oz", "lb", "kg"};
    static double[] volRates = {10000, 1550, 10.76, 1.196, 1, 0.000001};
    static String[] volOpts = {"cm", "in", "ft", "yd", "m", "km"};

    String from;
    String to;
    double fromRate = -1;
    double toRate = -1;
    int fromIndex = -1;
    int toIndex = -1;
    int amt;

    private JPanel mainPanel;
    private JButton lengthButton;
    private JButton weightButton;
    private JButton volumeButton;
    private JLabel outputLabel;

    public static String convert(double amt, int fromIndex, int toIndex, String type) {
        double fromrate;
        double torate;
        if (type.equals("L")) {
            fromrate = lengthRates[fromIndex];
            torate = lengthRates[toIndex];
            return (amt + lengthOpts[fromIndex] + " = " + (amt * torate / fromrate) + lengthOpts[toIndex]);
        } else if (type.equals("W")) {
            fromrate = weightRates[fromIndex];
            torate = weightRates[toIndex];
            return (amt + weightOpts[fromIndex] + " = " + (amt * torate / fromrate) + weightOpts[toIndex]);
        } else if (type.equals("V")) {
            fromrate = volRates[fromIndex];
            torate = volRates[toIndex];
            return (amt + volOpts[fromIndex] + "^2 = " + (amt * torate / fromrate) + volOpts[toIndex] + "^2");
        } else {
            return "ERROR";
        }
    }

    public PROJECT3() {
        super("Project3");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setPreferredSize(new Dimension(400, 400));
        this.setMinimumSize(new Dimension(400, 400));
        this.setMaximumSize(new Dimension(400, 400));
        this.setResizable(false);
        this.pack();


        lengthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                from = JOptionPane.showInputDialog("Enter unit to convert from: ").toLowerCase();
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
                to = JOptionPane.showInputDialog("Enter unit to convert to: ").toLowerCase();
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
                amt = Integer.parseInt(JOptionPane.showInputDialog("Enter amount to convert: "));
                String output = convert(amt, fromIndex, toIndex, "L");
                outputLabel.setText(output);
            }
        });

        weightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                from = JOptionPane.showInputDialog("Enter unit to convert from: ").toLowerCase();
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
                to = JOptionPane.showInputDialog("Enter unit to convert to: ").toLowerCase();
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
                amt = Integer.parseInt(JOptionPane.showInputDialog("Enter amount to convert: "));
                String output = convert(amt, fromIndex, toIndex, "W");
                outputLabel.setText(output);
            }
        });

        volumeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                from = JOptionPane.showInputDialog("Enter unit to convert from: ").toLowerCase();
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
                to = JOptionPane.showInputDialog("Enter unit to convert to: ").toLowerCase();
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
                amt = Integer.parseInt(JOptionPane.showInputDialog("Enter amount to convert: "));
                String output = convert(amt, fromIndex, toIndex, "V");
                outputLabel.setText(output);
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PROJECT3().setVisible(true);
            }
        });
    }
}