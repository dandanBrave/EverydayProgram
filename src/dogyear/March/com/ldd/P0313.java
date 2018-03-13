package dogyear.March.com.ldd;

import java.util.Arrays;
import java.util.Scanner;

public class P0313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            int[] arrI = new int[arr.length-1];
            for (int i = 0; i < arr.length-1 ; i++) {
                arrI[i] = Integer.parseInt(arr[i]);
            }
            Arrays.sort(arrI);
            for (int i = 0; i < (Integer.parseInt(arr[arr.length-1])-1) ; i++) {
                System.out.print(arrI[i]+" ");
            }
            System.out.println(arrI[Integer.parseInt(arr[arr.length-1])-1]);
        }
    }

}
