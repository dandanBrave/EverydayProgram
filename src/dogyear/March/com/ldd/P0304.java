package dogyear.March.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/3/4.
 */
public class P0304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            char[] ch = line.toCharArray();
            if (isUpcase(ch) && isSame(ch)) {
                System.out.println("Likes");
            } else
                System.out.println("Dislikes");
        }
    }

    public static boolean isUpcase(char[] ch){
        for (int i = 0; i < ch.length; i++) {
            if (!Character.isUpperCase(ch[i])) {
                return false;
            }
        }
        return true;
    }
    public static boolean isSame(char[] ch){
        for (int i = 0; i < ch.length-1; i++) {
            if(ch[i]==ch[i+1]){
                return false;
            }
        }
        return true;
    }
}
