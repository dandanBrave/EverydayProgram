package dogyear.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/28.
 */
public class P01282 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            System.out.println(MarkNum(s));
        }
    }

    private static String MarkNum(String s) {
        String ss = s.toLowerCase();
        StringBuffer sb = new StringBuffer();
        if(ss.charAt(0)>='0' && ss.charAt(0)<='9'){
            sb.append("*");
        }
        for (int i = 0; i < ss.length()-1 ; i++) {
            if((ss.charAt(i)>=97 && ss.charAt(i)<=122)&&(ss.charAt(i+1)>=97 && ss.charAt(i+1)<=122)){
                sb.append(s.charAt(i));
            }else if((ss.charAt(i)>=97 && ss.charAt(i)<=122)&&(ss.charAt(i+1)>='0' && ss.charAt(i+1)<='9')){
                sb.append(s.charAt(i)+"*");
            }else if((ss.charAt(i)>='0' && ss.charAt(i)<='9')&&(ss.charAt(i+1)>='0' && ss.charAt(i+1)<='9')){
                sb.append(s.charAt(i));
            }else if((ss.charAt(i)>='0' && ss.charAt(i)<='9')&&(ss.charAt(i+1)>=97 && ss.charAt(i+1)<=122)){
                sb.append(s.charAt(i)+"*");
            }
        }
        if(ss.charAt(ss.length()-1)>='0' && ss.charAt(ss.length()-1)<='9'){
            sb.append(s.charAt(ss.length()-1)+"*");
        }else{
            sb.append(s.charAt(ss.length()-1));
        }
        return sb.toString();
    }
}
