import java.util.*;

public class reseller {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // variabel
        String nama = input.nextLine();
        String namaBarang = input.nextLine();
        long harga = input.nextLong();
        long jumlah = input.nextLong();
        long total = harga*jumlah ;
        double pajak = (double) total * 0.07;
        double hargaJual = ((double) total + pajak) + (((double) total + pajak) * 0.1);

        System.out.println("============================================");
        System.out.println("===Aplikasi untuk Memulai Bisnis Reseller===");
        System.out.println("============================================");

        // 17.21
        System.out.printf("%-17s:%26s\n", "Nama", nama);
        System.out.printf("%-17s:%26s\n", "Nama Barang", namaBarang);
        System.out.printf("%-17s:%26s\n", "Jumlah", jumlah);
        System.out.printf("%-17s:%26s\n", "Nama", harga);
        System.out.println("============================================");
        System.out.printf("%-17s:%26s\n", "Total", total);
        System.out.printf("%-17s:%26.0f\n", "Pajak 7%", pajak);
        System.out.printf("%-17s:%26.0f\n", "Modal", total + pajak);
        System.out.println("============================================");
        System.out.println("Harga Jual kembali 10% keuntungan dari modal");
        System.out.println("============================================");
        System.out.printf("%-17s:%26.2f\n", "Total Penjualan", hargaJual);
        System.out.printf("%-17s:%26.2f\n", "Harga Satuan", hargaJual / jumlah);
        System.out.printf("%-17s:%26.2f\n", "Total Keuntungan", hargaJual - total);
        System.out.println("============================================");

        input.close();
    }
}
