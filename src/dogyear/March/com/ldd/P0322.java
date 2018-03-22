package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            double n = sc.nextDouble();
            int m = sc.nextInt();
            double sum = n;
            for (int i = 1; i < m; i++) {
                 n = Math.sqrt(n);
                sum += n;
            }
            System.out.printf("%.2f",sum);
        }
    }
}
