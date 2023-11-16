import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // soal pemilu
        // int test;
        // int i;
        // String s;
        // test = input.nextInt();
        // input.nextLine();
        // for (i = 0; i < test; i++) {
        // s = input.nextLine();
        // int upah = 0, a1 = 0, a2 = 0, control = 0;
        // char c = 0;
        // for (int j = 0; j < s.length(); j++) {
        // c = s.charAt(j);
        // if (c == 'A') {
        // upah++;
        // } else if (c == 'R') {
        // control++;
        // }
        // }
        // String[] cek = s.split("R");
        // switch (control) {
        // case 1:
        // a1 = cek[0].length();
        // a2 = cek[1].length();
        // if (a1 > a2) {
        // control = a1;
        // } else {
        // control = a2;
        // }
        // break;
        // case 2:
        // a1 = cek[0].length();
        // a2 = cek[1].length() + cek[2].length();
        // if (a1 > a2) {
        // control = a1;
        // } else {
        // control = a2;
        // }
        // break;
        // case 3:
        // a1 = cek[0].length();
        // a2 = cek[1].length() + cek[2].length() + cek[3].length();
        // if (a1 > a2) {
        // control = a1;
        // } else {
        // control = a2;
        // }
        // break;
        // default:
        // break;
        // }
        // if (upah == s.length()) {
        // upah = 0;
        // System.out.println(upah);
        // } else if (control > upah) {
        // System.out.println(control);
        // } else if (upah > control) {
        // System.out.println(upah);
        // }
        // upah = 0;
        // }
        // soal palindrome
        int x = input.nextInt();
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        for (int i = x; i > 0; i--) {
            if (nomorPalindrom(i)) {
                p1 = i;
                int jumlahKeduaDanKetiga = x - p1;
                for (int j = jumlahKeduaDanKetiga; j > 0; j--) {
                    if (nomorPalindrom(j)) {
                        p2 = j;
                        p3 = x - p1 - p2;
                        if (nomorPalindrom(p3)) {
                            break;
                        }
                    }
                }
                if (nomorPalindrom(p3)) {
                    break;
                }
            }
        }
        System.out.println("=".repeat(45));
        System.out.printf("%-30s: %d\n", "First Palindrome", p1);
        System.out.printf("%-30s: %d\n", "Second Palindrome", p2);
        System.out.printf("%-30s: %d\n", "Third Palindrome", p3);
        System.out.printf("%-30s: %d\n", "Sum of these palindrome", x);
        System.out.println("=".repeat(45));
    }

    public static boolean nomorPalindrom(int cek) {
        int palindrom = 0;
        int n = cek;

        while (n > 0) {
            int params = n % 10;
            palindrom = palindrom * 10 + params;
            n /= 10;
        }
        return cek == palindrom;
    }
}
