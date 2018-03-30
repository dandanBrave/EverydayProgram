package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int maxY = Integer.MIN_VALUE;
            for (int i = 0; i < n ; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                minX = (int)Math.min(x,minX);
                minY = (int)Math.min(y,minY);
                maxX = (int)Math.max(x,maxX);
                maxY = (int)Math.max(y,maxY);
            }
            int side = Math.max((maxX-minX),(maxY-minY));
            System.out.println(side*side);
        }
    }
}
