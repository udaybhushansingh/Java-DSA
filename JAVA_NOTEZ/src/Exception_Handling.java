//Exception Handling — Question
//Write a Java program for a Bank Withdrawal System.
//Create a BankAccount class with:
//- balance
//- withdraw(int amount)
//Rules:
//- If withdrawal amount is greater than balance → throw an InsufficientBalanceException
//- If withdrawal amount is 0 or negative → throw an IllegalArgumentException
//- Otherwise, withdraw successfully.
//In main():
//1. Create an account with balance 5000.
//2. Try withdrawing 3000.
//3. Try withdrawing 3000 again.
//4. Handle the exceptions using try-catch.
//5. Use finally to print:
//Transaction completed.
//
//Bonus: Create InsufficientBalanceException as your own custom exception using extends Exception.


public class Exception_Handling {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        try {
            account.Withdraw(3000);
            account.Withdraw(3000);
        } catch (InsufficientBalanceException e) {
            System.out.println("InsufficientBalanceException");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }
    }



    static class InsufficientBalanceException extends Exception {

        InsufficientBalanceException(String message) {
            super(message);
        }
    }
    static class BankAccount {
        int Balance;

        BankAccount(int Balance) {
            this.Balance = Balance;
        }

        void Withdraw(int Amount) throws  InsufficientBalanceException{
            if (Amount < 0 ){
                throw new IllegalArgumentException("\"Amount must be greater than 0\"");
            }


            if (Amount > Balance) {
                throw new InsufficientBalanceException("Insufficient balance");
            }
            else {
                Balance -= Amount ;
                System.out.println("Withdrawn successfully ");
                System.out.println("Reamining Amount" +Amount);

            }

        }

    }
}