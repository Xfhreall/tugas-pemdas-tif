import java.util.*;

public class App {
    public static int fibonaci(int n) {
        if (n == 0 || n == 1)
            return 1;
        return fibonaci(n - 1) + fibonaci(n - 2);
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan input : ");
        int n = input.nextInt();
        int[] result = new int[n];
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        System.out.println(fibonaci(n));
        input.close();
    }
}
