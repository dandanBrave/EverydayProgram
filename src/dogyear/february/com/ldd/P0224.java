package dogyear.february.com.ldd;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Administrator on 2018/2/24.
 * 下厨房
 */
public class P0224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new  HashSet<>();
        while (sc.hasNext()){
            String s = sc.nextLine();
            String arr[] = s.split(" ");
            for (int i = 0; i < arr.length ; i++) {
                set.add(arr[i]);
            }
        }
        System.out.println(set.size());
        sc.close();
    }
}
