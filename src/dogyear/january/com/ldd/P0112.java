package dogyear.january.com.ldd;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/12.
 */
public class P0112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();
            List<String> list = new LinkedList<>();
            for (int i = 0; i < N; i++) {
                list.add(sc.next());
            }
            for (int i = 0; i < N ; i++) {
                System.out.println(BeautyDegree(list.get(i)));
            }
        }
    }

    private static int BeautyDegree(String s) {
        String igS = s.toLowerCase();
        int[] character = new int[26];
        for (int i = 0; i < igS.length() ; i++) {
           int index =  igS.charAt(i)-'a';
           character[index]++;
        }
        Arrays.sort(character);
        int sum = 0;
        for (int i = 25, j = 26; i >= 0 ; i--) {
            sum += character[i] * j;
            j--;
            if(character[i] == 0)
                break;
        }
        return sum;
    }
}
