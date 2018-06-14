package pl.cschool.taskset3.cashpoint;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtmTest {
    @Test
    public void test() {
        Atm atm = new Atm();
        BankAccount account = new BankAccount();
        account.setPin(1234);
        assertEquals(true, atm.isAuthorized(1234, account));
        atm.withdraw();
        assertEquals(TransactionStatus.IN_PROGRESS, atm.status);
        assertEquals(TransactionStatus.OFF, atm.printConfirmation());
    }
}
