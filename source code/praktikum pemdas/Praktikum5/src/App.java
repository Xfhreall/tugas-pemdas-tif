import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int jumlah;
        System.out.print("Masukan text : ");
        String s = input.nextLine().toLowerCase();
        char[] tabel = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            tabel[i] = s.charAt(i);
        }
        // method untuk mengurutkan karakter
        Arrays.sort(tabel);
        System.out.printf("\n------------------------------");
        System.out.printf("\n|%-14s|%-13s|", "Karakter", "Jumlah");
        System.out.printf("\n------------------------------");
        for (int i = 0; i < s.length(); i++) {
            jumlah = 0;
            for (int j = 0; j < s.length(); j++) {
                if (tabel[i] == s.charAt(j)) {
                    jumlah++;
                }
            }
            if (i != 0) {
                if (tabel[i] != tabel[i - 1]) {
                    System.out.printf("\n|'%-14s|%-13d|", tabel[i] + "'", jumlah);
                }
            } else {
                System.out.printf("\n|'%-14s|%-13d|", tabel[i] + "'", jumlah);
            }
        }
        System.out.println();
        System.out.println("-".repeat(30));

        // soal mariks
        System.out.print("Masukkan ukuran matriks : ");
        int n = input.nextInt();
        int[][] matriks1 = new int[n][n];
        System.out.println("Matriks 1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriks1[i][j] = input.nextInt();
            }
        }
        int[][] matriks2 = new int[n][n];
        System.out.println("Matriks 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriks2[i][j] = input.nextInt();
            }
        }
        System.out.println("Hasil perkalian matriks :");
        int[][] hasil = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
