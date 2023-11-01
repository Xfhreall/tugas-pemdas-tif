package Prima;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n2, n = 2, i = 0;
        System.out.print("Masukkan n : ");
        n2 = input.nextInt();
        if (n >= 3 && n < 5) {
            System.out.print("3 ");
        } else if (n >= 5 && n < 7) {
            System.out.print("3 5 ");
        } else if (n >= 7) {
            System.out.print("3 5 7 ");
        }
        for (i = 3; i <= n2; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
