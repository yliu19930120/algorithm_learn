package utils;

public class TimeUtils {

    public static long printTimes(String msg,long start){
        long end = System.currentTimeMillis();
        msg = String.format("%s cost %s ms",msg,end-start);
        System.out.println(msg);
        return System.currentTimeMillis();
    }
}
