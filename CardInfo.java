/*
 * This stores info about a card like country code IBAN and bank name
 */

import java.sql.Date;
import java.util.Locale;

public class CardInfo {
    String bankName;
    Locale countryCode;
    long IBAN;
    private Date dateCreated;
    private Date expiryDate;
    // constructor
    public CardInfo(String bankName, Locale countryCode, long IBAN, Date dateCreated, Date expiryDate) {
        this.bankName = bankName;
        this.countryCode = countryCode;
        this.IBAN = IBAN;
        this.dateCreated = dateCreated;
        this.expiryDate = expiryDate;
    }
}