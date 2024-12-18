import java.util.*;
import java.lang.Math;

public class PROJECT2 {
    public static class World {
        public static String[][] generate(int h, int w) {
            String[][] toGenerate = new String[h][w];
            for (int r = 0; r < h; r++) {
                for (int c = 0; c < w; c++) {
                    if (r == 0 || r == h-1 || c == 0 || c == w-1) {toGenerate[r][c] = "X"; }
                    else { toGenerate[r][c] = " "; }
                }
            }
            //int numBoxChains = (int)(Math.random() * (h*w/64)) + (int)(Math.sqrt(h*w)/Math.log(2) * 1);
            int numBoxChains = (int)(Math.random() * (Math.sqrt(h*w))) + (int)(Math.sqrt(h*w)/1.5);
                for (int i = 0; i < numBoxChains; i++) {
                    int rH = (int)(Math.random() * (h-2)) + 1;
                    int rC = (int)(Math.random() * (w-2)) + 1;
                    toGenerate[rH][rC] = "□";
                    //int boxChainSize = (int)(Math.random() * (h*w/64)) + (int)(Math.log(h*w)/Math.log(2) * 0.75);
                    int boxChainSize = (int)(Math.random() * (Math.sqrt(h*w)/8)) + (int)(Math.sqrt(h*w)/6);
                    //System.out.println("boxChainSize: " + boxChainSize);
                    for (int j = 0; j < boxChainSize; j++) {
                        while (!toGenerate[rH][rC].equals(" ")) {
                            rH = (int)(Math.random() * 3) - 1 + rH;
                            if (rH <= -1) { rH = 0; }
                            if (rH >= h) { rH = h-1; }
                            rC = (int)(Math.random() * 3) - 1 + rC;
                            if (rC <= -1) { rC = 0; }
                            if (rC >= w) { rC = w-1; }
                        }
                        toGenerate[rH][rC] = "□";
                    }
                }

            // for smoothing the box walls out, not sure how i feel about it
            
            /*
            for (int i = 0; i < 1; i++) { // unsure how many times i wish to run it
                for (int r = 1; r < h-1; r++) {
                    for (int c = 1; c < w-1; c++) {
                        String check1 = toGenerate[r][c+1];
                        String check2 = toGenerate[r][c-1];
                        String check3 = toGenerate[r+1][c];
                        String check4 = toGenerate[r-1][c];
                        int sideCounter = 0;
                        if (check1.equals("X") || check1.equals("□")) { sideCounter++; }
                        if (check2.equals("X") || check2.equals("□")) { sideCounter++; }
                        if (check3.equals("X") || check3.equals("□")) { sideCounter++; }
                        if (check4.equals("X") || check4.equals("□")) { sideCounter++; }
                        if (sideCounter >= 3) { toGenerate[r][c] = "□"; }
                    }
                }
            }
            */

            int numEnemyChains = (int)(Math.random() * (Math.sqrt(h*w))/4) + (int)(Math.sqrt(h*w)/3);
                for (int i = 0; i < numEnemyChains; i++) {
                    ArrayList<String> checkArr = new ArrayList<>();
                    int rH = 0;
                    int rC = 0;
                    boolean hasEnemy = true;
                    int attemptCounter = 0;
                    while (hasEnemy || !toGenerate[rH][rC].equals(" ")) {
                        checkArr.clear();
                        final int CHECKSIZE = (int)(Math.log(h*w)/Math.log(2) * Math.log(Math.min(h,w))/Math.log(2)/10 + 0.25);
                        rH = (int)(Math.random() * (h-(2*CHECKSIZE)-1)) + CHECKSIZE+1;
                        rC = (int)(Math.random() * (w-(2*CHECKSIZE)-1)) + CHECKSIZE+1;
                        for (int r2 = rH - CHECKSIZE; r2 <= rH + CHECKSIZE; r2++) {
                            for (int c2 = rC - CHECKSIZE; c2 <= rC + CHECKSIZE; c2++) {
                                if ((r2 + c2 < CHECKSIZE + rH + rC || (r2 < CHECKSIZE || r2 > h-CHECKSIZE || c2 < CHECKSIZE || c2 > w - CHECKSIZE))  && (r2 != 0 && c2 != 0)) {
                                    checkArr.add(toGenerate[r2][c2]);
                                }
                            }
                        } 
                        hasEnemy = false;
                        for (String s : checkArr) {
                            if (s.equals("I")) { hasEnemy = true; }
                        }
                        attemptCounter++;
                        if (attemptCounter >= h * w * 2) {
                            System.out.println("WORLD RESET");
                            return generate(h,w);
                        }
                    }

                    toGenerate[rH][rC] = "I";
                    int enemyChainSize = (int)(Math.random() * (Math.log(h*w*0.5)/Math.log(2) * 0.25)) + (int)(Math.log(h*w*0.75)/Math.log(2) * 0.25); // log scaling for less enemies at large sizes
                    //System.out.println("enemyChainSize: " + enemyChainSize);
                    for (int j = 0; j < enemyChainSize; j++) {
                        checkArr.clear();
                        checkArr.add("X");
                        hasEnemy = true;
                        int initRH = rH;
                        int initRC = rC;
                        attemptCounter = 0;
                        while (hasEnemy || !toGenerate[rH][rC].equals(" ")) {
                            rH = (int)(Math.random() * 3) - 1 + rH;
                            if (rH <= -1) { rH = 0; }
                            if (rH >= h) { rH = h-1; }
                            rC = (int)(Math.random() * 3) - 1 + rC;
                            if (rC <= -1) { rC = 0; }
                            if (rC >= w) { rC = w-1; }
                            checkArr.clear();
                            final int CHECKSIZE = (int)(Math.log(h*w)/Math.log(2) * Math.log(Math.min(h,w))/Math.log(2)/10 + 0.25);
                            for (int r2 = rH - CHECKSIZE; r2 <= rH + CHECKSIZE; r2++) {
                                for (int c2 = rC - CHECKSIZE; c2 <= rC + CHECKSIZE; c2++) {
                                    if ((r2 + c2 < 2 * CHECKSIZE && ((r2 != 0 && c2 != 0)))) {
                                        if (!(r2 < 0 || r2 > h || c2 < 0 || c2 > w)) { checkArr.add(toGenerate[r2][c2]); }
                                    }
                                }
                            }
                            hasEnemy = false;
                            for (String s : checkArr) {
                                if (s.equals("I")) { hasEnemy = true; }
                            }
                            if (toGenerate[rH][rC].equals("□")) {
                                rH = initRH;
                                rC = initRC;
                            }
                            attemptCounter++;
                            if (attemptCounter >= h * w * 2) {
                                System.out.println("WORLD RESET");
                                return generate(h,w);
                            }
                        }
                        toGenerate[rH][rC] = "I";
                        //System.out.print(rH + "-" + rC + " ");
                    }
                    //System.out.println();
                }
            

            int numCoins = (int)(h*w/30 + Math.sqrt(h*w)/2);
            //System.out.println("numCoins: " + numCoins);
                for (int i = 0; i < numCoins; i++) {
                    int coinR = 0;
                    int coinC = 0;
                    while (toGenerate[coinR][coinC] != " ") {
                        coinR = (int)(Math.random() * (h-1)) + 1;
                        coinC = (int)(Math.random() * (w-1)) + 1;
                    }
                    toGenerate[coinR][coinC] = "O";
                }
            
            //System.out.println("coins done");

            // player placer
            ArrayList<String> enemyCheckArr = new ArrayList<>();
            ArrayList<String> wallCheckArr = new ArrayList<>();
            int rH = 0;
            int rC = 0;
            boolean hasEnemy = true;
            boolean hasWall = true;
            int attemptCounter = 0;
            while (hasEnemy || hasWall || !toGenerate[rH][rC].equals(" ")) {
                enemyCheckArr.clear();
                wallCheckArr.clear();
                final int ENEMYCHECKSIZE = (int)(Math.log(h*w)/Math.log(2) * Math.log(Math.min(h,w))/Math.log(2)/10 + 0.25);
                rH = (int)(Math.random() * (h-(2*ENEMYCHECKSIZE)-1)) + ENEMYCHECKSIZE+1;
                rC = (int)(Math.random() * (w-(2*ENEMYCHECKSIZE)-1)) + ENEMYCHECKSIZE+1;
                for (int r2 = rH - ENEMYCHECKSIZE; r2 <= rH + ENEMYCHECKSIZE; r2++) {
                    for (int c2 = rC - ENEMYCHECKSIZE; c2 <= rC + ENEMYCHECKSIZE; c2++) {
                        if ((r2 + c2 < ENEMYCHECKSIZE + rH + rC || (r2 < ENEMYCHECKSIZE || r2 > h-ENEMYCHECKSIZE || c2 < ENEMYCHECKSIZE || c2 > w - ENEMYCHECKSIZE))  && (r2 != 0 && c2 != 0)) {
                            enemyCheckArr.add(toGenerate[r2][c2]);
                        }
                    }
                } 
                hasEnemy = false;
                for (String s : enemyCheckArr) {
                    if (s.equals("I")) { hasEnemy = true; }
                }

                final int WALLCHECKSIZE = 4;
                for (int r2 = rH - WALLCHECKSIZE; r2 <= rH + WALLCHECKSIZE; r2++) {
                    for (int c2 = rC - WALLCHECKSIZE; c2 <= rC + WALLCHECKSIZE; c2++) {
                        if ((r2 + c2 < WALLCHECKSIZE + rH + rC || (r2 < WALLCHECKSIZE || r2 > h-WALLCHECKSIZE || c2 < WALLCHECKSIZE || c2 > w - WALLCHECKSIZE/2))  && (r2 != 0 && c2 != 0)) {
                            wallCheckArr.add(toGenerate[r2][c2]);
                        }
                    }
                } 
                hasWall = false;
                for (String s : wallCheckArr) {
                    if (s.equals("□") || s.equals("X")) { hasWall = true; }
                }
                attemptCounter++;
                if (attemptCounter >= h * w * 2) {
                    System.out.println("WORLD RESET");
                    return generate(h,w);
                }
            }
            toGenerate[rH][rC] = "Y";

            return toGenerate;
        }
    }

    public static void printMatrix(String[][] m) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_CYAN = "\u001B[96m";
        final String ANSI_YELLOW = "\u001B[93m";
        final String ANSI_MAGENTA = "\u001B[95m";
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                if (m[l][c].equals("O")) { System.out.print(ANSI_YELLOW + m[l][c] + " " + ANSI_RESET); }
                else if (m[l][c].equals("I")) { System.out.print(ANSI_MAGENTA + m[l][c] + " " + ANSI_RESET); }
                else if (m[l][c].equals("X")) { System.out.print(ANSI_RED + m[l][c] + " " + ANSI_RESET); }
                else if (m[l][c].equals("Y")) { System.out.print(ANSI_CYAN + m[l][c] + " " + ANSI_RESET); }
                // make player CYAN
                else { System.out.print(m[l][c] + " "); }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of dungeon, the following sizes are available:");
        System.out.println("S: 21x14");
        System.out.println("M: 30x20");
        System.out.println("L: 60x40");
        System.out.println("X: 125x75");
        System.out.println("T: 16x36");
        System.out.println("C: Custom");
        String sizeChoice = input.next();
        final int HEIGHT;
        final int WIDTH;
        switch (sizeChoice.substring(0,1)) {
            case "S":
                HEIGHT = 14;
                WIDTH = 21;
                break;
            case "M":
                HEIGHT = 20;
                WIDTH = 30;
                break;
            case "L":
                HEIGHT = 40;
                WIDTH = 60;
                break;
            case "X":
                HEIGHT = 75;
                WIDTH = 125;
                break;
            case "T":
                HEIGHT = 36;
                WIDTH = 16;
                break;
            case "C":
                System.out.print("Enter height of dungeon: ");
                HEIGHT = input.nextInt();
                System.out.print("Enter width of dungeon: ");
                WIDTH = input.nextInt();
                break;
            default:
                System.out.println("ERROR: INVALID SIZE");
                return;
        }
        System.out.println();
        String[][] dungeon = World.generate(HEIGHT, WIDTH);
        printMatrix(dungeon);
        int turnCount = 0;
        int hp = 5;
        int stamina = 5;
        int coinCount = 0;
        for (int r = 0; r < dungeon.length; r++) {
            for (int c = 0; c < dungeon[r].length; c++) {
                if (dungeon[r][c].equals("O")) { countCount++; }
            }
        }
        while (true) {
            System.out.println("Turn ")
        }
    }
}