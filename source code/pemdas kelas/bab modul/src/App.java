import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("bil 1 : ");
        int a = input.nextInt();
        System.out.print("bil 2 : ");
        int b = input.nextInt();
        System.out.println(Math.max(a, b));
        System.out.println(Max(a, b));
    }

    public static int Max(int i, int j) {
        int hasil = (i < j) ? i : j;
        return hasil;
    }
}
