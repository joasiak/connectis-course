package pl.cschool.taskset3.cashpoint;

public class Atm implements Cashpoint{

    TransactionStatus status = TransactionStatus.OFF;

    @Override
    public boolean isAuthorized(int pin, BankAccount account) {
        System.out.println("Sprawdzanie karty. Autoryzacja");
        if (pin == account.getPin()) return true;
        return false;
    }

    @Override
    public int checkAccountBalance(BankAccount account) {
        System.out.println("Ta metoda zwraca saldo");
        return account.balance;
    }

    @Override
    public void withdraw() {
        System.out.println("Ta metoda pozwala wyplacić pieniądze z danego rachunku bankowego");
        status= TransactionStatus.IN_PROGRESS;
    }

    @Override
    public TransactionStatus printConfirmation() {
        System.out.println("Transakcja zakończona. Potwierdzenie wydrukowane.");
        return TransactionStatus.OFF;
    }


}
