/*
 * This stores info about a card like country code IBAN and bank name
 */

import java.sql.Date;
import java.util.Locale;

/**
 * Represents the account information of a bank account.
 */
public class AccountInfo {
    
    final String bankName;
    final Locale countryCode;
    final long IBAN;
    private final Date dateCreated;
    private Date expiryDate;
    
    /**
     * Constructs an AccountInfo object with the specified bank name, country code, date created, and expiry date.
     * 
     * @param bankName     the name of the bank
     * @param countryCode  the country code of the bank
     * @param dateCreated  the date when the account was created
     * @param expiryDate   the date when the account will expire
     */
    public AccountInfo(String bankName, Locale countryCode, Date dateCreated, Date expiryDate) {
        this.bankName = bankName;
        this.countryCode = countryCode;
        this.IBAN = (long) (Math.random() * 10000000000000000L);
        this.dateCreated = dateCreated;
        this.expiryDate = expiryDate;
    }
    public boolean is(AccountInfo _accountInfo){
        return this.bankName.equals(_accountInfo.bankName) && this.countryCode.equals(_accountInfo.countryCode) && this.IBAN == _accountInfo.IBAN && this.dateCreated.equals(_accountInfo.dateCreated) && this.expiryDate.equals(_accountInfo.expiryDate);
    }
}