package dogyear.january.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/26.
 */
public class P0126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int sum1 = 0, sum2 = 0;
            int[] arr = new int[n];
            int count = 0;
            for (int i = 0; i < n ; i++) {
                int temp = sc.nextInt();
                if(temp%5 == 0){
                    sum1 += temp;
                }else if(temp%3 == 0){
                    sum2 += temp;
                }else {
                    arr[count++] = temp;
                }
            }
            int sum = Math.abs(sum1 - sum2);
            System.out.println(f(0,count,arr,0,sum));
        }
    }

    private static boolean f(int i, int n, int[] arr, int result, int sum) {
        if(i == n){
            return Math.abs(result) == sum;
        }else {
            return (f(i+1,n,arr,result+arr[i],sum) || f(i+1,n,arr,result-arr[i],sum));
        }
    }
}
