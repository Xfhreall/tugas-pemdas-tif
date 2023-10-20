import java.utill.*;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);

        //soal 1

        String s = input.next();
        String j = input.next();
        int n0 =0;
        int n1 =0;
        int n2 =0;
        int n3 =0;
        int n4 =0;
        int n5 =0;

        String result = "";

        if (s.length() == 6){
        n0 = (int) s.charAt(0)%64;
        n1 = (int) s.charAt(1)%64;
        n2 = (int) s.charAt(2)%64;
        n3 = (int) s.charAt(3)%64;
        n4 = (int) s.charAt(4)%64;
        n5 = (int) s.charAt(5)%64;

        if(n0==n1 && n1==n2 && n2==n3){
        if (n4==n5){
        result = "Gajah";
        } else if (2*n4==n5){
        result = "Jerapah";
        } else {
        result = "Beruang";
        }
        } else if(n1==n2 &&n2==n3 && n3==n4){
        if (n0==n5){
        result = "Gajah";
        } else if (2*n0==n5){
        result = "Jerapah";
        } else {
        result = "Beruang";
        }

        } else if (n2==n3 && n3==n4 && n4==n5){
        if (n0==n1){
        result = "Gajah";
        } else if (2*n0==n1){
        result = "Jerapah";
        } else {
        result = "Beruang";
        }

        } else {
        System.out.println("Yah, tidak dapat membuat robot " + j);
        System.out.println("Tidak dapat membuat robot");
        return;
        }

        if (j.equals(result)){
        System.out.println("Yey, dapat membuat robot " + j);
        System.out.println("Membuat robot "+ result);
        } else{
        System.out.println("Yah, tidak dapat membuat robot " + j);
        System.out.println("Membuat robot "+ result);
        }

        //soal 2
        String cek = input.nextLine();
        if (cek.length() < 5) {
        System.out.print("Maybe he's confused after all.");
        return;
        }
        if (cek.indexOf("a") == -1 || cek.indexOf("p") == -1 || cek.indexOf("l") ==
        -1 || cek.indexOf("e") == -1) {
        System.out.print("Maybe he's confused after all.");
        } else if (cek.indexOf("l") < cek.indexOf("p")) {
        System.out.print("Maybe he's confused after all.");
        } else if (cek.indexOf("l") != -1 && cek.indexOf("e") != -1 &&
        cek.indexOf("a") != -1
        && cek.indexOf("p") != -1) {
        System.out.print("He's a little confused but he got the spirit.");
        }

        // soal 3
        int p = input.nextInt();
        int x = input.nextInt(), y = input.nextInt(), z = input.nextInt();
        String hasil = "";

        if (1 <= p && p <= 3) {
            if (x == 0) {
                if (p == 1) {
                    hasil += "NO";
                }
                if (p == 2) {
                    hasil = (y == 3) ? "YES" : "NO";
                }
                if (p == 3) {
                    hasil = (z == 2) ? "YES" : "NO";
                }
            }
            if (y == 0) {
                if (p == 2) {
                    hasil += "NO";
                }
                if (p == 1) {
                    hasil = (y == 3) ? "YES" : "NO";
                }
                if (p == 3) {
                    hasil = (z == 1) ? "YES" : "NO";
                }
            }
            if (z == 0) {
                if (p == 3) {
                    hasil += "NO";
                }
                if (p ==1){
                    hasil = (x == 2)? "YES":"NO";
                }
                if (p == 2){
                    hasil = (y == 1)? "YES":"NO";
                }
            }
            System.out.println(hasil);

            input.close();
        }
    }
    }
}
