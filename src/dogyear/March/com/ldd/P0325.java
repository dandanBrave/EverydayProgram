package dogyear.March.com.ldd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P0325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(findFirstRepeat(s,s.length()));
    }

    public static char findFirstRepeat(String A, int n) {
        char[] arr = A.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        char c = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(map.containsKey(arr[i])){
                c = arr[i];
                break;
            }else{
                map.put(arr[i],1);
            }
        }
        return c;
    }
}
