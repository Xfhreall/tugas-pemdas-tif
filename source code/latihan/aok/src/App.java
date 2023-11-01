import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int control, bd, desimal, desimalHexa1, desimalBiner, desimalHexa2, hd;
        String biner, db, binerHexa, bh, hexaBiner, hb, dh, hexaDesimal;
        do {
            System.out.println("=".repeat(30));
            System.out.println("Pilih operasi yang di mau:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke Hexa");
            System.out.println("4. Hexa ke Biner");
            System.out.println("5. Desimal ke Hexa");
            System.out.println("6. Hexa ke Desimal");
            System.out.println("0. Exit");
            System.out.print("Pilihan anda : ");
            control = input.nextInt();
            switch (control) {
                case 1:
                    System.out.print("Masukkan bilangan biner: ");
                    biner = input.next();
                    bd = Integer.parseInt(biner, 2);
                    System.out.println("Desimal : " + bd);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    desimal = input.nextInt();
                    db = Integer.toBinaryString(desimal);
                    System.out.println("Biner : " + db);
                    break;
                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    binerHexa = input.next();
                    desimalHexa1 = Integer.parseInt(binerHexa, 2);
                    bh = Integer.toHexString(desimalHexa1);
                    System.out.println("Hexa : " + bh);
                    break;
                case 4:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    hexaBiner = input.next();
                    desimalBiner = Integer.parseInt(hexaBiner, 16);
                    hb = Integer.toBinaryString(desimalBiner);
                    System.out.println("Biner : " + hb);
                    break;
                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    desimalHexa2 = input.nextInt();
                    dh = Integer.toHexString(desimalHexa2);
                    System.out.println("Hexa : " + dh);
                    break;
                case 6:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    hexaDesimal = input.next();
                    hd = Integer.parseInt(hexaDesimal, 16);
                    System.out.println("Desimal : " + hd);
                    break;
                default:
                    System.out.println("Pilih dengan benar");
                    break;
            }
        } while (control != 0);
        input.close();
    }
}
