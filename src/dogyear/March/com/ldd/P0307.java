package dogyear.March.com.ldd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P0307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            String result = arr[0];
            Map<String,Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length ; i++) {
                if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1);
                }else{
                    map.put(arr[i],1);
                }
            }
            for (int i = 0; i < arr.length ; i++) {
                if(map.get(arr[i]) >= (arr.length/2)){
                    result = arr[i];
                }
            }
            System.out.println(result);
        }
    }
}
