package dogyear.february.com.ldd;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/2/4.
 * 参数解析
 */
public class P0204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
          String s = sc.nextLine();
          String[] out = s.split(" ");
            System.out.println(out.length);
            for (int i = 0; i < out.length ; i++) {
                System.out.println(out[i]);
            }
        }
    }
}
