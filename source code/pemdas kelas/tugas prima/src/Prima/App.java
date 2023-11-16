package Prima;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int x = input.nextInt();
        for (int i = 2; i <= x; i++) {
            boolean prima = true;
            int j = 2;
            while (j * j <= i) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
                j++;
            }
            if (prima) {
                System.out.print(i + " ");
            }
        }
    }
}
