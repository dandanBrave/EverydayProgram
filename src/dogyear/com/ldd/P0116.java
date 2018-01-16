package dogyear.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/16.
 * iNOC产品部-杨辉三角形的变形
 */
public class P0116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if(n<=2){
                System.out.println(-1);
            }else if(n%2==1){
                System.out.println(2);
            }else if(n%4==0){
                System.out.println(3);
            }else{
                System.out.println(4);
            }
        }
    }
}
