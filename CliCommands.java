import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class CliCommands {
    private static Scanner scanner = new Scanner(System.in);
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");


    public static void help(){
        System.out.println("Available commands:");
        System.out.println("create-account: Create Account");
        System.out.println("deposit: Deposit");
        System.out.println("withdraw: Withdraw");
        System.out.println("transfer: Transfer");
        System.out.println("close-account: Close Account");
        System.out.println("exit: Exit");
    }
    public static void createAccount() throws ParseException{
        System.out.print("create-account > Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("create-account > Enter your date of birth (yyyy.MM.dd): ");
        String dateOfBirthStr = scanner.nextLine();
        Date dateOfBirth = sdf.parse(dateOfBirthStr);
        
        System.out.print("create-account > Enter your phone number: ");
        long phoneNumber = scanner.nextLong();
        
        System.out.print("create-account > Enter your PIN: ");
        int pin = scanner.nextInt();
        
        System.out.print("create-account > Enter your country: ");
        String country = scanner.nextLine();
        Locale locale = new Locale(country);
        
        System.out.print("create-account > Enter your bank: ");
        String bank = scanner.nextLine();

        Person person = new Person(name, dateOfBirth, phoneNumber);
        AccountInfo accountInfo = new AccountInfo(bank, locale, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis() + 315569520000l));
        Account account = new Account(pin, 0, accountInfo, person);

        if (Bank.getAccounts().contains(account)){
            System.out.println("create-account > Account already exists!");
            return;
        }
        if (!Bank.getPersons().contains(person)){
            Bank.setPersons(person);
        }
        Bank.setAccounts(account);
        System.out.println("create-account > Account created!");

        System.out.println(Bank.getAccounts());
    }
}
