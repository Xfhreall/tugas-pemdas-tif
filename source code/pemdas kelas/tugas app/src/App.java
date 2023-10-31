import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        //soal aplikasi
        int control = 0, n = 0;
        double r = 0, l = 0, x = 0,total = 0;
        do {
        System.out.println("=".repeat(30));
        System.out.println("1. Menghitung Luas Lingkaran");
        System.out.println("2. Menjumlahkan n buah bilangan");
        System.out.println("0. Exit");
        System.out.print("Pilihan anda : ");
        control = input.nextInt();
        switch (control) {
        case 1:
        System.out.print("Masukkan nilai r : ");
        r = input.nextDouble();
        if (r % 7 == 0) {
        l = r * r * 22 / 7;
        } else if (r % 7 != 0) {
        l = 3.14 * r * r;
        }
        System.out.printf("Luas Lingkaran : %.0f\n", l);
        break;
        case 2:
        System.out.print("Masukkan nilai n : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
        System.out.printf("X%d : ", i);
        x = input.nextDouble();
        total +=x;
        }
        System.out.printf("Jumlah Xn : %.2f\n", total);
        break;
        default:
        break;
        }
        } while (control != 0);

        //soal prima
        int n2 = 0, i = 3;
        System.out.print("Masukkan n : ");
        n2 = input.nextInt();
        System.out.print(i + " ");
        for (i = 3; i <= n2; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
