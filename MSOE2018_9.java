import java.util.*;

class MSOE2018_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.nextLine();
        str = str.toUpperCase();
        while (str.length() % 5 != 0) {
            str += " ";
        }
        System.out.print("Enter int key: ");
        int key = input.nextInt();
        char[] crypted = str.toCharArray();
        for (int i = 0; i < crypted.length; i++) {
            crypted[i] -= 32;
        }
        for (int i = 0; i < crypted.length/5; i++) { // main cryption (both encryption and decryption so im calling it cryption)
            // grab current chunk
            char[] curChunk = new char[5];
            int c = 0;
            for (int j = i*5; j < (i+1)*5; j++) {
                curChunk[c] = crypted[j];
                c++;
            }
            // set up int to be XOR'd
            int curChunkInt = 0;
            for (int j = 0; j < 5; j++) {
                int curNum = curChunk[j] << ((4-j)*6);
                curChunkInt += curNum;
            }
            // XOR it
            curChunkInt = curChunkInt ^ key;
            // regrab chars into curChunk and crypted
            for (int j = 0; j < 5; j++) {
                int curChar = curChunkInt >> ((4-j)*6);
                curChunkInt -= curChar << ((4-j)*6);
                curChunk[j] = (char) curChar;
                crypted[i*5+j] = (char) curChar;
            }
            // update key
            key = key << 1;
            int bit30 = key & (int)Math.pow(2, 30);
            key -= bit30;
            bit30 = bit30 >> 29;
            key += bit30;
        }
        System.out.println();
        for (int i = 0; i < crypted.length; i++) {
            crypted[i] += 32;
            System.out.print(crypted[i]);
        }
        System.out.println();
    }
}
/*
Enter string: wElCoME tO MSoE
Enter int key: 8675309

W$I<"LG++U"ID11
*/