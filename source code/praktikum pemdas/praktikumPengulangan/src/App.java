import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int control = 0, x = 0;
        String s = "", result = "", out = "";
        boolean cek = true, mc = true, ic = false, in = false;
        String mcs = "ON", ics = "OFF", ins = "OFF";
        do {
            System.out.println("Welcome to my encoder!");
            System.out.println("Program ini meng-encode text alfabet");
            System.out.printf("%s\t\t%s\n", "1. Maintance case", mcs);
            System.out.printf("%s\t\t\t%s\n", "2. Ignore case", ics);
            System.out.printf("%s\t\t%s\n", "3. Include non-letter", ins);
            System.out.println("4. Input text");
            System.out.println("9. Exit");
            System.out.print("Pilihan Anda : ");
            control = input.nextInt();
            switch (control) {
                case 1:
                    mcs = (cek) ? "OFF" : "ON";
                    ics = (cek) ? "ON" : "OFF";
                    mc = !mc;
                    ic = !ic;
                    cek = !cek;
                    break;
                case 2:
                    mcs = (cek) ? "OFF" : "ON";
                    ics = (cek) ? "ON" : "OFF";
                    mc = !mc;
                    ic = !ic;
                    cek = !cek;
                    break;
                case 3:
                    ins = (ins.equals("OFF")) ? "ON" : "OFF";
                    in = !in;
                    break;
                case 4:
                    System.out.print("Masukkan text untuk diencode: ");
                    input.nextLine();
                    s = input.nextLine();
                    System.out.print("Jumlah geser (integer): ");
                    x = input.nextInt();
                    for (int i = 0; i < s.length(); i++) {
                        char c = s.charAt(i);
                        if (Character.isLetter(c)) {
                            if (mc == true) {
                                if (x >= 0) {
                                    if (c >= 'a') {
                                        c += x;
                                        if (c > 'z') {
                                            c -= 26;
                                        }
                                        result += c;
                                    } else if (c >= 'A') {
                                        c += x;
                                        if (c > 'Z') {
                                            c -= 26;
                                        }
                                        result += c;
                                    }
                                } else if (x < 0) {
                                    if (c >= 'a') {
                                        c += x;
                                        if (c < 'a') {
                                            c += 26;
                                        }
                                        result += c;
                                    } else if (c >= 'A') {
                                        c += x;
                                        if (c < 'A') {
                                            c += 26;
                                        }
                                        result += c;
                                    }
                                }
                            } else if (mc==false ) {
                                c = Character.toLowerCase(c);
                                if (x >= 0) {
                                    c += x;
                                    if (c > 'z') {
                                        c -= 26;
                                    }
                                    result += c;
                                } else {
                                    c += x;
                                    if (c < 'a') {
                                        c += 26;
                                    }
                                    result += c;
                                }
                            }
                        } else {
                            if (in == true) {
                                c += x;
                                result += c;
                            } else
                                result += c;
                        }
                    }
            }
            out = "Hasil encode : " + result;
            System.out.printf("%s\n%s\n", out, "=".repeat(out.length()));
            result = "";
        } while (control != 9);
        
        // soal fibonacci
        System.out.print("Masukkan n : ");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        input.close();
    }
}
