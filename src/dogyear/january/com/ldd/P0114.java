package dogyear.january.com.ldd;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/14.
 * 输出单向链表中倒数第K个结点
 */
public class P0114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            int index = sc.nextInt();
            if(index != 0){
                System.out.println(list.get(n-index));
            }else{
                System.out.println(0);  //第一次做题未考虑当index为0时候的情况
            }
        }
    }
}
