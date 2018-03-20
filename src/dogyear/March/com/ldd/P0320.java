package dogyear.March.com.ldd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P0320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap<>();
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                if(map.get(arr[i]) == 3 && ((arr[i]>='a'&&arr[i]<='z') || (arr[i]>='A'&&arr[i]<='Z'))){
                    System.out.println(arr[i]);
                    return;
                }
            }else{
                map.put(arr[i],1);
            }
        }
    }
}
