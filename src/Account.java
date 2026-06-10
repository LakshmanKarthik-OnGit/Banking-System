public class Account {

    final private int accountNumber;
    final private String holderName;
    private double balance;


    public Account(int accountNumber, String holderName, double balance) throws InvalidAmountException{

        if(balance < 0) {
            throw new InvalidAmountException(
                    "Amount cannot be negative"
            );
        }

        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;

        System.out.println("Account Created Successfully.");
    }

    public void deposit(double amount) throws InvalidAmountException{

        if(amount <= 0){
            throw new InvalidAmountException("Amount cannot be negative or zero.\n" +
                    "Please enter a valid amount"
            );
        }

        balance += amount;

    }

    public void withdraw(double amount) throws InsufficientBalanceException,InvalidAmountException{

        if(amount <= 0){
            throw new InvalidAmountException(
                    "Amount cannot be negative or zero.\n" +
                    "Please enter a valid amount"
            );
        }

        if(amount > balance){
            throw new InsufficientBalanceException(
                    "Requested withdrawal amount is " +
                    "higher than balance in your account."
            );
        }

        balance -= amount;

    }

    @Override
    public String toString(){
        return "Account Number: "+accountNumber+
                "\nAccount Holder: "+holderName+
                "\nBalance: "+balance;
    }
}
