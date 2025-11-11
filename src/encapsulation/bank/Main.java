package encapsulation.bank;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        // Q1 : creating an account object with an initial balance
        BankAccount account = new BankAccount("Charles", BigDecimal.TEN, HasOverdraft.NO);
        System.out.println(account);
        System.out.println();

        // Q2: withdrawing 9$ from the account object
        System.out.println(account.withdrawMoney(new BigDecimal("9.0")));
        System.out.println("Account balance: " + account.getBalance());
        System.out.println();

        // Q3: withdrawing 1$ from the account object
        System.out.println(account.withdrawMoney(new BigDecimal("1.0")));
        System.out.println("Account balance: " + account.getBalance());
        System.out.println();

        // Q4: attempting to withdraw 100$ with account balance being 0$
        System.out.println(account);
        System.out.println(account.withdrawMoney(new BigDecimal("100.0")));
        System.out.println("Account balance: " + account.getBalance());
        System.out.println();

        // The state variables are encapsulated within the object (they are hidden - no direct access)
        account.setBalance(new BigDecimal("100"));
        System.out.println("Account balance: " + account.getBalance());
        System.out.println(account);
    }
}
