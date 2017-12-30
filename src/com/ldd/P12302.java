package com.ldd;

import java.util.*;

/**
 * Created by Administrator on 2017/12/30.
 * 数据分类处理：
 * 输入为一组输入整数序列I和一组规则整数序列R，I和R序列的第一个整数位序列的个数
 */
public class P12302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            //整数序列I
            int INum = sc.nextInt();
            int[] ISeries = new int[INum];
            for (int i = 0; i < INum ; i++) {
                ISeries[i] = sc.nextInt();
            }

            //规则整数序列R,过滤重复数字，并且按从小到大进行了排序
            int RNum = sc.nextInt();
            SortedSet<Integer> RSeries = new TreeSet<>();
            for (int i = 0; i < RNum ; i++) {
                RSeries.add(sc.nextInt());
            }
            System.out.println(dealData(RSeries,ISeries));

        }
    }

    private static String dealData(SortedSet<Integer> rSeries, int[] iSeries) {
        List<Integer> result = new LinkedList<>();
        for (int r:rSeries) {
            rInISeries(r,iSeries,result);
        }
        StringBuffer sb = new StringBuffer();
        sb.append(result.size()).append(" ");
        for (int i : result) {
            sb.append(i).append(" ");
        }
        return sb.substring(0,sb.length()-1);  //去掉最后的空格
    }

    private static void rInISeries(int r, int[] iSeries, List<Integer> result) {
        //保存结果的对象
        List<Integer> temp = new LinkedList<>();
        for (int i = 0; i < iSeries.length ; i++) {
            if((iSeries[i]+"").contains(r+"")){
                temp.add(i);
                temp.add(iSeries[i]);
            }
        }
        if(!temp.isEmpty()) {
            result.add(r);
            result.add(temp.size()/2);
            result.addAll(temp);
        }
    }
}
