
package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Result {
    public static int count=0;
    public static int count1=0;
    public static int count2=0;
    public static int count3=0;
    public static int count4=0;
    public static int rs=0;
    static DateTimeFormatter  dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    static LocalDateTime now = LocalDateTime.now();  
   
    public static String d=dtf.format(now);

    public Result(int a_id, String a_date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
