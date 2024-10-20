import java.util.Calendar;
import java.util.GregorianCalendar;

class TodaysDate {

    public void printDateAndTime() {
        // objeto que obtiene la fecha y hora actuales
        Calendar now = new GregorianCalendar();

        // se consiguen las componentes de la fecha
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1; //están indexado desde el 0, por lo que se debe sumar 1
        int day = now.get(Calendar.DAY_OF_MONTH);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        // agregamos el 02d para asegurarnos que el formato siempre sea de dos digitos
        System.out.println("La fecha y hora actuales son: " + year + "-"
                + String.format("%02d", month) + "-" + String.format("%02d", day) + " "
                + String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":"
                + String.format("%02d", second));
    }
}

public class TestFecha {

    public static void main(String[] args) {
        // objeto de la clase TodaysDate
        TodaysDate hoy = new TodaysDate();

        hoy.printDateAndTime();
    }
}

