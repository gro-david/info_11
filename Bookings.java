/*
 * Instances of this class will be stored in the Cards for saving the bookings
 */
import java.sql.Date;

public class Bookings {
    Date date;
    long transaction;
    public Bookings(Date date, long transaction) {
        this.date = date;
        this.transaction = transaction;
    }
}
