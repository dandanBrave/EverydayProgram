package dogyear.february.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/2/25.
 * 不要二
 */
public class P0225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int row = sc.nextInt();
            int col = sc.nextInt();
            System.out.println(Cake(row,col));
        }
    }

    private static int Cake(int row, int col) {
        int arr[][] = new int[row][col];
        //从横行开始
        for (int i = 0; i < row; i++) {
            //横行第一个可以放蛋糕的
            if(i%4==0 || i%4==1){
                for (int j = 0; j < col; j++) {
                    if(j%4==0 || j%4==1){
                        arr[i][j] = 1;
                    }
                }
                //横行第一个不可以放蛋糕的
            }else{
                for (int j = 0; j < col; j++) {
                    if(j%4==2 || j%4==3){
                        arr[i][j] = 1;
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                if(arr[i][j] == 1){
                    sum++;
                }
            }
        }
        return sum;
    }
}
