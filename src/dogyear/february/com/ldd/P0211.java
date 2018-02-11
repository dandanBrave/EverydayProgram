package dogyear.february.com.ldd;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2018/2/11.
 */
public class P0211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            Set<Integer> set = new TreeSet<>();
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i]=sc.nextInt();
                set.add(arr1[i]);
            }
            int m = sc.nextInt();
            int[] arr2 = new int[m];
            for (int i = 0; i < m; i++) {
                arr2[i]=sc.nextInt();
                set.add(arr2[i]);
            }
            for (Integer a:set) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
