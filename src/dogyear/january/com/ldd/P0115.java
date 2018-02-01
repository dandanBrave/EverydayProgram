package dogyear.january.com.ldd;

import java.util.Scanner;
/**
 * Created by Administrator on 2018/1/15.
 * 计算字符串的距离：可以通过替换，插入，删除，将一个字符串转换为另一个字符串。
 */
public class P0115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String a = sc.next();
            String b = sc.next();
            char[] charA = a.toCharArray();
            char[] charB = b.toCharArray();
            System.out.println(calStringDistance(charA,charB));
        }
    }

    private static int calStringDistance(char[] charA, char[] charB) {
        int[][] dp = new int[charA.length+1][charB.length+1];
        for (int i = 0; i < charA.length+1 ; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j < charB.length+1 ; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i < charA.length+1 ; i++) {
            for (int j = 1; j < charB.length+1 ; j++) {
                if(charA[i-1] == charB[j-1]){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(Math.min(dp[i-1][j]+1,dp[i][j-1]+1),dp[i-1][j-1]+1);
                }
            }
        }
        return dp[charA.length][charB.length];
    }
}
