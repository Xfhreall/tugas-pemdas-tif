import java.util.*;

public class jastip {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
DecimalFormatSymbols symbols = new DecimalFormatSymbols();
symbols.setGroupingSeparator('.');
symbols.setDecimalSeparator(',');
DecimalFormat df = new DecimalFormat("Rp#,###.00", symbols);

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
System.out.println("Yang bener ae");
}

    }
}
    // // soal 1

    // String s = input.next();
    // String j = input.next();
    // int n0 = 0;
    // int n1 = 0;
    // int n2 = 0;
    // int n3 = 0;
    // int n4 = 0;
    // int n5 = 0;

    // String result = "";

    // if (s.length() == 6) {
    // n0 = (int) s.charAt(0) % 64;
    // n1 = (int) s.charAt(1) % 64;
    // n2 = (int) s.charAt(2) % 64;
    // n3 = (int) s.charAt(3) % 64;
    // n4 = (int) s.charAt(4) % 64;
    // n5 = (int) s.charAt(5) % 64;

    // if (n0 == n1 && n1 == n2 && n2 == n3) {
    // if (n4 == n5) {
    // result = "Gajah";
    // } else if (2 * n4 == n5) {
    // result = "Jerapah";
    // } else {
    // result = "Beruang";
    // }
    // } else if (n1 == n2 && n2 == n3 && n3 == n4) {
    // if (n0 == n5) {
    // result = "Gajah";
    // } else if (2 * n0 == n5) {
    // result = "Jerapah";
    // } else {
    // result = "Beruang";
    // }

    // } else if (n2 == n3 && n3 == n4 && n4 == n5) {
    // if (n0 == n1) {
    // result = "Gajah";
    // } else if (2 * n0 == n1) {
    // result = "Jerapah";
    // } else {
    // result = "Beruang";
    // }

    // } else {
    // System.out.println("Yah, tidak dapat membuat robot " + j);
    // System.out.println("Tidak dapat membuat robot");
    // return;
    // }

    // if (j.equals(result)) {
    // System.out.println("Yey, dapat membuat robot " + j);
    // System.out.println("Membuat robot " + result);
    // } else {
    // System.out.println("Yah, tidak dapat membuat robot " + j);
    // System.out.println("Membuat robot " + result);
    // }

    // // soal 2
    // String cek = input.nextLine();
    // if (cek.length() < 5) {
    // System.out.print("Maybe he's confused after all.");
    // return;
    // }
    // if (cek.indexOf("a") == -1 || cek.indexOf("p") == -1 || cek.indexOf("l") ==
    // -1 || cek.indexOf("e") == -1) {
    // System.out.print("Maybe he's confused after all.");
    // } else if (cek.indexOf("l") < cek.indexOf("p")) {
    // System.out.print("Maybe he's confused after all.");
    // } else if (cek.indexOf("l") != -1 && cek.indexOf("e") != -1 &&
    // cek.indexOf("a") != -1
    // && cek.indexOf("p") != -1) {
    // System.out.print("He's a little confused but he got the spirit.");
    // }

    // // soal 3
    // int p = input.nextInt();
    // int x = input.nextInt(), y = input.nextInt(), z = input.nextInt();
    // String hasil = "";

    // if (1 <= p && p <= 3) {
    // if (x == 0) {
    // if (p == 1) {
    // hasil += "NO";
    // }
    // if (p == 2) {
    // hasil = (y == 3) ? "YES" : "NO";
    // }
    // if (p == 3) {
    // hasil = (z == 2) ? "YES" : "NO";
    // }
    // }
    // if (y == 0) {
    // if (p == 2) {
    // hasil += "NO";
    // }
    // if (p == 1) {
    // hasil = (y == 3) ? "YES" : "NO";
    // }
    // if (p == 3) {
    // hasil = (z == 1) ? "YES" : "NO";
    // }
    // }
    // if (z == 0) {
    // if (p == 3) {
    // hasil += "NO";
    // }
    // if (p == 1) {
    // hasil = (x == 2) ? "YES" : "NO";
    // }
    // if (p == 2) {
    // hasil = (y == 1) ? "YES" : "NO";
    // }
    // }
    // System.out.println(hasil);


        // long belanja = input.nextLong();
        // String member = input.next();
        // String tanggal = input.next();
        // double diskon = 0;
        // int h = 0, b = 0, t = 0;
        // String[] bagian = tanggal.split("/");
        // if (bagian.length == 3) {
        //     h = Integer.parseInt(bagian[0]);
        //     b = Integer.parseInt(bagian[1]);
        //     t = Integer.parseInt(bagian[2]);
        // }
        // // operasi
        // if (member.equals("Regular")) {
        //     if (h == b) {
        //         diskon = 0.5;
        //         belanja *= diskon;
        //         System.out.printf("%s", belanja);
        //     } else {
        //         System.out.printf("%s", belanja);
        //     }
        // }
        // if (member.equals("Gold")) {
        //     if (belanja >= 50000) {
        //         diskon = 0.9;
        //         if (h == b) {
        //             belanja *= diskon;
        //             belanja *= 0.5;
        //             System.out.println(belanja);
        //         } else {
        //             belanja *= diskon;
        //             System.out.println(belanja);
        //         }
        //     } else {
        //         if (h == b) {
        //             belanja *= 0.5;
        //             System.out.println(belanja);
        //         } else {

        //             System.out.println(belanja);
        //         }
        //     }
        // }
        // if (member.equals("Platinum")) {
        //     if (belanja >= 50000) {
        //         diskon = 0.8;
        //         if (h == b) {
        //             belanja *= diskon;
        //             belanja *= 0.5;
        //             System.out.println(belanja);
        //         } else {
        //             belanja *= diskon;
        //             System.out.println(belanja);
        //         }
        //     } else {
        //         if (h == b) {
        //             belanja *= 0.5;
        //             System.out.println(belanja);
        //         } else {
        //             System.out.println(belanja);
        //         }
        //     }
        // }


