package Encapsulation;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("Charles", BigDecimal.TEN, false);

        // Amount withdrawn
        System.out.println(account.withdrawMoney(new BigDecimal("9.0")));
        System.out.println("Account balance: " + account.getBalance());
        System.out.println();

        // Amount withdrawn
        System.out.println(account.withdrawMoney(new BigDecimal("1.0")));
        System.out.println("Account balance: " + account.getBalance());
        System.out.println();

        // Amount not available for withdraw
        System.out.println(account.withdrawMoney(new BigDecimal("100.0")));
        System.out.println("Account balance: " + account.getBalance());
        System.out.println();

        // The state variables are encapsulated within the object (they are hidden - no direct access)
        account.setBalance(new BigDecimal("100"));
        System.out.println("Account balance: " + account.getBalance());

    }
}
