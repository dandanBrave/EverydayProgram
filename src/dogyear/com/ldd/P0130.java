package dogyear.com.ldd;

import java.util.Scanner;
public class P0130{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = Integer.parseInt(sc.nextLine());
            String st = sc.nextLine();
            String[] st1 = st.split(" ");
            float avg=0;
            int cnt=0;
            int cnt1=0;

            for (int i = 0; i < num; i++) {
                int n = Integer.parseInt(st1[i]);
                if (n < 0) {
                    cnt++;
                } else if(n>0){
                    avg = avg + n;
                    cnt1++;
                }
            }
            System.out.print(cnt+" ");
            System.out.println(Math.round(avg *10/ cnt1) / 10.0);

        }
        sc.close();
    }
}