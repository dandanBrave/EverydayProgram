package dogyear.january.com.ldd;

import java.util.*;

/**
 * Created by Administrator on 2018/1/1.
 * 首先，选择一个单词作为密匙，如TRAILBLAZERS。如果单词中包含有重复的字母，只保留第1个，其余几个丢弃。
 * 现在，修改过的那个单词属于字母表的下面，如下所示：
 * A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
 * T R A I L B Z E S C D F G H J K M N O P Q U V W X Y
 * 上面其他用字母表中剩余的字母填充完整。在对信息进行加密时，信息中的每个字母被固定于顶上那行，
 * 并用下面那行的对应字母一一取代原文的字母(字母字符的大小写状态应该保留)。因此，使用这个密匙，
 * Attack AT DAWN(黎明时攻击)就会被加密为Tpptad TP ITVH。
 */
public class P01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String key = sc.nextLine().toLowerCase();
            String string = sc.nextLine();

            char[] cKey = key.toCharArray();
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < key.length() ; i++) {
                if(sb.toString().indexOf(cKey[i]) == -1){
                    sb.append(cKey[i]);
                }
            }
            for (int i = 0; i < 26 ; i++) {
                if(sb.toString().indexOf(i+'a') == -1){
                    sb.append((char)(i + 'a'));
                }
            }
            char[] temp = string.toCharArray();
            StringBuffer result = new StringBuffer();
            for (int i = 0; i < string.length(); i++) {
                if(temp[i]>='A' && temp[i]<='Z'){
                    result.append(String.valueOf(sb.charAt(temp[i]-'a')).toUpperCase());
                }else{
                    result.append(String.valueOf(sb.charAt(temp[i]-'a')).toLowerCase());
                }
            }
            System.out.println(result.toString());
        }
    }
}
