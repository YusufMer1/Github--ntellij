import java.util.Date;
import java.util.Calendar;

public class TextClass {
    public static void main(String[] args){
        Date now = new Date();
        Homework hw1 = new Homework("SENG 211 - OOP","Prepare a slide Array vs ArrayList and Date class",now);
        hw1.prininfo();

        Calendar cal = Calendar.getInstance();
        cal.set(2025,Calendar.DECEMBER,10,23,59);
        Date deadline = cal.getTime();

    }

}
