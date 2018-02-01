package dogyear.january.com.ldd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Created by Administrator on 2018/1/18.
 * 完全数计算：
 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
 * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
 * 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28
 */
public class P0118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(count(n));
        }
    }

    private static int count(int n) {
        if(n == 1){
            return -1;
        }
        int result = 0;
        for (int i = 2; i < n ; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j < i ; j++) {
                if(i%j==0){
                    list.add(j);
                }
            }
            int sum = 0;
            for (int j = 0; j < list.size() ; j++) {
                sum += list.get(j);
            }
            if(sum == i){
                result += 1;
            }
        }
        return result;
    }
}
