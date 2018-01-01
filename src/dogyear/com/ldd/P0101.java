package dogyear.com.ldd;

import java.util.Scanner;
/**
 * Created by Administrator on 2018/1/1.
 * 统计每个月兔子的总数：
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，兔子长到第三个月后每个月又
 * 生一只兔子，假设所有的兔子都不死，问每个月的兔子总数为多少？
 * 输入int型表示month
 * 输出兔子总数int型
 */
public class P0101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int month = sc.nextInt();
            System.out.println(getTotalCount(month));
        }
    }

    /**
     * 统计出兔子总数。
     * @param monthCount 第几个月
     * @return 兔子总数
     */
    public static int getTotalCount(int monthCount) {
        if (monthCount==1 || monthCount==2){
            return 1;
        }else{
            return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
        }
    }


}
