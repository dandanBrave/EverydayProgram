package dogyear.january.com.ldd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * Created by Administrator on 2018/1/4.
 * 字符串合并处理：
 * 1.将输入的两个字符串合并。对合并后的字符串进行排序，要求为：
 * 2.下标为奇数的字符和下标为偶数的字符分别从小到大排序。
 * 3.对排序后的字符串进行操作，如果字符为‘0’-‘9’或者‘A’-‘F’或者‘a’-‘f’，则对他们所代表的16进制数进行BIT倒序的操作，
 *    并转换为响应的大写字符。如果字符为‘4’，为0100b,则翻转后为0010b，也就是‘2’，如果字符为‘7’，为0111，则翻转后为1110b,
 *    也就是e,转换后的字符为大写‘E’。
 *
 */
public class P0104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(ProcessString(s1,s2));
        }
    }

    private static String ProcessString(String str1, String str2) {
        String s = str1 + str2;
        String order1 = "", order2 = "";
        for (int i = 0; i < s.length() ; i++) {
            if(i % 2 == 0){
                order1 += s.charAt(i);
            }else{
                order2 += s.charAt(i);
            }
        }
        char[] charOrder1 = order1.toCharArray();
        char[] charOrder2 = order2.toCharArray();
        Arrays.sort(charOrder1);
        Arrays.sort(charOrder2);

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length() ; i++) {
            if(i % 2 == 0){
                sb.append(charOrder1[i/2]);
            }
            if(i % 2 == 1){
                sb.append(charOrder2[(i-1)/2]);
            }
        }
        String result = sortString(sb.toString());
        return result;
    }

    private static String sortString(String order) {
        Map<Character,Character> map = new HashMap<>();
        map.put('0','0');  map.put('1','8');   map.put('2','4');
        map.put('3','C');  map.put('4','2');   map.put('5','A');
        map.put('6','6');  map.put('7','E');   map.put('8','1');
        map.put('9','9');  map.put('A','5');   map.put('B','D');
        map.put('C','3');  map.put('D','B');   map.put('E','7');
        map.put('F','F');  map.put('a','5');   map.put('b','D');
        map.put('c','3');  map.put('d','B');   map.put('e','7');
        map.put('f','F');
        char[] chOrder = order.toCharArray();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < order.length() ; i++) {
           if(map.containsKey(chOrder[i])){
               sb.append(map.get(chOrder[i]));
           }else{
               sb.append(chOrder[i]);
           }
        }
        return sb.toString();
    }
}
