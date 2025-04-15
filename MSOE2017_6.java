import java.util.*;

class MSOE2017_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive int: ");
        int num = input.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();
        int curf = 2;
        int fnum = num;
        while (curf <= fnum) {
            if (fnum % curf == 0) {
                fnum /= curf;
                if (!factors.contains(curf)) {
                    factors.add(curf);
                }
            }
            else { curf++; }
        }
        int f = num;
        for (int n : factors) {
            f = (f * (n+1)) / n;
        }
        System.out.println(f);
    }
}
/*
Enter a positive int: 30
72
*/