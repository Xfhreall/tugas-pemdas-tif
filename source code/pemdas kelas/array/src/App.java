import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        // int[] a;
        // a = new int[5];
        // a[2] = 37;
        // a[3] = 20;
        // a[1] = 40;
        // int mean = 0;
        // for (int i = 0; i < a.length; i++) {
        // mean += a[i];
        // }
        // System.out.println(mean / 5);
        // String s = "ARRAA";
        // char[] b;
        // int i = 0;
        // b = new char[5];
        // int upah = 0;
        // for (i = 0; i < s.length(); i++) {
        //     char c = s.charAt(i);
        //     b[i] += c;
        //     if (b[i] == 'A') {
        //         upah++;
        //     }
        //     if (b[i] == 'R') {
        //         break;
        //     }
        // }
        // String s = "0010101";
        // String [] a = s.split("1");
        // for (int i = 0; i < a.length; i++) {
        //     System.err.println(a[i]);
        // }
        Scanner scanner= new Scanner(System.in);
        System.out.print("masukkin nilai=");
        int nilai=scanner.nextInt();
        System.out.println("anda memasukkan nilai="+nilai);
        printNilai(nilai);
        int jumlah=jumlahNilai(nilai);
        System.out.println("Jumlah="+jumlah);
    }
    //fungsi rekursif sederhana 
    private static int jumlahNilai(int parameter){
        System.out.println("parameter="+parameter);
        if(parameter==0){
            return parameter;
        }
        return parameter+jumlahNilai(parameter-1);
    }
    private static void printNilai(int parameter){
        System.out.println("nilai="+parameter);
        if(parameter==0){
            return;
        }
        parameter--;
        printNilai(parameter);
    }
}
