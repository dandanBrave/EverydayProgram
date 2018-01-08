package dogyear.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/8.
 * 整数与IP地址间的转换：
 * 输入IP地址，输入10进制的IP地址；
 * 输出转换成10进制的IP地址，输出转换后的iP地址。
 */
public class P0108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String IPAdress = sc.next();   //10.0.3.193
            String longNum = sc.next();    //167969729
            System.out.println(IPAdressToLongNum(IPAdress));
            System.out.println(LongNumToIPAdress(longNum));
        }
    }

    private static Long IPAdressToLongNum(String ipAdress) {
        String[] IPAdressArray = ipAdress.split("\\.");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < IPAdressArray.length ; i++) {
           String temp = "00000000" + Long.toBinaryString(Long.parseLong(IPAdressArray[i]));
           sb.append(temp.substring(temp.length()-8));
        }
        return Long.valueOf(sb.toString(),2);
    }

    private static String LongNumToIPAdress(String longNum) {
        String temp = Long.toBinaryString(Long.parseLong(longNum));
        int length = temp.length();
        for (int i = 0; i < 32-length; i++) {
            temp = "0" + temp;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < temp.length(); i+=8) {
            String subStr = "";
            if(i == temp.length()-8){
                subStr = temp.substring(i);
            }else{
                subStr = temp.substring(i,i+8);
            }
            sb.append(Long.valueOf(subStr,2)+".");
        }
        return sb.toString().substring(0,sb.length()-1);
    }
}
