package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            StringBuffer sb = new StringBuffer();
            String result = "";
            for (int i = 0; i < s.length() ; i++) {
                if(arr[i]>='0' && arr[i]<='9'){
                    sb.append(arr[i]);
                }else{
                    sb.setLength(0);
                }
                if(sb.length() > result.length()){
                    result = sb.toString();
                }
            }
            System.out.println(result);
        }
    }
}
