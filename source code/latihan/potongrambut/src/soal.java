import java.util.*;

public class soal {
    public static void main(String[] args) throws Exception {
        //soal 3
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        int bg, bk, cnt = 0;
        String ot = "Habis dibagi ";
        boolean cek = false;
        if (a > b && a > c) {
            bg = a;
        } else if (b > a && b > c) {
            bg = b;
        } else
            bg = c;

        if (a < b && a < c) {
            bk = a;
        } else if (b < a && b < c) {
            bk = b;
        } else
            bk = c;
        int sel = bg - bk;
        if (sel % 2 == 0 && sel % 3 == 0 && sel % 5 == 0 && sel % 7 == 0 && sel % 11 == 0) {
            cek = true;
        } else if (sel % 2 != 0 && sel % 3 != 0 && sel % 5 != 0 && sel % 7 != 0 && sel % 11 != 0) {
            cek = false;
        } else {
            if (sel % 2 == 0)
                ot += "2 ";
            cnt++;
            if (sel % 3 == 0)
                ot += "3 ";
            cnt++;
            if (sel % 5 == 0)
                ot += "5 ";
            cnt++;
            if (sel % 7 == 0)
                ot += "7 ";
            cnt++;
            if (sel % 11 == 0)
                ot += "11 ";
            cnt++;
        }
        System.out.println("Terbesar " + bg);
        System.out.println("Terkecil " + bk);
        System.out.println("Selisih " + bg + " - " + bk + " = " + sel);
        if (cek) {
            System.out.println("Habis dibagi " + 2 + " " + 3 + " " + 5 + " " + 7 + " " + 11);
            System.out.println("Jackpot!!!");
        } else if (cnt != 0) {
            System.out.println(ot);
            System.out.println("Belum hoki!");
        } else if (!cek) {
            System.out.println("Tidak ada");
            System.out.println("Jackpot!!!");

            // soal nomer 1 
            int americano = input.nextInt();
            int susu = input.nextInt();
            int viet = input.nextInt();
            int cappu = input.nextInt();
            int mocha = input.nextInt();

            double hAmericano = 20000 * americano;
            double hSusu = 28000 * susu;
            double hVietnam = 23000 * viet;
            double hCappu = 31000 * cappu;
            double hMocha = 35000 * mocha;

            double total = 0;

            if (americano > 3) {
                hAmericano = hAmericano - (hAmericano * 0.05);
                total += hAmericano;
            } else {
                total += hAmericano;
            }
            if (susu > 2) {
                hSusu = hSusu - (hSusu * 0.08);
                total += hSusu;
            } else {
                total += hSusu;
            }
            if (viet > 4) {
                hVietnam = hVietnam - (hVietnam * 0.12);
                total += hVietnam;
            } else {
                total += hVietnam;
            }
            if (mocha > 2) {
                hMocha -= 10000;
                total += hMocha;
            } else {
                total += hMocha;
            }

            total += hCappu;
            double totalAkhir = total;
            if (total > 250000) {
                totalAkhir = total - (total * 0.1);
            }

            System.out.printf("%-26s : Rp%.1f\n", "Harga total americano", hAmericano);
            System.out.printf("%-26s : Rp%.1f\n", "Harga total kopi susu", hSusu);
            System.out.printf("%-26s : Rp%.1f\n", "Harga total kopi vietnam", hVietnam);
            System.out.printf("%-26s : Rp%.1f\n", "Harga total cappucino", hCappu);
            System.out.printf("%-26s : Rp%.1f\n", "Harga total mocha rum", hMocha);
            System.out.println("=====================================");
            System.out.printf("%-26s : Rp%.1f\n", "Total harga pesanan", total);
            System.out.printf("%-26s : Rp%.1f", "Harga yang harus dibayar", totalAkhir);

            //soal 2 

            double x = input.nextDouble();
            double y = input.nextDouble();
            double z = input.nextDouble();

            if ((z * z + y * y) == x * x || (x * x + z * z) == y * y || (x * x + y * y) == z * z) {
                System.out.println("Segitiga siku-siku");
            } else if (x == y && y == z && z == x) {
                System.out.println("Segitiga sama sisi");
            } else if (x == y || y == z || x == z) {
                System.out.println("Segitiga sama kaki");
            } else {
                System.out.println("Segitiga sembarang");
            }
        }
        input.close();
    }
}