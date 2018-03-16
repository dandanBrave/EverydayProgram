package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10001];
        for (int i = 0; i < 9997 ; i++) {
            int temp = sc.nextInt();
            arr[temp] = 1;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10001 ; i++) {
            if(arr[i] == 0){
                sb.append(i);
            }
        }
        Long newNum = Long.parseLong(sb.toString());
        System.out.println(newNum % 7);
    }
}
