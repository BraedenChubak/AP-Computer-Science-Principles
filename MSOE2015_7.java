import java.util.*;


class MSOE2015_7 {
    static int triangle(int n) {
        return n * (n+1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What positive int do you want to find? ");
        int num = input.nextInt();
        int maxTri = 0;
        while (num >= triangle(maxTri)) { maxTri++; }
        maxTri--;
        int tri1 = -1;
        int tri2 = -1;
        int tri3 = -1;
        for (int i = 0; i <= maxTri; i++) {
            for (int j = 0; j <= maxTri; j++) {
                for (int k = 0; k <= maxTri; k++) {
                    if (triangle(i) + triangle(j) + triangle(k) == num) {
                        tri1 = i;
                        tri2 = j;
                        tri3 = k;
                        break;
                    }
                }
            }
        }
        if (tri1 == -1) { System.out.println("There are no triangular partitions of this number!"); }
        else { System.out.println("This number can be partitioned into " + triangle(tri1) + ", " + triangle(tri2) + ", and " + triangle(tri3)); }
    }
}
/*
What positive int do you want to find? 82764
This number can be partitioned into 82215, 528, and 21
*/