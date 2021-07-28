package StringMethods;

import java.util.Calendar;
import java.util.Date;

public class subMethod {

    public static void main(String[] args) {
        String date = "2021-07-21";
        String s = date.substring(date.length() - 2);
        //System.out.println(s);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int i = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
