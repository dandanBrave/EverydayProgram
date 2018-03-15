package dogyear.March.com.ldd;

import java.util.Scanner;

/*
幸运数
 */
public class P0315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= n ; i++) {
                int a = f(i);
                int b = g(i);
                if(a == b){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }

    private static int f(int i) {
        int temp = 0;
        while (i/10 != 0){
            temp = temp + i % 10;
            i = i / 10;
        }
        temp = temp + i%10;
        return temp;
    }

    private static int g(int i) {
        String j = Integer.toBinaryString(i);
        char[] arr = j.toCharArray();
        int temp = 0;
        for (int k = 0; k < j.length() ; k++) {
            temp += Integer.parseInt(arr[k]+"");
        }
        return temp;
    }
}
