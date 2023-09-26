
package uang;

import java.util.*;

/**
 *
 * @author acer
 *         Nama :
 *         - Risqi Achmad Fahreal - 235150201111048
 *         - Mochammad Attila Eka Raharjo - 2351502021111051
 *         - Alfi Muhammad Ghiffari - 235150200111048
 */
public class Uang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u100, u50, u20, u10, u5, u2, u1;

        System.out.println("Masukkan nominal uang (Xrb) :");
        int inpt = sc.nextInt();
        u100 = inpt / 100;
        inpt %= 100;
        u50 = inpt / 50;
        inpt %= 50;
        u20 = inpt / 20;
        inpt %= 20;
        u10 = inpt / 10;
        inpt %= 10;
        u5 = inpt / 5;
        inpt %= 5;
        u2 = inpt / 2;
        inpt %= 2;
        u1 = inpt / 1;
        sc.close();
        System.out.println("pecahan 100rb sebanyak : " + u100);
        System.out.println("pecahan 50rb sebanyak : " + u50);
        System.out.println("pecahan 20rb sebanyak : " + u20);
        System.out.println("pecahan 10rb sebanyak : " + u10);
        System.out.println("pecahan 5rb sebanyak : " + u5);
        System.out.println("pecahan 2rb sebanyak : " + u2);
        System.out.println("pecahan 1rb sebanyak : " + u1);

    }

}
