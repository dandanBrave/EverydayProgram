package dogyear.january.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/29.
 * 自守数是指一个数的平方的尾数等于该数自身的自然数。
 * 例如：25^2 = 625，76^2 = 5776，9376^2 = 87909376。请求出n以内的自守数的个数
 */
public class P0129 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(CalcAutomorphicNumbers(n));
        }
    }

    private static int CalcAutomorphicNumbers(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String s = i*i+"";
            String a = i+"";
            if(s.substring(s.length()-a.length()).equals(a)){
                sum++;
            }
        }
        return sum;
    }
}
