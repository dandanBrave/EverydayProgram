package dogyear.com.ldd;

import java.util.*;

/**
 * Created by Administrator on 2018/1/2.
 * 查找兄弟单词：
 * 输入：先输入字典中单词的个数，再输入n个单词作为字典单词。输入一个单词，
 * 查找其在字典中兄弟单词的个数，再输入数字n
 * 输出：根据输入，输出查找到的兄弟单词的个数
 */
public class P0102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            String[] words = new String[num];
            for (int i = 0; i < num ; i++) {
                words[i] = sc.next();
            }
            String word = sc.next();
            int index = sc.nextInt();

            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            int length = word.length();

            List<String> list = new ArrayList<>();
            int count = 0;
            for (int i = 0; i < num ; i++) {
                if(words[i].length() == length && !words[i].equals(word)){
                    char[] wordsArr = words[i].toCharArray();
                    Arrays.sort(wordsArr);
                    if(Arrays.equals(wordsArr,wordArr)){
                        count++;
                        list.add(words[i]);
                    }
                }
            }
            System.out.println(count);
            Collections.sort(list);
            if(count >= index){
                System.out.println(list.get(index-1));
            }
        }
    }
}
