import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodaysDate {
    public void printDateAndTime() {
        Calendar now = new GregorianCalendar();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println("Hora: " + String.format("%02d", hour) + ":"
                + String.format("%02d", minute) + ":" + String.format("%02d", second));
        System.out.println("Fecha: " + String.format("%02d", day) + "-"
                + String.format("%02d", month) + "-" + year);
    }
}
