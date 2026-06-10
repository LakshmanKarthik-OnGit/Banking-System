import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account = null;

        while (account == null) {

            try {
                System.out.println("=== Create Your Account ===");

                System.out.print("Enter Account Number: ");
                int accountNumber = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Account Holder Name: ");
                String holderName = sc.nextLine();

                System.out.print("Enter Initial Balance: ");
                double balance = sc.nextDouble();

                account = new Account(
                        accountNumber,
                        holderName,
                        balance
                );

            } catch (InvalidAmountException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (Exception e) {
                System.out.println("Invalid Input.");
                sc.nextLine();

            }
        }

        while (true) {

            System.out.println("\n=== BANK MENU ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Details");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    try {

                        System.out.print("Enter amount to deposit: ");
                        double amount = sc.nextDouble();
                        account.deposit(amount);

                    } catch (InvalidAmountException e) {
                        System.out.println("Error: " + e.getMessage());

                    } finally {
                        System.out.println("Deposit transaction completed.");
                    }
                    break;

                case 2:
                    try {

                        System.out.print("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();
                        account.withdraw(amount);

                    } catch (InvalidAmountException |
                             InsufficientBalanceException e) {
                        System.out.println("Error: " + e.getMessage());

                    } finally {
                        System.out.println("Withdrawal transaction completed.");
                    }
                    break;

                case 3:
                    System.out.println(account);
                    break;

                case 4:
                    System.out.println("Thank you for using our banking system.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}