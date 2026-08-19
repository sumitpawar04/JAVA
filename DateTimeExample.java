import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

class DateTimeExample
{
    public static void main(String A[])
    {
        Date date = new Date();
        
        System.out.println("Current date is:"+ new SimpleDateFormat("dd/MM/yyyy").format(date));
        System.out.println("Current date is:"+ new SimpleDateFormat("MM-dd-yyyy").format(date));
        System.out.println("Current date is:"+ new SimpleDateFormat("EEEE MMMM dd").format(date));

        System.out.println("Current date and time is:"+ new SimpleDateFormat("EEE MMMM dd HH:mm:ss z yyyy").format(date));
        System.out.println("Current date and time is:"+ new SimpleDateFormat("dd/MM/yy hh:mm:ss a Z").format(date));

        System.out.println("Current time is:"+ new SimpleDateFormat("HH:mm:ss").format(date));

        Calendar cal = Calendar.getInstance();
        System.out.println("Current week of year is:"+ cal.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Current day of the year is:"+ cal.get(Calendar.DAY_OF_YEAR));

    }
}