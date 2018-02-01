package dogyear.january.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/10.
 * 判断两个IP是否属于同一子网：
 * 若两台主机的IP地址分别与它们的子网掩码相“与”后的结果相同，则说明这两台主机在同一子网中。
 */
public class P0110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String mask = sc.next();
            String ip1 = sc.next();
            String ip2 = sc.next();
            checkNetSegment(mask,ip1,ip2);
        }
    }

    private static void checkNetSegment(String mask, String ip1, String ip2) {


        String[] maskArr = mask.split("\\.");
        String[] ip1Arr = ip1.split("\\.");
        String[] ip2Arr = ip2.split("\\.");

        if (mask==null || maskArr.length<4 || ip1==null || ip1Arr.length<4 || ip2==null || ip2Arr.length<4) {
            System.out.println(1);
            return;
        }

        for (int i = 0; i < mask.length() ; i++) {
            if (Integer.valueOf(maskArr[i]) < 0 || Integer.valueOf(maskArr[i]) > 255
                    || Integer.valueOf(ip1Arr[i]) < 0 || Integer.valueOf(ip1Arr[i]) > 255
                    || Integer.valueOf(ip2Arr[i]) < 0 || Integer.valueOf(ip2Arr[i]) > 255) {
                System.out.println(1);
                System.exit(0);
            }
        }
        boolean flag = false;
        for (int i = 0; i < mask.length(); i++) {
            if( (Integer.valueOf(maskArr[i]) & Integer.valueOf(ip1Arr[i])) ==
                    (Integer.valueOf(maskArr[i]) & Integer.valueOf(ip2Arr[i]))){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }
        if (flag = true){
            System.out.println(0);
        }else {
            System.out.println(2);
        }
    }
}
