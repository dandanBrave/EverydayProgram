package dogyear.April.com.ldd;

import java.util.Scanner;

public class P0403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextInt();
            }
            int maxGap = Integer.MIN_VALUE, minMaxGap = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                maxGap = Math.max(maxGap,arr[i]-arr[i-1]);
            }
            for (int i = 1; i < n-1; i++) {
                minMaxGap = Math.min(maxGap,Math.max(arr[i+1]-arr[i-1],maxGap));
            }
            System.out.println(minMaxGap);
        }
        sc.close();
    }
}
