import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        //Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
        OffsetDateTime date2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        //verificare che la prima data è precedente alla seconda
        String dateFormat = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String date2Format = date2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Is " + dateFormat + " before " + date2Format + " ?: " + date.isBefore(date2));

        //verificare che la seconda data è successiva alla prima
        System.out.println("Is " + date2Format + " after " + dateFormat + " ?: " + date2.isAfter(date));

        //verificare che le due date sono uguali ad ora
        OffsetDateTime dateNow = OffsetDateTime.now();
        String dateNowFormat = dateNow.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Today is : " + dateNowFormat);
        System.out.println("Is the same date that " + dateFormat +"?:");
        System.out.println(date.equals(dateNow));
        System.out.println("Is the same date that " + date2Format + "?:");
        System.out.println(date2.equals(dateNow));

    }
}