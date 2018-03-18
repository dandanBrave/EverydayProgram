package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int pos = s.lastIndexOf('.');
        if(pos==-1 || s.charAt(pos+1)=='/'){
            System.out.println("null");
        }else{
            System.out.println(s.substring(pos+1));
        }
    }
}
