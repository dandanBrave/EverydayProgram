package dogyear.january.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/23.
 */
public class P0122 {
    public static String poker = "345678910JQKA2jokerJOKER";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            if(s.contains("joker JOKER")){
                System.out.println("joker JOKER");
            }else {
                String[] str = s.split("\\-" );
                String[] left = str[0].split(" ");
                String[] right = str[1].split(" ");
                if(left.length==4 && right.length!=4){
                    System.out.println(str[0]);
                }else if(left.length!=4 && right.length==4){
                    System.out.println(str[1]);
                }else if(left.length == right.length){
                    String larger = poker.indexOf(left[0]) > poker.indexOf(right[0]) ? str[0] : str[1];
                    System.out.println(larger);
                }else {
                    System.out.println("ERROR");
                }
            }
        }
    }
}
