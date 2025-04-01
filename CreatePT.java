import java.util.*;

class ClassObject {
    int period;
    String name;

    public ClassObject(String n, int p) {
        period = p;
        name = n;
    }
}

public class CreatePT {
    public static boolean addClass(ArrayList<ClassObject> classes, ClassObject cl) {
        boolean overlap = false;
        for (ClassObject c : classes) {
            if (c.period == cl.period) {
                overlap = true;
            }
        }
        if (!overlap) {
            classes.add(cl);
        }
        return !overlap;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String command = "";
        System.out.print("Enter the number of periods you have in a day: ");
        int periods = input.nextInt();
        input.nextLine();
        ArrayList<ClassObject> classes = new ArrayList<>();
        while (!command.equals("0")) {
            System.out.print("Enter command:\n1: Add Class\n2: Remove Class\n3: See Class List\n0: Exit\n");
            command = input.nextLine();
            System.out.println();
            if (command.equals("0")) { return; }
            if (command.equals("1")) { // add class
                System.out.print("Enter class name: ");
                String cname = input.nextLine();
                System.out.print("Enter period of class: ");
                int cperiod = input.nextInt();
                input.nextLine();
                if (cperiod <= 0 || cperiod > periods) {
                    System.out.println("ERROR: INVALID PERIOD.\n");
                } else {
                    ClassObject curClass = new ClassObject(cname, cperiod);
                    if (addClass(classes, curClass)) {
                        System.out.println("Class successfully added!\n");
                    } else {
                        System.out.println("Unable to add class due to schedule overlap!\n");
                    }
                }
            } else if (command.equals("2")) { // remove class
                System.out.print("Would you like to remove by period (P) or by name (N)? ");
                String choice = input.nextLine();
                choice = choice.toUpperCase();
                if (choice.equals("N")) {
                    System.out.print("Enter name of class: ");
                    String n = input.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < classes.size(); i++) {
                        if (classes.get(i).name.equalsIgnoreCase(n)) {
                            classes.remove(i);
                            removed = true;
                        }
                    }
                    if (removed) {
                        System.out.println("Class successfully removed!\n");
                    } else {
                        System.out.println("Unable to find class with that name!\n");
                    }
                } else if (choice.equals("P")) {
                    System.out.print("Enter period of class: ");
                    int p = input.nextInt();
                    input.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < classes.size(); i++) {
                        if (classes.get(i).period == p) {
                            classes.remove(i);
                            removed = true;
                        }
                    }
                    if (removed) {
                        System.out.println("Class successfully removed!\n");
                    } else {
                        System.out.println("Unable to find class in that period!\n");
                    }
                } else {
                    System.out.println("INVALID COMMAND\n");
                }
            } else if (command.equals("3")) { // class list
                for (int i = 1; i <= periods; i++) {
                    System.out.print(i + ":\t");
                    boolean found = false;
                    for (ClassObject c : classes) {
                        if (c.period == i) {
                            System.out.println(c.name);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("N/A");
                    }
                }
            } else {
                System.out.println("INVALID COMMAND\n");
            }
        }
    }
}