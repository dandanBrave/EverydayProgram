package dogyear.february.com.ldd;

import java.util.*;
import java.math.*;
public class P0210 {
    public static String calculateStringDistance(String eA, String eB){
        int[][] dif = new int[eA.length()+1][eB.length()+1];
        for(int i=0;i<=eA.length();i++){
            dif[i][0]=i;
        }
        for(int i=0;i<=eB.length();i++){
            dif[0][i]=i;
        }
        int temp=0;
        for(int i=1;i<=eA.length();i++){
            for(int j=1;j<=eB.length();j++){
                if(eA.charAt(i-1)==eB.charAt(j-1)){
                    temp=0;
                }else{
                    temp=1;
                }
                dif[i][j]=min(dif[i-1][j-1]+temp,dif[i][j-1]+1,dif[i-1][j]+1);
            }
        }
        StringBuilder sb = new StringBuilder();
        dif[eA.length()][eB.length()]+=1;
        sb.append(1+"/"+dif[eA.length()][eB.length()]);
        return sb.toString();
    }
    public static int min(int a,int b,int c){
        int i = a<b?a:b;
        return i<c?i:c;
    }
    public static void main(String[] args) {
    // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        String str1 = scan.next();
        String str2 = scan.next();
        System.out.println(calculateStringDistance(str1,str2));
        }
    }
}
