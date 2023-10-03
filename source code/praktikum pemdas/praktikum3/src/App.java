import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // soal no 1
        // MENGHITUNG BMI

        double bmi;

        System.out.print("Input your weight (kg) : ");
        double berat = input.nextDouble();

        System.out.print("Input your height (m) : ");
        double tinggi = input.nextDouble();

        // operator

        bmi = berat / ((double) tinggi * (double) tinggi);

        if (bmi > 30) {
        System.out.printf("BMI = %.2f (Very Overweight)", bmi);
        } else if (bmi > 25) {
        System.out.printf("BMI = %.2f (Overweight)", bmi);
        } else if (bmi > 18.5) {
        System.out.printf("BMI = %.2f (Normal)", bmi);
        } else {
        System.out.printf("BMI = %.2f (Underweight)", bmi);
        }

        System.out.print("\n------------------------------");

        // soal 2
        // upah gaji

        System.out.println("=========Program penghitung upah kerja=========");
        System.out.println("Rules:");
        System.out.println("1. Upah kerja berjumlah Rp50.000,-/jam.");
        System.out.println("2. Kerja lebih dari 60 jam dianggap lembur.");
        System.out.println("3. Kerja kurang dari 50 jam dianggap denda.");
        System.out.println("4. Upah lembur berjumlah Rp60.000,-/jam.");
        System.out.println("5. Denda kerja berjumlah Rp10.000,-/jam.");
        System.out.println("=".repeat(47));

        System.out.printf("Masukkan jumlah jam kerja\t: ");
        int jamKerja = input.nextInt();
        System.out.println("=".repeat(47));

        // operasi

        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("Rp#,###.00", symbols);

        int upah = 0, denda = 0, lembur = 0;
        if (jamKerja > 60) {
            upah = 3000000; // didapat dari nilai maksimal upah normal = 60*50rb.
            lembur = (jamKerja - 60) * 60000;

            System.out.printf("%-15s%s%30s\n", "Upah", ":", df.format(upah));
            System.out.printf("%-15s%s%30s\n", "Lembur", ":", df.format(lembur));
            System.out.printf("%-15s%s%30s\n", "Denda", ":", "Tidak ada denda");

        } else if (jamKerja >= 50 && jamKerja <= 60) {
            upah = jamKerja * 50000;
            System.out.printf("%-15s%s%30s\n", "Upah", ":", df.format(upah));
            System.out.printf("%-15s%s%30s\n", "Lembur", ":", "Tidak ada lembur");
            System.out.printf("%-15s%s%30s\n", "Denda", ":", "Tidak ada denda");
        } else if (jamKerja < 50) {
            upah = jamKerja * 50000;
            denda = (50 - jamKerja) * 10000;
            System.out.printf("%-15s%s%30s\n", "Upah", ":", df.format(upah));
            System.out.printf("%-15s%s%30s\n", "Lembur", ":", "Tidak ada lembur");
            System.out.printf("%-15s%s%30s\n", "Denda", ":", df.format(denda));
        }

        System.out.println("-".repeat(47));
        int total = 0;
        if (jamKerja > 60) {
            total = upah + lembur;
            System.out.printf("%-15s%s%30s\n", "Total", ":", df.format(total));
        } else if (jamKerja >= 50 && jamKerja <= 60) {
            total = upah;
            System.out.printf("%-15s%s%30s\n", "Total", ":", df.format(total));
        } else if (jamKerja < 50) {
            if (upah > denda) {
                total = upah - denda;
                System.out.printf("%-15s%s%30s\n", "Total", ":",df.format(total));
            } else {
                total = denda - upah;
                System.out.printf("%-15s%s%30s\n", "Total", ":", "Membayar " + df.format(total));
            }
        }

        input.close();
    }
}
