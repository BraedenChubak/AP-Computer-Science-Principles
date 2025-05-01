import java.util.*;

public class MSOE2007_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int len = 1;
        boolean hasRepeat = true;
        while (hasRepeat) {
            len++;
            hasRepeat = false;
            for (int i = 0; i <= s.length() - len; i++) {
                char c = s.charAt(i);
                boolean isRepeat = true;
                for (int j = 1; j < len; j++) {
                    if (c != s.charAt(i+j)) {
                        isRepeat = false;
                    }
                }
                if (isRepeat) { hasRepeat = true; }
            }
        }
        len--;
        System.out.print(len + " ");
        for (int i = 0; i <= s.length() - len; i++) {
            char c = s.charAt(i);
            boolean isRepeat = true;
            for (int j = 1; j < len; j++) {
                if (c != s.charAt(i+j)) {
                    isRepeat = false;
                }
            }
            if (isRepeat) { System.out.print(c + " "); }
        }
    }
}
/*
ABDDDCABDABDDDCCCABDACCC
3 D D C C
*/