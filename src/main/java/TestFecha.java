import java.util.Calendar;
import java.util.GregorianCalendar;


class TodaysDate {
    // Atributos
    String time;
    public int day;
    private int month;
    protected int year;

    // Metodo que imprime la fecha y hora actuales
    public void printDateAndTime() {
        GregorianCalendar calendar = new GregorianCalendar();
        time = calendar.get(Calendar.HOUR_OF_DAY) + ":"
                + calendar.get(Calendar.MINUTE) + ":"
                + calendar.get(Calendar.SECOND);
        day = calendar.get(Calendar.DATE);
        month = calendar.get(Calendar.MONTH) + 1; // Los meses inician en 0, por eso se suma 1
        year = calendar.get(Calendar.YEAR);

        System.out.println("Time: " + time);
        System.out.println("Date: " + day + " " + month + " " + year);
    }
}

public class TestFecha {
    public static void main(String[] args) {
        // Crear un objeto de tipo TodaysDate
        TodaysDate hoy = new TodaysDate();

        // Llamar al metodo para imprimir la fecha y hora actual
        hoy.printDateAndTime();
    }
}
