package dogyear.february.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/2/28.
 * 藏宝图
 */
public class P0228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String t = sc.nextLine();
            Boolean flag = true;
            for (int i = 0; i < t.length() ; i++) {
                int pos = s.indexOf(t.charAt(i));
                if(pos != -1){
                    s = s.substring(pos+1);
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

}
