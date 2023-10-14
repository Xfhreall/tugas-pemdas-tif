import java.util.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class jastip {
    public static void main(String[] args) throws Exception {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("Rp#,###.00", symbols);
        Scanner input = new Scanner(System.in);

        int harga = input.nextInt();
        String jasa = input.next();

        if (jasa.equalsIgnoreCase("Kirim")) {
            double diskon = harga + ((double) harga * 0.1);

            System.out.printf("\nTotal harga belanja : %s\n", df.format(harga));
            System.out.printf("Status delivery : %s\n", "Diantarkan");
            System.out.printf("Total harga yang perlu dibayar : %s", df.format(diskon));
        } else if (jasa.equalsIgnoreCase("Ambil")) {
            System.out.printf("\nTotal harga belanja : %s\n", df.format(harga));
            System.out.printf("Status delivery : %s", "Diambil");
        } else {
            System.out.println("Yang bener ae lu");
        }

        input.close();
    }
}
