package dogyear.january.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/9.
 * 求小球落地5次后所经历的路程和第5次反弹的高度：
 * 假设一个球从任意高度自由落下，每次落地后反跳会原高度的一半，再落下，求它在第5次
 * 落地时，共经历多少米？第5次反弹多高？
 * 输入起始高度，int型；分别输出第5次落地时，共经过多少米，第5次反弹多高
 */
public class P0109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int high = sc.nextInt();
            System.out.println(getJourney(high));
            System.out.println(getTenthHigh(high));
        }
    }

    private static double getJourney(int high) {
        double dHigh = high;
        double sum = dHigh;

        for (int i = 1; i < 5; i++) {
            dHigh = dHigh / 2.0;
            sum = sum + dHigh * 2;
        }
        return sum;
    }

    private static double getTenthHigh(int high) {
        double fifHigh = high;
        for (int i = 0; i < 5 ; i++) {
            fifHigh = fifHigh / 2.0;
        }
        return fifHigh;
    }
}
