package dogyear.March.com.ldd;

import java.util.Scanner;

public class P0326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String [] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            if(dicSort(arr)&&lenSort(arr)){
                System.out.println("both");
            }else if(dicSort(arr)){
                System.out.println("lexicographically");
            }else if(lenSort(arr)){
                System.out.println("lengths");
            }else{
                System.out.println("none");
            }
        }
    }

    //字符串长度排序
    private static boolean lenSort(String[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i].length() >= arr[i+1].length()){
                return false;
            }
        }
        return true;
    }

    //字典序排序
    private static boolean dicSort(String[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i].compareTo(arr[i+1]) >= 0){
                return false;
            }
        }
        return true;
    }
}
