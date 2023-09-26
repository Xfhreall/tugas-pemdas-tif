package Belanja;

/**
 *
 * @author risqifahreal
 * Nama : Risqi Achmad Fahreal
 * NIM : 235150201111048
 */

import java.util.Scanner;

public class Tugaspemdasshopping {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("silahkan masukkan harga barang (Rp):");
        int hargaBarang = input.nextInt();

        System.out.print("silahkan masukkan jumlah barang(buah):");
        int jumlahBarang = input.nextInt();

        System.out.print("silahkan masukkan diskon yang didapat(%):");
        double diskon = input.nextDouble();

        int totalHargaAwal = hargaBarang * jumlahBarang;
        double totalHargaDiskon = diskon / 100 * totalHargaAwal;

        double hargaAkhir = totalHargaAwal - totalHargaDiskon;
        System.out.println("jumlah yang harus dibayar adalah: Rp." + hargaAkhir + ",-");

        input.close();
    }
}
