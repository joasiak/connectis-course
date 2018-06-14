package pl.cschool.taskset3.cashpoint;

public class BankAccount {

    String accountNo;
    int pin;
    int balance;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
