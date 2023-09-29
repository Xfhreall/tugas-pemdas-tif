import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // soal no 1
        // MENGHITUNG BMI

        // double bmi;

        // System.out.print("Input your weight (kg) : ");
        // double berat = input.nextDouble();

        // System.out.print("Input your height (m) : ");
        // double tinggi = input.nextDouble();

        // // operator

        // bmi = berat / ((double) tinggi * (double) tinggi);

        // if (bmi > 30) {
        // System.out.printf("BMI = %.2f (Very Overweight)", bmi);
        // } else if (bmi > 25) {
        // System.out.printf("BMI = %.2f (Overweight)", bmi);
        // } else if (bmi > 18.5) {
        // System.out.printf("BMI = %.2f (Normal)", bmi);
        // } else {
        // System.out.printf("BMI = %.2f (Underweight)", bmi);
        // }

        // System.out.print("\n------------------------------");

        // soal 2
        // upah gaji

        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');
        DecimalFormat df = new DecimalFormat("Rp#,###.00", symbols);

        System.out.print("Masukkan jumlah jam kerja : ");
        long jamKerja = input.nextLong();

        long upahKerja = 0;
        if (jamKerja > 60) {
            jamKerja = 60;
            upahKerja = 50000 * jamKerja;
        }
        long totalGaji = 0;

        if (jamKerja < 50) {
            long denda = (50 - jamKerja) * 10000;
            if (upahKerja < denda) {
                totalGaji = denda - jamKerja;
            }
            totalGaji = jamKerja - denda;
        } else if (jamKerja > 60) {
            long lembur = (jamKerja - 60) * 60000;
            totalGaji = upahKerja + lembur;
        }

        System.out.println("totalGaji = " + totalGaji);

        input.close();
    }
}
