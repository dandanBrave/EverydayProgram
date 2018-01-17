package dogyear.com.ldd;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2018/1/17.
 */
public class P0117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(sevenAbout(n));
        }
    }

    private static int sevenAbout(int n) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            if((i%7==0) || (i+"").contains("7")){
                set.add(i);
            }
        }
        return set.size();
    }
}
