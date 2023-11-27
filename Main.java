import java.sql.Date;
import java.util.Locale;

/**
 * main
 */
public class Main {
    public static void main(String[] args){
        Person person1 = new Person("John Doe", new Date(20061022), 01701477502);
        AccountInfo accInfo1 = new AccountInfo("Sparkasse", Locale.GERMANY, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis() + 315569520000l));
        Account acc1 = new Account(6942, 5634856646l, accInfo1, person1);
        System.out.println(acc1.validatePin(6942));
        System.out.println(acc1.validatePin(6943));
    }
}

