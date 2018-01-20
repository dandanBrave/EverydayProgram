package dogyear.com.ldd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/20.
 * 输入n个整数，输出其中最小的K个。
 */
public class P1220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n ; i++) {
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            for (int i = 0; i < k-1 ; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println(array[k-1]);

        }
    }
}
