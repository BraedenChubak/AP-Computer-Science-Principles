import java.util.*;

public class MSOE2015_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            double curNum = input.nextDouble();
            if (i == 0) { nums.add(curNum); }
            else {
                boolean placed = false;
                for (int j = 0; j < nums.size(); j++) {
                    if (curNum >= nums.get(j)) {
                        nums.add(j, curNum);
                        placed = true;
                        break;
                    }
                }
                if (!placed) { nums.add(curNum); }
            }
            if (i >= 2) {
                System.out.println("The 3rd-largest number is: " + nums.get(2));
            }
        }
    }
}
/*
Enter number 1: 5.4
Enter number 2: 6.7
Enter number 3: 2
The 3rd-largest number is: 2.0
Enter number 4: 4
The 3rd-largest number is: 4.0
Enter number 5: 9
The 3rd-largest number is: 5.4
Enter number 6: 1
The 3rd-largest number is: 5.4
Enter number 7: 3.6
The 3rd-largest number is: 5.4
Enter number 8: 6.2
The 3rd-largest number is: 6.2
Enter number 9: 10.2
The 3rd-largest number is: 6.7
Enter number 10: 14.5
The 3rd-largest number is: 9.0
*/