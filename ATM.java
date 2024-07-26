package atm;
import java.util.Scanner;

public class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            handleChoice(choice);
        }
    }

    private void showMenu() {
        System.out.println("Welcome to the ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Please choose an option: ");
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1:
                account.checkBalance();
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;
            case 3:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}



