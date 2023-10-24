import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("Rp #,###.00", symbols);
        int berat = input.nextInt();
        String tanggal = input.next();
        String jasa = input.next();
        int h = 0, b = 0, t = 0, lama = 0;
        // operasi
        String[] waktu = tanggal.split("/");
        if (waktu.length == 3) {
            h = Integer.parseInt(waktu[0]);
            b = Integer.parseInt(waktu[1]);
            t = Integer.parseInt(waktu[2]);
        }
        if (berat % 4 != 0) {
            lama = berat / 4;
            lama += 1;
        } else {
            lama = berat / 4;
        }
        int harga = 7500 * lama;
        String cek = (jasa.equals("Kirim")) ? "Diantarkan" : "Diambil";
        double ongkir = (jasa.equals("Kirim")) ? harga * 1.1 : harga;
        int h2 = (h + lama) % 30;
        int b2 = (((h + lama) / 30 )+ b)%12;
        int t2 = (((h + lama) / 30 )+ b)/12 + t;
        // print
        System.out.printf("Lama hari proses laundry : %d hari\n", lama);
        System.out.printf("Tanggal selesai : %d - %d - %d (%s)\n", h2, b2, t2, cek);
        System.out.printf("Total harga yang harus dibayar : %s", df.format(ongkir));
    }
}
