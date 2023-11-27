/*
 * Instances of this class will be stored in the Cards for saving the bookings
 */
import java.sql.Date;

/**
 * Represents a booking with a specific date and transaction.
 */
public class Booking {
    final Date date;
    final long transaction;

    /**
     * Constructs a new Bookings object with the given date and transaction.
     * 
     * @param date        the date of the booking
     * @param transaction the transaction amount
     */
    public Booking(Date date, long transaction) {
        this.date = date;
        this.transaction = transaction;
    }
}
