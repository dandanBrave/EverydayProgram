package dogyear.january.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/31.
 * 放苹果：
 * 把M个同样的苹果放在N个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？（用K表示）5，1，1和1，5，1 是同一种分法。
 */
public class P0131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int M = sc.nextInt();
            int N = sc.nextInt();
            System.out.println(count(M,N));
        }
    }

    private static int count(int m, int n) {
        if(m<0||m>10||n<1||n>10){
            return -1;
        }
        if(m==0||n==1)
            return 1;
        else if(m<n)
            return count(m,m);
        else
            return count(m,n-1)+count(m-n,n);
    }
}
