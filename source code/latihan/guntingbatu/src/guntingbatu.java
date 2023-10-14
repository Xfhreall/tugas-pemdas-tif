import java.util.*;

public class guntingbatu {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String player1 = input.next();
        String play1 = input.next();

        String player2 = input.next();
        String play2 = input.next();
        if (play1 == play2) {
            System.out.println(player1 + "dan" + player2 + "seri");
        } else {
            switch (play1) {
                case "batu":
                    if (play2.equalsIgnoreCase("gunting")) {
                        System.out.println(player1 + " menang");
                    } else if (play2.equalsIgnoreCase("kertas")) {
                        System.out.println(player2 + " menang");
                    }
                    break;
                case "gunting":
                    if (play2.equalsIgnoreCase("kertas")) {
                        System.out.println(player1 + " menang");
                    } else if (play2.equalsIgnoreCase("batu")) {
                        System.out.println(player2 + " menang");
                    }
                    break;
                case "kertas":
                    if (play2.equalsIgnoreCase("batu")) {
                        System.out.println(player1 + " menang");
                    } else if (play2.equalsIgnoreCase("gunting")) {
                        System.out.println(player2 + " menang");
                    }
                    break;
                default:
                    System.out.println("Maen apa si bang?");
                    break;
            }
        }
    }
}
