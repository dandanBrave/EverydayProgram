package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0327 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(getDis(arr,n));
        }
    }

    private static int getDis(int[] arr, int n) {
        int min = arr[0];
        int dis = 0;
        for (int i = 1; i < n; i++) {
            if((arr[i]-min) > dis){
                dis = arr[i] - min;

            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return dis;
    }
}
