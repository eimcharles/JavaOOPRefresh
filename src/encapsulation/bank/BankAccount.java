package encapsulation.bank;

/**
 *       Encapsulation is the process of binding an object
 *       state and behaviour together as a unit.
 *
 *       - It prevents classes from being tightly coupled
 *       - We can make class attributes hidden from other classes using encapsulation
 *       - Easy to modify inner workings of classes without affecting rest of program
 * */

import java.math.BigDecimal;
import java.util.Objects;

public class BankAccount {

    /**
     *      Direct access to the class
     *      attributes is "hidden" by use of
     *      the private access modifier through
     *      encapsulation.
     *
     *      We have full control of how BankAccount is
     *      being consumed.
     * */

    private String name;
    private BigDecimal balance;

    private HasOverdraft hasOverdraft;

    public BankAccount(){}

    public BankAccount(String name) {
        this.name = name;
        this.balance = BigDecimal.ZERO;
    }

    public BankAccount(String name, BigDecimal balance, HasOverdraft hasOverdraft) {
        this.name = name;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    /**
     *      We are bundling the object's state and
     *      behaviour into one single unit: withdrawMoney()
     *      method.
     *
     *      Clients have access this method through the public interface.
     * */

    public BigDecimal withdrawMoney(BigDecimal amount){

        // Checks if balance would remain non-negative after subtracting amount
        if (this.balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0){

            // Subtracts the amount from balance (since there's enough money)
            this.balance = this.balance.subtract(amount);

            // Returns the withdrawn amount
            return amount;
        }

        // Not enough money to withdraw passes amount
        return BigDecimal.ZERO;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    // Set limit to balance, if needed - full control.
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public HasOverdraft getHasOverdraft() {
        return hasOverdraft;
    }

    public void setHasOverdraft(HasOverdraft hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount account = (BankAccount) o;
        return hasOverdraft == account.hasOverdraft &&
                Objects.equals(name, account.name) &&
                Objects.equals(balance, account.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, balance, hasOverdraft);
    }

    @Override
    public String toString() {
        return "BankAccount { name = '%s', balance = %s, hasOverdraft = %s }".formatted(name, balance, hasOverdraft);
    }
}
