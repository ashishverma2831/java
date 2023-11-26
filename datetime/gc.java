package datetime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class gc {
    public static void main(String[] args) {
        // Calendar c = new Calendar() {
            
        // };

        GregorianCalendar gc = new GregorianCalendar();
        // System.out.println(gc.getTimeZone());
        System.out.println(gc.get(Calendar.DATE));

        TimeZone tz = gc.getTimeZone();
        // System.out.println(tz.getTimeZone(TimeZone.getTimeZone("timezonelikhoge")));
        System.out.println(tz);
    }
}
