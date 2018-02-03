package dogyear.february.com.ldd;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/2/3.
 * 超长正整数相加
 */
public class P0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(a.add(b));
        }
    }
}
