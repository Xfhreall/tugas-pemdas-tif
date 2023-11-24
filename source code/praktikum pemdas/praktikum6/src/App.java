import java.util.*;

public class App {
    // soal 1
    // public static int fibonaci(int n) {
    // if (n == 0 || n == 1)
    // return 1;
    // return fibonaci(n - 1) + fibonaci(n - 2);
    // }

    // public static void main(String[] args) throws Exception {
    // Scanner input = new Scanner(System.in);
    // System.out.print("Masukkan input : ");
    // int n = input.nextInt();
    // int[] result = new int[n];
    // for (int i = 2; i < n; i++) {
    // result[i] = result[i - 1] + result[i - 2];
    // }
    // System.out.println(fibonaci(n));
    // input.close();
    // }
    // soal 2
    public static long pangkat(int a, int b) {
        long total = 0;
        if (b == 0 || a == 1) {
            return 1;
        } else if (b == 1) {
            return a;
        } else {
            for (int i = 0; i < b; i++) {
                if (total == 0) {
                    total = a;
                } else {
                    total *= a;
                }
                if (b >= Math.pow(10, 8))
                    total %= Math.pow(10, 9) + 7;
            }
        }
        return total;
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai a : ");
        int a = input.nextInt();
        System.out.print("Masukkan nilai b : ");
        int b = input.nextInt();
        System.out.print("a pangkat b adalah : " + pangkat(a, b));
    }
}
