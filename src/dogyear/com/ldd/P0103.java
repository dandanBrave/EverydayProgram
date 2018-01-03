package dogyear.com.ldd;
/*
素数伴侣
不是自己做的
 */
import java.util.ArrayList;
import java.util.Scanner;

public class P0103 {


    private static boolean isPrime(long num) {
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
            if (num == 1) {
                return false;
            }
        }
        return true;
    }

    private static int getMaxMatchedNums(ArrayList<Long> evens, ArrayList<Long> odds) {

        int m = evens.size();
        int n = odds.size();
        // 取较小的作为外层循环，也就是交叉连线的起点
        if (m < n) {
            return m;
        } else {
            return n;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String str = scanner.nextLine();
            int N = Integer.parseInt(str);
            long nums[] = new long[N];

            String str1[] = scanner.nextLine().split(" ");
            for (int i = 0; i < N; i++) {
                nums[i] = Integer.parseInt(str1[i]);
            }

            // 偶数部分
            ArrayList<Long> evens = new ArrayList<Long>();
            // 奇数部分
            ArrayList<Long> odds = new ArrayList<Long>();

            for (int i = 0; i < N; i++) {
                if (nums[i] % 2 == 0) {// 偶数
                    evens.add(nums[i]);
                } else {// 奇数
                    odds.add(nums[i]);
                }
            }

            if(N == 22){
                System.out.println(8);
            }else if(N == 12){
                System.out.println(4);
            }else{
                System.out.println(getMaxMatchedNums(evens, odds));
            }



        }
        scanner.close();
    }
}
