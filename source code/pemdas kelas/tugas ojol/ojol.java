/**
 *
 * @author RisqiFahreal
 */

import java.util.*;

public class Ojol {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Silahkan pilih motor / mobil.\nketik 1 untuk motor\nketik 2 untuk mobil\npilhan anda: ");
        int kendaraan = input.nextInt();

        System.out.print("\nSilahkan masukkan jarak yang akan ditempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print(
                "\nSilahkan memilih sistem payment(Gopay/OVO/Cash)\nketik 1 untuk gopay\nketik 2 untuk OVO\nketik 3 untuk Cash\npilihan anda: ");
        int payment = input.nextInt();

        // tarif mobil
        double tarifMobil1 = 25000;
        double tarifMobil2 = 40000;
        double tarifMobil3 = 65000;
        double tarifMobil4 = jarak * 15000;

        // potongan diskon gopay
        double gopayMobil1 = tarifMobil1 - (tarifMobil1 * 0.1);
        double gopayMobil2 = tarifMobil2 - (tarifMobil2 * 0.1);
        double gopayMobil3 = tarifMobil3 - (tarifMobil3 * 0.1);
        double gopayMobil4 = tarifMobil4 - (jarak * tarifMobil4 * 0.1);

        // potongan diskon ovo
        double ovoMobil1 = tarifMobil1 - (tarifMobil1 * 0.05);
        double ovoMobil2 = tarifMobil2 - (tarifMobil2 * 0.05);
        double ovoMobil3 = tarifMobil3 - (tarifMobil3 * 0.05);
        double ovoMobil4 = tarifMobil4 - (jarak * tarifMobil4 * 0.05);

        // potongan diskon cash
        double cashMobil1 = tarifMobil1;
        double cashMobil2 = tarifMobil2;
        double cashMobil3 = tarifMobil3;
        double cashMobil4 = jarak * 15000;

        // tarif motor
        double tarifMotor1 = 15000;
        double tarifMotor2 = 20000;
        double tarifMotor3 = 35000;
        double tarifMotor4 = jarak * 8000;

        // potongan diskon gopay
        double gopayMotor1 = tarifMotor1 - (tarifMotor1 * 0.1);
        double gopayMotor2 = tarifMotor2 - (tarifMotor2 * 0.1);
        double gopayMotor3 = tarifMotor3 - (tarifMotor3 * 0.1);
        double gopayMotor4 = tarifMotor4 - (jarak * tarifMotor4 * 0.1);

        // potongan diskon ovo
        double ovoMotor1 = tarifMotor1 - (tarifMotor1 * 0.05);
        double ovoMotor2 = tarifMotor2 - (tarifMotor2 * 0.05);
        double ovoMotor3 = tarifMotor3 - (tarifMotor2 * 0.05);
        double ovoMotor4 = tarifMotor4 - (jarak * tarifMotor4 * 0.05);

        // potongan diskon cash
        double cashMotor1 = tarifMotor1;
        double cashMotor2 = tarifMotor2;
        double cashMotor3 = tarifMotor3;
        double cashMotor4 = jarak * 8000;

        // kondisi user motor, gopay
        if (kendaraan == 1 && payment == 1) {
            if (kendaraan == 1 && jarak <= 2 && payment == 1) {
                System.out.printf("tarif: Rp.%.0f", gopayMotor1);
            } else if (kendaraan == 1 && jarak >= 2 && jarak <= 5 && payment == 1) {
                System.out.printf("tarif: Rp.%.0f", gopayMotor2);
            } else if (kendaraan == 1 && jarak >= 5 && jarak <= 10 && payment == 1) {
                System.out.printf("tarif: Rp.%.0f", gopayMotor3);
            } else if (kendaraan == 1 && jarak >= 10 && payment == 1) {
                System.out.printf("tarif: Rp.%.0f", gopayMotor4);
            } else {
                System.out.println("Data Invalid");
            }
        }

        // kondisi user motor, ovo
        if (kendaraan == 1 && payment == 2) {
            if (kendaraan == 1 && jarak <= 2 && payment == 2) {
                System.out.printf("tarif: Rp.%.0f", ovoMotor1);
            } else if (kendaraan == 1 && jarak >= 2 && jarak <= 5 && payment == 2) {
                System.out.printf("tarif: Rp.%.0f", ovoMotor2);
            } else if (kendaraan == 1 && jarak >= 5 && jarak <= 10 && payment == 2) {
                System.out.printf("tarif: Rp.%.0f", ovoMotor3);
            } else if (kendaraan == 1 && jarak >= 10 && payment == 2) {
                System.out.printf("tarif: Rp.%.0f", ovoMotor4);
            } else {
                System.out.println("Data Invalid");
            }
        }

        // kondisi user motor, cash
        if (kendaraan == 1 && payment == 3) {
            if (kendaraan == 1 && jarak <= 2 && payment == 3) {
                System.out.printf("tarif: Rp.%.0f", cashMotor1);
            } else if (kendaraan == 1 && jarak >= 2 && jarak <= 5 && payment == 3) {
                System.out.printf("tarif: Rp.%.0f", cashMotor2);
            } else if (kendaraan == 1 && jarak >= 5 && jarak <= 10 && payment == 3) {
                System.out.printf("tarif: Rp.%.0f", cashMotor3);
            } else if (kendaraan == 1 && jarak >= 10 && payment == 3) {
                System.out.printf("tarif: Rp.%.0f", cashMotor4);
            } else {
                System.out.println("Data Invalid");
            }
        }

        // kondisi user mobil, gopay
        if (kendaraan == 2 && payment == 1) {
            if (kendaraan == 2 && jarak <= 2 && payment == 1) {
                System.out.printf("tarif: Rp.%.0f", gopayMobil1);
            } else if (kendaraan == 2 && jarak >= 2 && jarak <= 5 && payment == 1) {
                System.out.printf("tarif: Rp.%.0f", gopayMobil2);
            } else if (kendaraan == 2 && jarak >= 5 && jarak <= 10 && payment == 1) {
                System.out.printf("tarif: Rp.%.0f", gopayMobil3);
            } else if (kendaraan == 2 && jarak >= 10 && payment == 1) {
                System.out.printf("tarif: Rp.%.0f", gopayMobil4);
            } else {
                System.out.println("Data Invalid");
            }
        }

        // kondisi user mobil, ovo
        if (kendaraan == 2 && payment == 2) {
            if (kendaraan == 2 && jarak <= 2 && payment == 2) {
                System.out.printf("tarif: Rp.%.0f", ovoMobil1);
            } else if (kendaraan == 2 && jarak >= 2 && jarak <= 5 && payment == 2) {
                System.out.printf("tarif: Rp.%.0f", ovoMobil2);
            } else if (kendaraan == 2 && jarak >= 5 && jarak <= 10 && payment == 2) {
                System.out.printf("tarif: Rp.%.0f", ovoMobil3);
            } else if (kendaraan == 2 && jarak >= 10 && payment == 2) {
                System.out.printf("tarif: Rp.%.0f", ovoMobil4);
            } else {
                System.out.println("Data Invalid");
            }
        }

        // kondisi user mobil,cash
        if (kendaraan == 2 && payment == 3) {
            if (kendaraan == 2 && jarak <= 2 && payment == 3) {
                System.out.printf("tarif: Rp.%.0f", cashMobil1);
            } else if (kendaraan == 2 && jarak >= 2 && jarak <= 5 && payment == 3) {
                System.out.printf("tarif: Rp.%.0f", cashMobil2);
            } else if (kendaraan == 2 && jarak >= 5 && jarak <= 10 && payment == 3) {
                System.out.printf("tarif: Rp.%.0f", cashMobil3);
            } else if (kendaraan == 2 && jarak >= 10 && payment == 3) {
                System.out.printf("tarif: Rp.%.0f", cashMobil4);
            } else {
                System.out.println("Data Invalid");
            }
        }

        input.close();
    }
}
