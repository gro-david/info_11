import java.sql.Date;
import java.time.LocalDate;
import java.util.Locale;

/**
 * main
 */
public class Main {
    public static void main(String[] args){
        Person person1 = new Person("John Doe", new Date(LocalDate.parse("2006-10-22")), 01701477502);
        AccountInfo accInfo1 = new AccountInfo("Sparkasse", Locale.GERMANY, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis() + 315569520000l));
        Account acc1 = new Account(6942, 5634856646l, accInfo1, person1);
        System.out.println(acc1.validatePin(6942));
        System.out.println(acc1.validatePin(6943));

        System.out.println(acc1.getBalance());
        acc1.deposit(1000);
        System.out.println(acc1.getBalance());
        
        AccountInfo accInfo2 = new AccountInfo("Sparkasse", Locale.GERMANY, accInfo1.dateCreated, accInfo1.expiryDate);
        Person person2 = new Person("John Doe", person1.dateOfBirth, person1.phoneNumber);
    }
}

