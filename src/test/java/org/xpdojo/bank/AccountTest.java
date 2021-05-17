package org.xpdojo.bank;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.xpdojo.bank.Account.accountWithMoney;
import static org.xpdojo.bank.Money.anAmountOfAccount;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {

        Account account = accountWithMoney(anAmountOfAccount(0));
        account.depositAmountToAccount(anAmountOfAccount(5));
        assertThat(account).isEqualTo(accountWithMoney(anAmountOfAccount(5)));
    }

    @Test
    public void withdrawAnAmountToDecreaseTheBalance(){
        Account account = accountWithMoney(anAmountOfAccount(5));
        account.withdrawAmountFromAccount(anAmountOfAccount(2));
        assertThat(account).isEqualTo(accountWithMoney(anAmountOfAccount(3)));
    }

    @Test
    public void transferMoneyFromAccountToAnotherAccount(){
        assertThat("Failing test for red test").isBlank();
    }

    @Test
    public void printOutAnAccountBalanceSlip(){
        assertThat("Failing test for red test").isBlank();
    }

    @Test
    public void printAStatementOfAccountActivity(){
        assertThat("Failing test for red test").isBlank();
    }

    @Test
    public void applyStatementFilters(){
        assertThat("Failing test for red test").isBlank();
    }

}
