package dogyear.february.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/2/26.
 * 解救小易
 */
public class P0226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int x[] = new int[n];
            int y[] = new int[n];
            for (int i = 0; i < n ; i++) {
                x[i] = sc.nextInt()-1;
            }
            for (int i = 0; i < n ; i++) {
                y[i] = sc.nextInt()-1;
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n ; i++) {
                if(x[i]+y[i] < min){
                    min = x[i]+y[i];
                }
            }
            System.out.println(min);
        }
    }
}
