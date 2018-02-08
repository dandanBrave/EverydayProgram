package dogyear.february.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/2/8.
 */
public class P0208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(getCommonStrLength(s1,s2));
        }
    }

    private static int getCommonStrLength(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dp = new int[len1+1][len2+1];

        for(int i=0;i<=len1;i++){
            for(int j=0;j<=len2;j++){
                dp[i][j] = 0;
            }
        }

        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = 0;
                }
            }
        }

        int max = 0;
        for(int i=0;i<=len1;i++){
            for(int j=0;j<=len2;j++){
                if(max < dp[i][j])
                    max = dp[i][j];
            }
        }

        return max;
    }
}
