package dogyear.March.com.ldd;


import java.util.Scanner;

public class P0310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String a = sc.nextLine();
            String b = sc.nextLine();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < a.length() ; i++) {
                if(!b.contains(a.charAt(i)+"")){
                    sb.append(a.charAt(i));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
