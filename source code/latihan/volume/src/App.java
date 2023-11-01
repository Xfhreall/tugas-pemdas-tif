import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        String jenis = input.nextLine();
        switch (jenis) {
            case "balok":
               double p = input.nextDouble();
               double l = input.nextDouble();
               double t = input.nextDouble();
               double va = p * l * t;
                System.out.printf("volume bangunan = %.5f m3", va / 1000000);
                break;
            case "prisma segitiga":
                double a = input.nextDouble();
                double ts = input.nextDouble();
                double tp = input.nextDouble();
                double vb = (a * ts * tp) * 1 / 2;
                System.out.printf("volume bangunan = %.5f m3", vb / 1000000);
                break;
            case "tabung":
                double d = input.nextDouble(), tb = input.nextDouble();
                double rt = d / 2;
                double vc = 0;
                if (rt % 7 == 0) {
                    vc = rt * rt * tb * 22 / 7;
                    System.out.printf("volume bangunan = %.5f m3", vc / 1000000);
                } else {
                    vc = rt * rt * tb * 3.14;
                    System.out.printf("volume bangunan = %.5f m3", vc / 1000000);
                }
                break;
            case "bola":
                double db = input.nextDouble();
                double rb = db / 2;
                double vd = 0;
                if (rb % 7 == 0) {
                    vd =  rb * rb * rb * 22/7 * 4/3;
                } else {
                    vd = rb * rb * rb * 3.14 * 4/3 ;
                }
                System.out.printf("volume bangunan = %.5f m3", vd / 1000000);
                break;
        }
        input.close();
    }
}
