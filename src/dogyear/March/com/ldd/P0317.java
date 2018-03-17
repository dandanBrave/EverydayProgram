package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int arr[][] = new int[11][11];
        arr[0][0] = 0;
        for (int i = 0; i < 11; i++) {
            arr[i][0] = 1;
        }
        for (int i = 0; i < 11 ; i++) {
            arr[0][i] = 1;
        }
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        System.out.println(arr[x][y]);
    }
}
