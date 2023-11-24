import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int ukuran = q.nextInt();
        int nPeluru = q.nextInt();
        char[][] map = new char[ukuran][ukuran];

        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                map[i][j] = 'O';
            }
        }
        for (int i = 0; i < nPeluru; i++) {
            int x = q.nextInt();
            int y = q.nextInt();

            Mortar(map, x - 1, y - 1);
        }
        Map(map);

        q.close();
    }

    static void Mortar(char[][] map, int x, int y) {
        if (x >= 0 && x < map.length && y >= 0 && y < map[0].length) {
            map[x][y] = 'X';
        }
    }

    static void Map(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}