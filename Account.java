import java.util.List;
import java.util.Scanner;

public class Account {
    private String pinHash;
    private long balance;
    // this will stay empty and will be filled when transactions are made
    List<Bookings> bookings;
    AccountInfo cardInfo;
    Person ownerPerson;

    public Account(int pin, long balance, AccountInfo cardInfo, Person ownerPerson) {
        //region PIN
        if (pin > 999 && pin < 10000) {
            this.pinHash = Helpers.getSHA(String.valueOf(pin));
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

    /**
     * Validates the provided PIN against the stored PIN hash.
     * 
     * @param pin The PIN to be validated.
     * @return true if the PIN is valid, false otherwise.
     */
    public boolean validatePin(int pin) {
        return Helpers.getSHA(String.valueOf(pin)) == this.pinHash;
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
        this.balance -= amount;
        targetAccount.deposit(amount);
    }

}
