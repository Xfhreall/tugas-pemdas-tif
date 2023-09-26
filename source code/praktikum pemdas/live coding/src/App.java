/*
 * @author RisqiFahreal
 */

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaPemesan = input.next();

        int J = input.nextInt();
        int M = input.nextInt();

        String namaMakanan1 = input.next();
        long harga1 = input.nextLong();
        long kuantitas1 = input.nextLong();

        String namaMakanan2 = input.next();
        long harga2 = input.nextLong();
        long kuantitas2 = input.nextLong();

        String namaMakanan3 = input.next();
        long harga3 = input.nextLong();
        long kuantitas3 = input.nextLong();

        String namaMakanan4 = input.next();
        long harga4 = input.nextLong();
        long kuantitas4 = input.nextLong();

        int lama = input.nextInt();
        int menitJadi = (M + lama) % 60;
        int jamJadi = ((M + lama) / 60) + J;

        long totalHarga = (harga1 * kuantitas1) + (harga2 * kuantitas2) + (harga3 *
        kuantitas3) + (harga4 * kuantitas4);
        double konversi = totalHarga / 103.0;

        input.close();

        System.out.println("====================================================================");
        System.out.printf("%68s\n", "KATSU GKM FILKOM UB");
        System.out.printf("%68s\n", "Pemesan : " + namaPemesan);
        System.out.printf("%68s\n\n", "Jam : " + J + " Menit : " + M);
        System.out.printf("%-3s| %-25s | %-15s | %-15s |%n", "No.", "Nama Makanan",
        "Kuantitas", "Harga");
        System.out.printf("%-3s| %-25s | %-15s | %-15s |%n", "1.", namaMakanan1,
        kuantitas1, harga1);
        System.out.printf("%-3s| %-25s | %-15s | %-15s |%n", "2.", namaMakanan2,
        kuantitas2, harga2);
        System.out.printf("%-3s| %-25s | %-15s | %-15s |%n", "3.", namaMakanan3,
        kuantitas3, harga3);
        System.out.printf("%-3s| %-25s | %-15s | %-15s |%n\n", "4.", namaMakanan4,
        kuantitas4, harga4);
        System.out.printf("%49s| Rp. %s %n", "Total Harga", totalHarga);
        System.out.printf("%49s| %.2f Yen %n\n", "Konversi Yen", konversi);
        System.out.printf("%68s\n", "Jam : " + jamJadi + " Menit : " + menitJadi);
        System.out.println("====================================================================");
    }
}
