import java.util.Scanner;

public class Solution {
    static Scanner read = new Scanner(System.in);

    static void penjumlahan(int a, int b) {
        int x = a + b;
        System.out.println(a + " + " + b + " = " + x);
    }

    static void pengurangan(int a, int b) {
        int x = a - b;
        System.out.println(a + " - " + b + " = " + x);
    }

    static void pembagian(int a, int b) {
        int x = a / b;
        System.out.println(a + " / " + b + " = " + x);
    }

    static void perkalian(int a, int b) {
        int x = a * b;
        System.out.println(a + " * " + b + " = " + x);
    }

    public static void main(String[] args) {
        String x = read.nextLine();
        String[] sSplit = x.split(" ");

        int a = Integer.parseInt(sSplit[1]);
        int b = Integer.parseInt(sSplit[2]);

        switch (sSplit[0]) {
            case "+":
                penjumlahan(a, b);
                break;
            case "-":
                pengurangan(a, b);
                break;
            case "*":
                perkalian(a, b);
                break;
            case "/":
                pembagian(a, b);
                break;
            default:
                break;
        }
    }
}
