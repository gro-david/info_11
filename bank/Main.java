package bank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * main
 */
public class Main {
    public static void main(String[] args) throws ParseException{
        Cli cli  = new Cli();
        cli.start();
        
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

        
        // Person person1 = new Person("John Doe", sdf.parse("2006.10.22"), 01701477502l);
        // AccountInfo accInfo1 = new AccountInfo("Sparkasse", Locale.GERMANY, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis() + 315569520000l));
        // Account acc1 = new Account(6942, 0, accInfo1, person1);

        // System.out.println(acc1.getBalance());
        // acc1.deposit(1000);
        // System.out.println(acc1.getBalance());
        
        // //AccountInfo accInfo2 = new AccountInfo("Sparkasse", Locale.GERMANY, accInfo1.dateCreated, accInfo1.expiryDate);
        // //Person person2 = new Person("John Doe", person1.dateOfBirth, person1.phoneNumber);

        // //System.out.println(acc1.closeAccount(accInfo2, person2));
        
    }
}

