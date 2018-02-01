package dogyear.february.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/2/1.
 */
public class P0201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            int n = Integer.parseInt(sc.nextLine());
            System.out.println(GCRatio(s,n));
        }
    }

    private static String GCRatio(String s, int n) {
        String result = "";
        int res = 0;
        //System.out.println(s.length());
        for (int i = 0; i <= s.length()-n; i++) {
            int sum = 0;
            String temp = s.substring(i,i+n);
            for (int j = i; j < i+n ; j++) {
                if(s.charAt(j)=='C'||s.charAt(j)=='G'){
                    sum++;
                }
            }
            if(sum > res){
                res = sum;
                result = temp;
            }
        }
        return result;
    }
}
