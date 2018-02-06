package dogyear.february.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/2/6.
 */
public class P0206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] temp = new int[n];
            for(int i = 0;i<n;i++){
                temp[i] = (n-1)*n+2*i+1;
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < temp.length-1; i++) {
                sb.append(temp[i] + "+");
            }
            sb.append(temp[temp.length-1]);
            System.out.println(sb);
        }
    }
}
