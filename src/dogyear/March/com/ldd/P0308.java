package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int y = n / 8;
            int x = 0,result=0;
            if(n % 8 == 0){
                result = n / 8;
            }else{
                for (int i = y; i >= 0 ; i--) {
                    if((n-i*8)%6==0){
                        x = (n-i*8) / 6;
                        result = x + i;
                        break;
                    }
                }
            }
            if(result > 0){
                System.out.println(result);
            }else{
                System.out.println(-1);
            }
        }
    }
}
