package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(countBitDiff(m,n));
    }

    public static int countBitDiff(int m, int n) {
        String str = Integer.toBinaryString(m ^ n);
        str = str.replaceAll("0", "");
        return str.length();
    }
}
