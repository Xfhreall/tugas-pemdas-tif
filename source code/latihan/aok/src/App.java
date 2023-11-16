import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int control, desimal, dtb, htd;
        String biner, hexa;
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
                    desimal = Integer.parseInt(biner, 2);
                    System.out.println("Desimal : " + desimal);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan desimal: ");
                    desimal = input.nextInt();
                    biner = Integer.toBinaryString(desimal);
                    System.out.println("Biner : " + biner);
                    break;
                case 3:
                    System.out.print("Masukkan bilangan biner: ");
                    biner = input.next();
                    desimal = Integer.parseInt(biner, 2);
                    hexa = Integer.toHexString(desimal);
                    System.out.println("Hexa : " + hexa);
                    break;
                case 4:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    hexa = input.next();
                    dtb = Integer.parseInt(hexa, 16);
                    biner = Integer.toBinaryString(dtb);
                    System.out.println("Biner : " + biner);
                    break;
                case 5:
                    System.out.print("Masukkan bilangan desimal: ");
                    desimal = input.nextInt();
                    hexa = Integer.toHexString(desimal);
                    System.out.println("Hexa : " + hexa);
                    break;
                case 6:
                    System.out.print("Masukkan bilangan heksadesimal: ");
                    hexa = input.next();
                    htd = Integer.parseInt(hexa, 16);
                    System.out.println("Desimal : " + htd);
                    break;
                default:
                    System.out.println("Pilih dengan benar");
                    break;
            }
        } while (control != 0);
        input.close();
    }
}
