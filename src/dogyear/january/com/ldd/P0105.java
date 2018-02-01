package dogyear.january.com.ldd;

import java.util.Scanner;
/**
 * Created by Administrator on 2018/1/5.
 * 单词倒排：
 * 对字符串中的所有单词进行倒排，输入一行以空格来分割的句子，输出句子的逆序
 */
public class P0105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String string = sc.nextLine();
            String[] arrString = string.split("[^a-zA-Z]+");
            for (int i = arrString.length-1; i >= 2 ; i--) {
                System.out.print(arrString[i]+' ');
            }
            if (arrString[0].length() == 0){
                System.out.println(arrString[1]);
            }else{
                System.out.println(arrString[1] + ' ' + arrString[0]);
            }
        }
    }
}
