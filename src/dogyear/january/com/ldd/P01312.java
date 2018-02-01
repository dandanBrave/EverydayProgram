package dogyear.january.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/31.
 * 查找输入整数二进制中1的个数
 */
public class P01312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String bin = Integer.toBinaryString(n);
            int sum = 0;
            for (int i = 0; i < bin.length() ; i++) {
                if(bin.charAt(i)=='1'){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
