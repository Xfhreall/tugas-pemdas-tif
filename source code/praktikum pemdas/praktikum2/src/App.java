/*  
 * @author Risqi Fahreal
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // soal nomer 1

        double n1, n2;

        System.out.printf("Masukkan operator pertama\t:");
        n1 = input.nextDouble();

        System.out.printf("Masukkan operator kedua\t\t:");
        n2 = input.nextDouble();

        double jumlah, kurang, kali, bagi;

        jumlah = n1 + n2;
        kurang = n1 - n2;
        kali = n1 * n2;
        bagi = n1 / n2;

        System.out.printf("Hasil penjumlahan\t:%.0f %n", jumlah);
        System.out.printf("Hasil pengurangangan\t:%.0f %n", kurang);
        System.out.printf("Hasil perkalian\t\t:%.0f %n", kali);
        System.out.printf("Hasil pembagian\t\t:%.1f %n", bagi);

        // soal nomer 2

        String nama, kelurahan;
        int awalKwh, akhirKwh, biayaBeban;
        double ppj;

        System.out.printf("Program penghitung pemakaian listrik sederhana %n");
        System.out.printf("Masukkan Nama\t\t\t:");
        nama = input.nextLine();

        System.out.printf("Masukkan Kelurahan\t\t:");
        kelurahan = input.nextLine();

        System.out.printf("Masukkan posisi awal Kwh Meter\t:");
        awalKwh = input.nextInt();

        System.out.printf("Masukkan posisi akhir Kwh Meter\t:");
        akhirKwh = input.nextInt();

        System.out.printf("Masukkan biaya beban\t\t:");
        biayaBeban = input.nextInt();

        System.out.printf("Masukkan PPJ (dalam persen)\t:");
        ppj = input.nextDouble();

        int pemakaianBulanIni = akhirKwh - awalKwh;
        int tarifListrik = biayaBeban * pemakaianBulanIni;
        double tarifPPJ = tarifListrik * ppj / 100;
        double totalBayar = tarifListrik + tarifPPJ;

        System.out.printf("\n================PLN JAVA================\n");
        System.out.printf("Nama\t\t\t\t: %s%n", nama);
        System.out.printf("Kelurahan\t\t\t: %s%n", kelurahan);
        System.out.printf("Pemakaian bulan ini\t\t: %d Kwh Meter%n", pemakaianBulanIni);
        System.out.printf("Tarif Listrik\t\t\t: RP %d,- %n", tarifListrik);
        System.out.printf("%s%s %.0f%s %n", "PPJ 10%\t\t\t\t: ", "RP", tarifPPJ, ",-");
        System.out.printf("Total Bayar\t\t\t: RP %.0f,- %n", totalBayar);
        System.out.printf("================PLN JAVA================\n");

        input.close();
    }
}
