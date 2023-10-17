import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // tugas no.1 rata kiri

        System.out.println("=".repeat(5) + "Soal no.1 rata kiri" + "=".repeat(5));
        System.out.print("Masukkan angka yg di mau : ");
        int x = input.nextInt();
        // bagian atas
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // bagian bawah
        for (int i = x - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        // tugas no.2 rata kiri (2)
        System.out.println("=".repeat(5) + "Soal no.2 segitiga" + "=".repeat(5));
        System.out.print("Masukkan angka yg di mau : ");
        int y = input.nextInt();
        int jarak = y - 1;

        // bagian atas
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= jarak; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            jarak--;
        }
        // tugas no.3 wajik
        System.out.println("=".repeat(5) + "Soal no.3 wajik" + "=".repeat(5));
        System.out.print("Masukkan angka yg di mau : ");
        int n = input.nextInt();
        int spasi = n - 1;

        // bagian atas
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spasi; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
            spasi--;
        }
        spasi = 1;
        // bagian bawah
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= spasi; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            spasi++;
        }
        System.out.println("=".repeat(7) + "DONE" + "=".repeat(7));
        input.close();
    }
}
