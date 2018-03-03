package dogyear.March.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/3/3.
 */
public class P0303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String a = sc.nextLine();
            String b = sc.nextLine();
            int len = a.length();
            int sum = 0;
            for (int i = 0; i <= len ; i++) {
                String temp = a.substring(0,i) + b + a.substring(i);
                String revTemp = new StringBuffer(temp).reverse().toString();
                if(temp.equals(revTemp)){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
