package dogyear.com.ldd;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Administrator on 2018/1/27.
 */
public class P0127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            //统计候选人
            int candidate = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            String[] array = str.split(" ");
            LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < array.length ; i++) {
                map.put(array[i],0);
            }
            map.put("Invalid",0);
            //投票统计
            int vote = sc.nextInt();
            sc.nextLine();
            String str2 = sc.nextLine();
            String[] str2Arr = str2.split(" ");
            for (String s : str2Arr) {
                if(map.containsKey(s)){
                    map.put(s,map.get(s)+1);
                }else{
                    map.put("Invalid",map.get("Invalid")+1);
                }
            }
            Set<String> set = map.keySet();
            for (String s : set) {
                System.out.println(s+" : "+map.get(s));
            }
        }
    }
}
