package bank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Cli {
    
    private static Scanner scanner = new Scanner(System.in);

    public void start(){
        setup();
        while (true){
            loop();
        }
    }

    public static void setup(){
        System.out.println("Welcome to the Bank of Java");
        System.out.println("What would you like to do?");
        System.out.println("create-account: Create Account");
        System.out.println("deposit: Deposit");
        System.out.println("withdraw: Withdraw");
        System.out.println("transfer: Transfer");
        System.out.println("close-account: Close Account");
        System.out.println("exit: Exit");
    }
    
    public static void loop() throws ParseException{
        System.out.print(" > ");
        String input = scanner.nextLine();
        switch (input) {
            case "create-account":
                CliCommands.createAccount();
                break;
            case "deposit":
                System.out.println("deposit");
                break;
            case "withdraw":
                System.out.println("withdraw");
                break;
            case "transfer":
                System.out.println("transfer");
                break;
            case "close-account":
                System.out.println("close-account");
                break;
            case "exit":
                scanner.close();
                System.exit(0);
                break;
            case "help":
                CliCommands.help();
                break;
            default:
                System.out.println("Invalid command! Use help to see available commands.");
                break;
        }
    }


}
