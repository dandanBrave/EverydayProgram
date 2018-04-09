package dogyear.April.com.ldd;

import java.util.Scanner;

public class P0409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int one = sc.nextInt();
            int two = sc.nextInt();
            int three = sc.nextInt();
            int four = sc.nextInt();
            int A = (one + three)/2;
            int B = (two + four)/2;
            int C = B -two;
            if((one+three)%2==0 && (two+four)%2==0 && A+B==three){
                System.out.println(A+" "+B+" "+C);
            }else{
                System.out.println("No");
            }
        }
    }
}
