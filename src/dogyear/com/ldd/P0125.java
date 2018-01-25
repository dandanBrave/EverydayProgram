package dogyear.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/25.
 * 请编写一个函数（允许增加子函数），计算n x m的棋盘格子（n为横向的格子数，m为竖向的格子数）
 * 沿着各自边缘线从左上角走到右下角，总共有多少种走法，要求不能走回头路，
 * 即：只能往右和往下走，不能往左和往上走
 */
public class P0125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int row = sc.nextInt();
            int col = sc.nextInt();
            System.out.println(count(row,col));
        }
    }

    private static int count(int n, int m) {
        if(n==1){
            return m+1;
        }
        if(m==1){
            return n+1;
        }
        return count(n,m-1)+count(n-1,m);
    }
}
