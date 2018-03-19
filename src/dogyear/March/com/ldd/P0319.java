package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0319 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String sa = s.replaceAll(" ","");
            for (int i = 0; i < sa.length(); i++) {
                if (i == 6 || i == 14 || i == 18) {
                    System.out.print(" ");
                }
                System.out.print(sa.charAt(i));
            }
            System.out.println();
        }
    }
}
