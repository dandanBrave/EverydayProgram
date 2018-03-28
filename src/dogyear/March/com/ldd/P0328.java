package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(calcDistance(a,b,c,d));
    }
    public static int calcDistance(int A, int B, int C, int D) {
        return (int)(distance(A) + distance(B) + distance(C) + distance(D));

    }

    private static double distance(double n) {
        if(n == 0){
            return 0;
        }
        return (n+n/2+distance(n/2));
    }
}
