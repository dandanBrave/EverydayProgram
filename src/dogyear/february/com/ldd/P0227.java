package dogyear.february.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/2/27.
 * 分苹果
 */
public class P0227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            int ave = sum / n;
            if(sum % n != 0){
                System.out.println(-1);
                return;
            }
            for (int i = 0; i < n ; i++) {
                if(Math.abs(arr[i]-ave)%2 != 0){
                    System.out.println(-1);
                    return;
                }
            }
            int index = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] > ave){
                    index += (arr[i]-ave) / 2;
                }
            }
            System.out.println(index);


        }
    }
}
