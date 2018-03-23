package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0323 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            for (int i = arr.length-1; i > 0; i--) {
                System.out.print(arr[i]+" ");
            }
            System.out.println(arr[0]);
        }
    }
}
