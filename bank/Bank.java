package bank;
import java.util.ArrayList;

public class Bank {
    private static ArrayList<Account> accounts = new ArrayList<Account>();
    private static ArrayList<Person> persons = new ArrayList<Person>();
    public static ArrayList<Person> getPersons() {
        return persons;
    }
    public static void setPersons(Person person) {
        persons.add(person);
    }
    public static ArrayList<Account> getAccounts() {
        return accounts;
    }
    public static void setAccounts(Account account) {
        accounts.add(account);
    }
}
