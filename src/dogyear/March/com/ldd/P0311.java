package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String[] arrS = s.split(" ");
            StringBuffer sb = new StringBuffer();
            for (int i = arrS.length-1; i > 0 ; i--) {
                sb.append(arrS[i]+" ");
            }
            sb.append(arrS[0]);
            System.out.println(sb.toString());
        }
    }
}
