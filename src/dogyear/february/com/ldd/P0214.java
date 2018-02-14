package dogyear.february.com.ldd;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/2/14.
 */
public class P0214 {
    public static void main(String[] args) {
        int numbers[] = new int[]{2,3,1,0,2,5,3};
        System.out.println(duplicate(numbers));
    }
    public static int duplicate(int numbers[]) {
        Map<Integer,Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(map.get(numbers[i]) == null){
                map.put(numbers[i],1);
            }else {
                result = numbers[i];
                break;
            }
        }
        return result;
    }
}
