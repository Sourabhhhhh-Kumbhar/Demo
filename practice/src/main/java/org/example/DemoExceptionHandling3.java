package org.example;


class ATM {

    private double balance = 5000;

    public void withdraw(double amount) {

        try {
            // Check invalid withdrawal
            if (amount <= 0) {
                throw new IllegalArgumentException(
                        "Amount must be positive!"
                );
            }

            // Check insufficient balance
            if (amount > balance) {
                throw new RuntimeException(
                        "Insufficient balance!"
                );
            }

            balance -= amount;

            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);

        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        finally {
            // Always executes
            System.out.println("ATM session completed.");
        }
    }
}


public class DemoExceptionHandling3 {

    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.withdraw(2000);

        System.out.println("---------------");

        atm.withdraw(10000);

        System.out.println("---------------");

        atm.withdraw(-500);
    }
}

