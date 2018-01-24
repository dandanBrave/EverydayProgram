package dogyear.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/24.
 * 合法IP：输入一个IP地址，返回判断的结果YES or NO
 */
public class P0124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String ip = sc.next();
            String[] ipArr = ip.split("\\.");
            String result = "YES";
            if(ipArr.length<4){
                result = "NO";
            }else{
                for (int i = 0; i < 4 ; i++) {
                    int temp = Integer.parseInt(ipArr[i]);
                    if(temp<0 || temp>255){
                        result = "NO";
                        break;
                    }
                }
                System.out.println(result);
            }
        }
    }
}
