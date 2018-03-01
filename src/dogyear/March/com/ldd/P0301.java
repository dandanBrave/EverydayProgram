package dogyear.March.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/3/1.
 */
public class P0301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            Long h = sc.nextLong();
            long temp = (long)Math.sqrt(h);
            if(temp*(temp+1) <= h){
                System.out.println(temp);
            }else{
                System.out.println(temp-1);
            }
        }
    }
}
