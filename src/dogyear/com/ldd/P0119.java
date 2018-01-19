package dogyear.com.ldd;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/19.
 * 大数相加
 */
public class P0119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            BigInteger n1 = sc.nextBigInteger();
            BigInteger n2 = sc.nextBigInteger();
            System.out.println(n1.add(n2));

        }
    }
}
