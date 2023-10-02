package OjekOnline;
// /**
// *
// * @author RisqiFahreal
// *
// * JIKA INGIN COPY KEDUA CODE. SETELAH DI PASTE,COMMENT LAH SALAH SATU DARI
// KODE YANG ANDA TIDAK GUNAKAN.
// * AGAR TERHINDAR DARI DUPLICATE LOCAL VARIABLE ANTARA KEDUA CODE
// *
// */

// import java.util.*;

// public class ojol {

// public static void main(String[] args) {

// // =============================KODE 1==========================
// /*
// * CARA PENYELESAIAN 1 (MENGGUNAKAN LOGIKA SEDERHANA DAN SESUAI KELAS PAK
// BUDI)
// * + LEBIH MUDAH DIPAHAMI
// * + MENERANGKAN LANGKAH DEMI LANGKAH
// * + CONDITIONAL VALIDATION LEBIH LENGKAP
// *
// * - CODE TERLALU PANJANG
// * - MAINTANANCE LEBIH LAMA
// */
// Scanner input = new Scanner(System.in);
// System.out.print("Silahkan pilih kendaraan\nketik 1 untuk motor\nketik 2
// untuk mobil\npilihan anda : ");
// int kendaraan = input.nextInt();

// System.out.print("Silahkan masukkan jarak yang akan ditempuh (km): ");
// double jarak = input.nextDouble();

// System.out.print(
// "\nSilahkan memilih sistem payment: \nketik 1 untuk Gopay\nketik 2 untuk
// OVO\nketik 3 untuk cash\npilihan anda: ");
// int payment = input.nextInt();

// // tarif mobil
// double tarifMobil1 = 25000;
// double tarifMobil2 = 40000;
// double tarifMobil3 = 65000;
// double tarifMobil4 = jarak * 15000;

// // potongan diskon gopay
// double gopayMobil1 = tarifMobil1 - (tarifMobil1 * 0.1);
// double gopayMobil2 = tarifMobil2 - (tarifMobil2 * 0.1);
// double gopayMobil3 = tarifMobil3 - (tarifMobil3 * 0.1);
// double gopayMobil4 = tarifMobil4 - (tarifMobil4 * 0.1);

// // potongan diskon ovo
// double ovoMobil1 = tarifMobil1 - (tarifMobil1 * 0.05);
// double ovoMobil2 = tarifMobil2 - (tarifMobil2 * 0.05);
// double ovoMobil3 = tarifMobil3 - (tarifMobil3 * 0.05);
// double ovoMobil4 = tarifMobil4 - (tarifMobil4 * 0.05);

// // tarif motor
// double tarifMotor1 = 15000;
// double tarifMotor2 = 20000;
// double tarifMotor3 = 35000;
// double tarifMotor4 = jarak * 8000;

// // potongan diskon gopay
// double gopayMotor1 = tarifMotor1 - (tarifMotor1 * 0.1);
// double gopayMotor2 = tarifMotor2 - (tarifMotor2 * 0.1);
// double gopayMotor3 = tarifMotor3 - (tarifMotor3 * 0.1);
// double gopayMotor4 = tarifMotor4 - (tarifMotor4 * 0.1);

// // potongan diskon ovo
// double ovoMotor1 = tarifMotor1 - (tarifMotor1 * 0.05);
// double ovoMotor2 = tarifMotor2 - (tarifMotor2 * 0.05);
// double ovoMotor3 = tarifMotor3 - (tarifMotor2 * 0.05);
// double ovoMotor4 = tarifMotor4 - (tarifMotor4 * 0.05);

// // error counter
// if (kendaraan == 0 || kendaraan > 2) {
// if (payment == 0 || payment > 3) {
// System.out.println("Data Invalid");
// }
// }

// // kondisi user motor, gopay
// if (kendaraan == 1 && payment == 1) {
// if (jarak == 0) {
// System.out.println("Mohon masukkan jarak dengan benar");
// } else if (jarak >= 2) {
// System.out.printf("tarif: Rp.%.0f", gopayMotor1);
// } else if (jarak >= 2 && jarak <= 5) {
// System.out.printf("tarif: Rp.%.0f", gopayMotor2);
// } else if (jarak >= 5 && jarak <= 10) {
// System.out.printf("tarif: Rp.%.0f", gopayMotor3);
// } else if (jarak >= 10) {
// System.out.printf("tarif: Rp.%.0f", gopayMotor4);
// }
// }

// // kondisi user motor, ovo
// if (kendaraan == 1 && payment == 2) {
// if (jarak == 0) {
// System.out.println("Mohon masukkan jarak dengan benar");
// } else if (jarak >= 2) {
// System.out.printf("tarif: Rp.%.0f", ovoMotor1);
// } else if (jarak >= 2 && jarak <= 5) {
// System.out.printf("tarif: Rp.%.0f", ovoMotor2);
// } else if (jarak >= 5 && jarak <= 10) {
// System.out.printf("tarif: Rp.%.0f", ovoMotor3);
// } else if (jarak >= 10) {
// System.out.printf("tarif: Rp.%.0f", ovoMotor4);
// }
// }

// // kondisi user motor, cash
// if (kendaraan == 1 && payment == 3) {
// if (jarak == 0) {
// System.out.println("Mohon masukkan jarak dengan benar");
// } else if (jarak >= 2) {
// System.out.printf("tarif: Rp.%.0f", tarifMotor1);
// } else if (jarak >= 2 && jarak <= 5) {
// System.out.printf("tarif: Rp.%.0f", tarifMotor2);
// } else if (jarak >= 5 && jarak <= 10) {
// System.out.printf("tarif: Rp.%.0f", tarifMotor3);
// } else if (jarak >= 10) {
// System.out.printf("tarif: Rp.%.0f", tarifMotor4);
// }
// }

// // kondisi user mobil, gopay
// if (kendaraan == 1 && payment == 1) {
// if (jarak == 0) {
// System.out.println("Mohon masukkan jarak dengan benar");
// } else if (jarak >= 2) {
// System.out.printf("tarif: Rp.%.0f", gopayMobil1);
// } else if (jarak >= 2 && jarak <= 5) {
// System.out.printf("tarif: Rp.%.0f", gopayMobil2);
// } else if (jarak >= 5 && jarak <= 10) {
// System.out.printf("tarif: Rp.%.0f", gopayMobil3);
// } else if (jarak >= 10) {
// System.out.printf("tarif: Rp.%.0f", gopayMobil4);
// }
// }
// // kondisi user mobil, ovo
// if (kendaraan == 1 && payment == 2) {
// if (jarak == 0) {
// System.out.println("Mohon masukkan jarak dengan benar");
// } else if (jarak >= 2) {
// System.out.printf("tarif: Rp.%.0f", ovoMobil1);
// } else if (jarak >= 2 && jarak <= 5) {
// System.out.printf("tarif: Rp.%.0f", ovoMobil2);
// } else if (jarak >= 5 && jarak <= 10) {
// System.out.printf("tarif: Rp.%.0f", ovoMobil3);
// } else if (jarak >= 10) {
// System.out.printf("tarif: Rp.%.0f", ovoMobil4);
// }
// }

// // kondisi user mobil,cash
// if (kendaraan == 1 && payment == 3) {
// if (jarak == 0) {
// System.out.println("Mohon masukkan jarak dengan benar");
// } else if (jarak >= 2) {
// System.out.printf("tarif: Rp.%.0f", tarifMobil1);
// } else if (jarak >= 2 && jarak <= 5) {
// System.out.printf("tarif: Rp.%.0f", tarifMobil2);
// } else if (jarak >= 5 && jarak <= 10) {
// System.out.printf("tarif: Rp.%.0f", tarifMobil3);
// } else if (jarak >= 10) {
// System.out.printf("tarif: Rp.%.0f", tarifMobil4);
// }
// }
// input.close();
// //
// //
// //
// //
// // ====================KODE 2====================
// /*
// * CARA PENYELESAIAN 2 (MENGGUNAKAN LOGIKA ARITMATIKA SEDERHANA)
// * + CODE LEBIH RINGKAS
// * + MAINTANANCE LEBIH CEPAT
// *
// * - CONDITIONAL VALIDATION KURANG LENGKAP
// * - AKAN AGAK SULIT DIPAHAMI BARU MENGENAL JAVA
// * - ADA BEBERAPA SYNTAX YG BELUM DIAJARKAN
// */
// Scanner input = new Scanner(System.in);
// System.out.println("Silahkan pilih kendaraan anda (huruf kapital sesuaikan
// dengan opsi):");
// System.out.println("1. Mobil\n" + "2. Motor");
// System.out.print("Pilihan anda: ");
// String kendaraan = input.nextLine();
// System.out.print("Tentukan jarak tujuan anda (km): ");
// double jarak = input.nextDouble();
// double total;
// if (kendaraan.equalsIgnoreCase("Mobil")) {
// if (jarak > 10)
// total = jarak * 15000;
// else if (jarak > 5)
// total = 65000;
// else if (jarak > 2)
// total = 40000;
// else
// total = 25000;
// } else {
// if (jarak > 10)
// total = jarak * 8000;
// else if (jarak > 5)
// total = 30000;
// else if (jarak > 2)
// total = 20000;
// else
// total = 15000;
// }

// System.out.println(
// "Pilih metode pembayaran anda (huruf kapital sesuaikan dengan opsi):\n1.
// Gopay\n2. OVO\n3. Cash");
// System.out.print("Pilihan anda: ");
// String payment = input.nextLine();
// payment = input.nextLine();
// if (payment.equalsIgnoreCase("Gopay"))
// total *= (double) 90 / 100;
// else if (payment.equalsIgnoreCase("OVO"))
// total *= (double) 95 / 100;
// System.out.printf("Total tarif yang harus anda bayar: Rp.%.0f", total);
// input.close();
// }
// }
