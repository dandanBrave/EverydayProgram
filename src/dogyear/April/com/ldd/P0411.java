package dogyear.April.com.ldd;

import java.util.Scanner;

public class P0411 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            long num=sc.nextInt();
            long sum=0;
            for(long i=num;i>0;i=i/2){
                long temp=(i+1)/2;
                sum+=temp*temp;
            }
            System.out.println(sum);
        }
    }
}
