package Module4.extra;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super("Balance cannot go below 500");
    }
}

class BankAccount {
    private double balance = 1000.0;

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance - amount < 500.0) {
            throw new InsufficientBalanceException();
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(400); // Works (balance becomes 600)
            account.withdraw(200); // Fails (would go below 500)
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}