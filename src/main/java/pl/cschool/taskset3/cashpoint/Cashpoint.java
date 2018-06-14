package pl.cschool.taskset3.cashpoint;

public interface Cashpoint {

    boolean isAuthorized(int pin, BankAccount account);
    int checkAccountBalance(BankAccount account);
    void withdraw();
    TransactionStatus printConfirmation();
}
