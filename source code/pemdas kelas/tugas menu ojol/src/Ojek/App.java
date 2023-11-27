package Ojek;

/**

 *
 * @author 
// * - Risqi Achmad Fahreal - 235150201111048
// * - Alfi Muhammad Ghiffari - 235150200111048
// * - Mochammad Attila Eka Raharjo - 2351502021111051
 */

import java.util.Scanner;

public class App {
    /*
     * public static boolean login(boolean cek) {
     * Scanner input = new Scanner(System.in);
     * System.out.println();
     * System.out.println("============== Login Phase ==============");
     * System.out.print("Username : ");
     * String id = input.nextLine();
     * System.out.print("Sandi : ");
     * String pw = input.nextLine();
     * if (id.equals("user123") && pw.equals("lolipop")) {
     * return true;
     * } else {
     * System.out.println(" -Username or password incorrect- ");
     * return false;
     * }
     * }
     * 
     * public static void main(String[] args) throws Exception {
     * int control = 0;
     * boolean cek = false;
     * do {
     * Scanner input = new Scanner(System.in);
     * if (login(cek == true)) {
     * do {
     * System.out.println();
     * System.out.println("=".repeat(18) + " Apps " + "=".repeat(18));
     * System.out.println("1. Naik Ojek");
     * System.out.println("2. Kirim Barang");
     * System.out.println("3. Nama Driver");
     * System.out.println("9. Log out");
     * System.out.println("10. Shutdown");
     * System.out.print("Pilihan anda : ");
     * control = input.nextInt();
     * switch (control) {
     * case 1:
     * System.out.print(
     * "Silahkan pilih motor / mobil.\nketik 1 untuk motor\nketik 2 untuk mobil\npilhan anda: "
     * );
     * int kendaraan = input.nextInt();
     * 
     * System.out.print("Silahkan masukkan jarak yang akan ditempuh (km): ");
     * double jarak = input.nextDouble();
     * 
     * System.out.print(
     * "Silahkan memilih sistem payment: \nketik 1 untuk gopay\nketik 2 untuk OVO\nketik 3 untuk Cash\npilihan anda: "
     * );
     * int payment = input.nextInt();
     * 
     * // tarif mobil
     * double tarifMobil1 = 25000;
     * double tarifMobil2 = 40000;
     * double tarifMobil3 = 65000;
     * double tarifMobil4 = jarak * 15000;
     * 
     * // potongan diskon gopay
     * double gopayMobil1 = tarifMobil1 - (tarifMobil1 * 0.1);
     * double gopayMobil2 = tarifMobil2 - (tarifMobil2 * 0.1);
     * double gopayMobil3 = tarifMobil3 - (tarifMobil3 * 0.1);
     * double gopayMobil4 = tarifMobil4 - (tarifMobil4 * 0.1);
     * 
     * // potongan diskon ovo
     * double ovoMobil1 = tarifMobil1 - (tarifMobil1 * 0.05);
     * double ovoMobil2 = tarifMobil2 - (tarifMobil2 * 0.05);
     * double ovoMobil3 = tarifMobil3 - (tarifMobil3 * 0.05);
     * double ovoMobil4 = tarifMobil4 - (tarifMobil4 * 0.05);
     * 
     * // tarif motor
     * double tarifMotor1 = 15000;
     * double tarifMotor2 = 20000;
     * double tarifMotor3 = 35000;
     * double tarifMotor4 = jarak * 8000;
     * 
     * // potongan diskon gopay
     * double gopayMotor1 = tarifMotor1 - (tarifMotor1 * 0.1);
     * double gopayMotor2 = tarifMotor2 - (tarifMotor2 * 0.1);
     * double gopayMotor3 = tarifMotor3 - (tarifMotor3 * 0.1);
     * double gopayMotor4 = tarifMotor4 - (tarifMotor4 * 0.1);
     * 
     * // potongan diskon ovo
     * double ovoMotor1 = tarifMotor1 - (tarifMotor1 * 0.05);
     * double ovoMotor2 = tarifMotor2 - (tarifMotor2 * 0.05);
     * double ovoMotor3 = tarifMotor3 - (tarifMotor2 * 0.05);
     * double ovoMotor4 = tarifMotor4 - (tarifMotor4 * 0.05);
     * 
     * // error counter
     * if (kendaraan == 0 || kendaraan > 2 || payment == 0 || payment > 3 || jarak
     * == 0) {
     * System.out.println("\n---Data Invalid---");
     * }
     * // kondisi user motor, gopay
     * if (kendaraan == 1 && payment == 1) {
     * if (jarak == 0) {
     * System.out.println("Mohon masukkan jarak dengan benar");
     * } else if (jarak <= 2) {
     * System.out.printf("tarif: Rp.%.0f", gopayMotor1);
     * } else if (jarak > 2 && jarak <= 5) {
     * System.out.printf("tarif: Rp.%.0f", gopayMotor2);
     * } else if (jarak > 5 && jarak <= 10) {
     * System.out.printf("tarif: Rp.%.0f", gopayMotor3);
     * } else if (jarak > 10) {
     * System.out.printf("tarif: Rp.%.0f", gopayMotor4);
     * }
     * }
     * 
     * // kondisi user motor, ovo
     * if (kendaraan == 1 && payment == 2) {
     * if (jarak == 0) {
     * System.out.println("Mohon masukkan jarak dengan benar");
     * } else if (jarak <= 2) {
     * System.out.printf("tarif: Rp.%.0f", ovoMotor1);
     * } else if (jarak > 2 && jarak <= 5) {
     * System.out.printf("tarif: Rp.%.0f", ovoMotor2);
     * } else if (jarak > 5 && jarak <= 10) {
     * System.out.printf("tarif: Rp.%.0f", ovoMotor3);
     * } else if (jarak > 10) {
     * System.out.printf("tarif: Rp.%.0f", ovoMotor4);
     * }
     * }
     * 
     * // kondisi user motor, cash
     * if (kendaraan == 1 && payment == 3) {
     * if (jarak == 0) {
     * System.out.println("Mohon masukkan jarak dengan benar");
     * } else if (jarak <= 2) {
     * System.out.printf("tarif: Rp.%.0f", tarifMotor1);
     * } else if (jarak > 2 && jarak <= 5) {
     * System.out.printf("tarif: Rp.%.0f", tarifMotor2);
     * } else if (jarak > 5 && jarak <= 10) {
     * System.out.printf("tarif: Rp.%.0f", tarifMotor3);
     * } else if (jarak > 10) {
     * System.out.printf("tarif: Rp.%.0f", tarifMotor4);
     * }
     * }
     * 
     * // kondisi user mobil, gopay
     * if (kendaraan == 2 && payment == 1) {
     * if (jarak == 0) {
     * System.out.println("Mohon masukkan jarak dengan benar");
     * } else if (jarak <= 2) {
     * System.out.printf("tarif: Rp.%.0f", gopayMobil1);
     * } else if (jarak > 2 && jarak <= 5) {
     * System.out.printf("tarif: Rp.%.0f", gopayMobil2);
     * } else if (jarak > 5 && jarak <= 10) {
     * System.out.printf("tarif: Rp.%.0f", gopayMobil3);
     * } else if (jarak > 10) {
     * System.out.printf("tarif: Rp.%.0f", gopayMobil4);
     * }
     * }
     * // kondisi user mobil, ovo
     * if (kendaraan == 2 && payment == 2) {
     * if (jarak == 0) {
     * System.out.println("Mohon masukkan jarak dengan benar");
     * } else if (jarak <= 2) {
     * System.out.printf("tarif: Rp.%.0f", ovoMobil1);
     * } else if (jarak > 2 && jarak <= 5) {
     * System.out.printf("tarif: Rp.%.0f", ovoMobil2);
     * } else if (jarak > 5 && jarak <= 10) {
     * System.out.printf("tarif: Rp.%.0f", ovoMobil3);
     * } else if (jarak > 10) {
     * System.out.printf("tarif: Rp.%.0f", ovoMobil4);
     * }
     * }
     * 
     * // kondisi user mobil,cash
     * if (kendaraan == 2 && payment == 3) {
     * if (jarak == 0) {
     * System.out.println("Mohon masukkan jarak dengan benar");
     * } else if (jarak <= 2) {
     * System.out.printf("tarif: Rp.%.0f", tarifMobil1);
     * } else if (jarak > 2 && jarak <= 5) {
     * System.out.printf("tarif: Rp.%.0f", tarifMobil2);
     * } else if (jarak > 5 && jarak <= 10) {
     * System.out.printf("tarif: Rp.%.0f", tarifMobil3);
     * } else if (jarak > 10) {
     * System.out.printf("tarif: Rp.%.0f", tarifMobil4);
     * }
     * }
     * System.out.println();
     * break;
     * case 2:
     * System.out.print("Masukkan berat(kg) : ");
     * double berat = input.nextDouble();
     * System.out.printf("Biaya pengiriman : Rp%.0f\n", berat * 10000);
     * break;
     * case 3:
     * String nama = "";
     * System.out.print("Masukkan jumlah driver : ");
     * int n = input.nextInt();
     * input.nextLine();
     * String[] driver = new String[n];
     * for (int i = 0; i < n; i++) {
     * System.out.print("Masukkan nama driver ke-" + i + 1 + " : ");
     * nama = input.nextLine();
     * driver[i] = nama;
     * }
     * for (int j = 0; j < driver.length; j++) {
     * System.out.println("Driver " + (j + 1) + ": " + driver[j]);
     * }
     * break;
     * case 9:
     * login(cek == false);
     * break;
     * case 10:
     * break;
     * default:
     * System.out.println("Pilihan anda tidak valid");
     * break;
     * }
     * } while (control != 10 && cek != false);
     * }
     * } while (control != 10);
     * }
     */

    // work in progress(wip)
    static double jrk;
    static Scanner input = new Scanner(System.in);
    static String jn, s;

    public static boolean login(boolean cek) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("============== Login Phase ==============");
        System.out.print("Username : ");
        String id = input.nextLine();
        System.out.print("Sandi : ");
        String pw = input.nextLine();
        System.out.print("Pilih jenis akun Anda : ");
        jn = input.nextLine();
        if (id.equals("user123") && pw.equals("lolipop")) {
            return true;
        } else {
            System.out.println(" -Username or password incorrect- ");
            return false;
        }
    }

    static double count(double a, String s) {
        double total = 0;
        if (s.equals("1")) {
            if (a > 10)
                total = a * 15000;
            else if (a > 5)
                total = 65000;
            else if (a > 2)
                total = 40000;
            else
                total = 25000;
        } else if (s.equals("2")) {
            if (a > 10)
                total = a * 8000;
            else if (a > 5)
                total = 30000;
            else if (a > 2)
                total = 20000;
            else
                total = 15000;
        } else if (s.equalsIgnoreCase("paket")) {
            total = a * 10000;
        }
        return total;
    }

    static double bayar(double a, String s, String t) {
        double total = 0;
        if (t.equalsIgnoreCase("Gopay")) {
            return total = count(a, s) * 0.9;
        } else if (t.equalsIgnoreCase("OvO")) {
            return total = count(a, s) * 0.95;
        } else
            return total = count(a, s);

    }

    static void ojk() {
        String a, b;
        do {
            System.out.println();
            System.out.println("Pilih kendaraan Anda :");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Kembali");
            System.out.print("Pilihan Anda :");
            input.nextLine();
            a = input.nextLine();
            switch (a) {
                case "1":
                    System.out.print("Masukkan jarak tempuh Anda : ");
                    jrk = input.nextDouble();
                    System.out.print("Biaya yang akan Anda bayar : ");
                    System.out.println(count(jrk, a));
                    System.out.println("Pilih jenis pembayaran Anda : ");
                    System.out.println("1. Gopay");
                    System.out.println("2. OvO");
                    System.out.println("3. Cash");
                    System.out.print("Pilihan Anda : ");
                    input.nextLine();
                    b = input.nextLine();
                    System.out.printf("%s, %s Rp.%.0f, %s %s ya bwang\n ", "Okeee, Jadi abangnya mesen mobil",
                            "dengan harga", bayar(jrk, a, b), "dengan pembayaran menggunakan", b);
                    System.out.println("");
                    a = "0";
                    break;
                case "2":
                    System.out.print("Masukkan jarak tempuh Anda : ");
                    jrk = input.nextDouble();
                    System.out.print("Biaya yang akan Anda bayar : ");
                    System.out.println(count(jrk, a));
                    System.out.println("Pilih jenis pembayaran Anda : ");
                    System.out.println("1. Gopay");
                    System.out.println("2. OvO");
                    System.out.println("3. Cash");
                    System.out.print("Pilihan Anda : ");
                    input.nextLine();
                    b = input.nextLine();
                    System.out.printf("%s, %s Rp.%.0f, %s %s ya bwang\n ", "Okeee, Jadi abangnya mesen mobil",
                            "dengan harga", bayar(jrk, a, b), "dengan pembayaran menggunakan", b);
                    System.out.println("");
                    a = "0";
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } while (!a.equals("0"));
    }

    static void pkt() {
        double a = 0;
        s = "paket";
        System.out.println("");
        System.out.print("Masukkan berat paket Anda : ");
        a = input.nextDouble();
        System.out.println("Biaya pengiriman" + count(a, s));
        System.out.println("");
    }

    static void gpd() {

    }

    public static void main(String[] args) throws Exception {
        int control = 0;
        boolean cek = false;
        do {
            if (login(cek == true) && jn.equalsIgnoreCase("User")) {
                do {
                    System.out.println();
                    System.out.println("=".repeat(18) + " Apps " + "=".repeat(18));
                    System.out.println("1. Naik Ojek");
                    System.out.println("2. Kirim Barang");
                    System.out.println("3. Pesen makanan");
                    System.out.println("9. Log out");
                    System.out.println("10. Shutdown");
                    System.out.print("Pilihan anda : ");
                    control = input.nextInt();
                    switch (control) {
                        case 1:
                            ojk();
                            break;
                        case 2:
                            pkt();
                            break;
                        case 3:
                            gpd();
                            break;
                        case 9:
                            login(cek == false);
                            break;
                        case 10:
                            break;
                        default:
                            System.out.println("Pilihan anda tidak valid");
                            break;
                    }
                } while (control != 10 && cek != false);
            }
        } while (control != 10);
        input.nextLine();
    }
}
