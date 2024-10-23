import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestFecha {
    public static void main(String[] args) {
        TodaysDate hoy = new TodaysDate();
        hoy.printDateAndTime();
    }
}

class TodaysDate {
    // Variable que guarda el tiempo
    private String time;

    // Constructor que inicializa la fecha y hora actuales
    public TodaysDate() {
        setCurrentTime();
    }

    // Método privado que establece la fecha y hora actuales en el atributo time
    private void setCurrentTime() {
        Calendar now = new GregorianCalendar();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        // Se formatea la fecha y hora en la variable time
        this.time = String.format("%04d-%02d-%02d %02d:%02d:%02d", year, month, day, hour, minute, second);
    }

    // Método que imprime la fecha y hora actuales
    public void printDateAndTime() {
        System.out.println("La fecha y hora actuales son: " + this.time);
    }
}
