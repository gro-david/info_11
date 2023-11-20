import java.util.List;

public class Cards {
    private int pinHash;
    private long balance;
    // this will stay empty and will be filled when transactions are made
    List<Bookings> bookings;
    CardInfo cardInfo;
    Person ownerPerson;

    public Cards(int pin, long balance, CardInfo cardInfo, Person ownerPerson) {
        //region PIN
        if (pin > 999 && pin < 10000) {
            this.pinHash = String.valueOf(pin).hashCode();
        } else {
            System.err.println("Invalid PIN number");
        }
        //endregion
        //region Balance
        this.balance = balance;
        //endregion
        //region CardInfo
        this.cardInfo = cardInfo;
        //endregion
        //region OwnerPerson
        this.ownerPerson = ownerPerson;
        //endregion
    }

    /*
     * Validate the PIN by comparing the inputted PIN to the stored PIN hash
     */
    public boolean validatePin(int pin) {
        return String.valueOf(pin).hashCode() == this.pinHash;
    }
}
