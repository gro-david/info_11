import java.util.List;
import java.util.Scanner;

public class Account {
    private int pinHash;
    private long balance;
    // this will stay empty and will be filled when transactions are made
    List<Booking> bookings;
    AccountInfo accountInfo;
    Person ownerPerson;

    public Account(int pin, long balance, AccountInfo cardInfo, Person ownerPerson) {
        //region PIN
        if (pin > 999 && pin < 10000) {
            this.pinHash = String.valueOf(pin).hashCode();
        } else {
            System.err.println("Invalid PIN Code");
        }
        //endregion
        //region Balance
        this.balance = balance;
        //endregion
        //region CardInfo
        this.accountInfo = cardInfo;
        //endregion
        //region OwnerPerson
        this.ownerPerson = ownerPerson;
        //endregion
        this.bookings = new java.util.ArrayList<>();
    }

    /**
     * Validates the provided PIN against the stored PIN hash.
     * 
     * @param pin The PIN to be validated.
     * @return true if the PIN is valid, false otherwise.
     */
    public boolean validatePin(int pin) {
        return String.valueOf(pin).hashCode() == this.pinHash;
    }
    /**
     * Authenticates the user by requesting a PIN and validating it.
     * 
     * @return true if the PIN is valid, false otherwise.
     */
    public boolean authenticate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your PIN: ");
        int pin = scanner.nextInt();
        scanner.close();
        return validatePin(pin);
    }
    /**
     * Deposits the specified amount into the account.
     *
     * @param amount the amount to be deposited
     */
    public void deposit(long amount) {
        this.balance += amount;
        bookings.add(new Booking(new java.util.Date(System.currentTimeMillis()), amount));
    }
    /**
     * Withdraws the specified amount from the account balance.
     * 
     * @param amount the amount to be withdrawn
     */
    public void withdraw(long amount) {
        if (!authenticate() || amount > this.balance) {
            System.err.println("Invalid PIN");
            return;
        }
        this.balance -= amount;
        bookings.add(new Booking(new java.sql.Date(System.currentTimeMillis()), -amount));
    }
    /**
     * Transfers a specified amount from this account to the target account.
     * 
     * @param amount The amount to transfer.
     * @param targetAccount The target account to transfer the amount to.
     */
    public void transfer(long amount, Account targetAccount) {
        if (!authenticate() || amount > this.balance) {
            System.err.println("Invalid PIN");
            return;
        }
        this.withdraw(amount);
        targetAccount.deposit(amount);
    }
    /**
     * Returns the balance of the account.
     * 
     * @return the balance of the account
     */
    public long getBalance() {
        return this.balance;
    }

    public boolean closeAccount(AccountInfo _accountInfo, Person _ownerPerson) {
        if (!authenticate()) {
            System.err.println("Invalid PIN");
            return false;
        }
        if (!this.accountInfo.is(_accountInfo)) {
            System.err.println("Invalid AccountInfo");
            return false;
        }
        if (!this.ownerPerson.is(_ownerPerson)) {
            System.err.println("Invalid OwnerPerson");
            return false;
        }
        this.withdraw(this.balance);
        return true;
    }
}
