package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m  ; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(getMost(arr));
    }

    public static int getMost(int[][] board) {
        if(board == null || board.length == 0){
            return 0;
        }

        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[0].length ; j++) {
                if(i==0 && j==0){

                }else if(i==0){
                    board[i][j] += board[i][j-1];
                }else if(j==0){
                    board[i][j] += board[i-1][j];
                }else{
                    board[i][j] += Math.max(board[i][j-1],board[i-1][j]);
                }
            }
        }
        return board[board.length-1][board[0].length-1];
    }
}
