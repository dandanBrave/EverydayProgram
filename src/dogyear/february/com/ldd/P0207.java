package dogyear.february.com.ldd;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/2/7.
 */
public class P0207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            System.out.println( iConverDateToDay(year,month,day));
        }
    }

    private static int iConverDateToDay(int year, int month, int day) {
        if(year<=0 || month<=0 || month>13 || day<=0 || day>31){
            return -1;
        }
        Calendar c = Calendar.getInstance();
        c.set(year,month-1,day);
        SimpleDateFormat sdf = new SimpleDateFormat("D");
        return Integer.valueOf(sdf.format(c.getTime()));
    }
}




































