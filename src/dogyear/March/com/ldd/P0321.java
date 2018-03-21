package dogyear.March.com.ldd;

import java.util.Arrays;
import java.util.Scanner;

public class P0321 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(impResult(arr,n));
    }

    private static int impResult(int[] arr, int n) {
        int result = 0;
        if(n == 1){
            result = arr[0] + 1;
        }else if(arr[0] > 1){
            result = 1;
        }else{
            result = arr[0];
            for (int i = 1; i < n; i++) {
                if(arr[i]-result > 1) break;
                else result += arr[i];
            }
            result += 1;
        }
        return result;
    }
}
