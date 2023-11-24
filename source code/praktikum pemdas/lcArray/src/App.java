import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // soal 1
        int x,y;
        y = input.nextInt();
        x = input.nextInt();
        int jalan[][] = new int[y][x];
        for (int i = 0; i < y; i++) {
            String s = input.next();
            for (int j = 0; j < x; j++) {
                jalan[i][j] = (s.charAt(j) == 'S') ? -9 : Character.getNumericValue(s.charAt(j));
            }
        }
        int xBunga[][] = new int[y][x];
        xBunga[0][x - 1] = jalan[0][x - 1];

        for (int i = 0; i < y; i++) {
            for (int j = x - 1; j >= 0; j--) {
                if ((i == 0 && j == x - 1) || (i == y - 1 && j == 0)) {
                    if (xBunga[i][j] == 'S') {
                        continue;
                    }
                }
                if (i > 0 && j < x - 1) {
                    xBunga[i][j] = Math.max(xBunga[i - 1][j], xBunga[i][j + 1]) + jalan[i][j];
                } else if (i > 0) {
                    xBunga[i][j] = xBunga[i - 1][j] + jalan[i][j];
                } else if (j < x - 1) {
                    xBunga[i][j] = xBunga[i][j + 1] + jalan[i][j];
                }

            }
        }
        System.out.println(xBunga[y - 1][0]);

        // soal nomer 2
        int count = 0;
        n = input.nextInt();
        int[] gelas = new int[n];
        for (int i = 0; i < n; i++) {
            gelas[i] = input.nextInt();
            count += gelas[i];
        }
        if (count % 2 == 0) {
            System.out.println("The coffee are distributed evenly. Zakki and Hilda are happy :D");
        } else if (count % 2 != 0 || count != 0) {
            System.out.println("Egar can't divide the coffee. Zakki and Hilda are sad :(");
        }
    }
}
