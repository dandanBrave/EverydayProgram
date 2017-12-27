package com.ldd;
import java.util.Scanner;
/**
 * Created by Administrator on 2017/12/27.
 * 识别有效的IP地址和掩码并进行分类统计：(not by myself)
 */

public class P1227 {
    private static int[] num = new int[7];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strIP = new String[1];

        while (sc.hasNext()) {
            strIP[0] = sc.nextLine();
            count(strIP);
        }
        for (int i = 0; i < 7; i++) {
            if (i == 6)
                System.out.println(num[i]);
            else
                System.out.print(num[i] + " ");
        }
        sc.close();
    }

    public static void count(String[] strIP) {
        String[] str = new String[2];  // ~前后的字符串
        int[] ipInt = new int[4];
        int[] maskIpInt = new int[4];
        long mask = 0;
        for (int i = 0; i < strIP.length; i++) {
            str = strIP[i].split("~");
            String[] ip = str[0].split("\\.");
            String[] maskIp = str[1].split("\\.");

            if (ip.length < 4 || maskIp.length < 4) {
                num[5]++;
                continue;
            }

            for (int k = 0; k < 4; k++) {
                if ("".equals(ip[k]) || "".equals(maskIp[k])
                        || " ".equals(ip[k]) || " ".equals(maskIp[k])) {
                    num[5]++;
                    break;
                }
            }

            for (int j = 0; j < 4; j++) {
                ipInt[j] = Integer.parseInt(ip[j]);
                maskIpInt[j] = Integer.parseInt(maskIp[j]);
                if (ipInt[j] < 0 || ipInt[j] > 255 || maskIpInt[j] < 0
                        || maskIpInt[j] > 255) {
                    num[5]++;
                    break;
                }
            }

            if (maskIpInt[0] == 255 && maskIpInt[1] == 255
                    && maskIpInt[2] == 255 && maskIpInt[3] == 255) {
                num[5]++;
                continue;
            }

            mask = maskIpInt[0] * (0xffffff + 1l) + maskIpInt[1]
                    * (0xffff + 1l) + maskIpInt[2] * (0xff + 1l) + maskIpInt[3];

            if (((mask - 1l) | mask) != 0xffffffffl) {
                num[5]++;// 判断子网掩码合法性
                continue;
            }

            if ((ipInt[0] == 10)
                    || (ipInt[0] == 172 && ipInt[1] >= 16 && ipInt[1] <= 31)
                    || (ipInt[0] == 192 && ipInt[1] == 168)) {
                num[6]++;
                // continue;
            }
            if (ipInt[0] >= 1 && ipInt[0] <= 126)
                num[0]++;
            if (ipInt[0] >= 128 && ipInt[0] <= 191)
                num[1]++;
            if (ipInt[0] >= 192 && ipInt[0] <= 223)
                num[2]++;
            if (ipInt[0] >= 224 && ipInt[0] <= 239)
                num[3]++;
            if (ipInt[0] >= 240 && ipInt[0] <= 255)
                num[4]++;
        }

    }
}