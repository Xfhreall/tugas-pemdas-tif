import java.util.*;

public class soal {
    public static void main(String[] args) throws Exception {
        //soal 3
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        int besar, kecil, bagi = 0;
        String pembagi = "Habis dibagi ";
        boolean hadiah = false;
        if (a > b && a > c) {
            besar = a;
        } else if (b > a && b > c) {
            besar = b;
        } else
            besar = c;

        if (a < b && a < c) {
            kecil = a;
        } else if (b < a && b < c) {
            kecil = b;
        } else
            kecil = c;
        int selisih = besar - kecil;
        if (selisih % 2 == 0 && selisih % 3 == 0 && selisih % 5 == 0 && selisih % 7 == 0 && selisih % 11 == 0) {
            hadiah = true;
        } else if (selisih % 2 != 0 && selisih % 3 != 0 && selisih % 5 != 0 && selisih % 7 != 0 && selisih % 11 != 0) {
            hadiah = false;
        } else {
            if (selisih % 2 == 0)
                pembagi += "2 ";
            bagi++;
            if (selisih % 3 == 0)
                pembagi += "3 ";
            bagi++;
            if (selisih % 5 == 0)
                pembagi += "5 ";
            bagi++;
            if (selisih % 7 == 0)
                pembagi += "7 ";
            bagi++;
            if (selisih % 11 == 0)
                pembagi += "11 ";
            bagi++;
        }
        System.out.println("Terbesar " + besar);
        System.out.println("Terkecil " + kecil);
        System.out.println("Selisih " + besar + " - " + kecil + " = " + selisih);
        if (hadiah) {
            System.out.println("Habis dibagi " + 2 + " " + 3 + " " + 5 + " " + 7 + " " + 11);
            System.out.println("Jackpot!!!");
        } else if (bagi != 0) {
            System.out.println(pembagi);
            System.out.println("Belum hoki!");
        } else if (!hadiah) {
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