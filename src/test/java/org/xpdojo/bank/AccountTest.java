package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.xpdojo.bank.service.AccountService;
import org.xpdojo.bank.service.impl.AccountServiceImpl;

import java.util.Currency;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

    private AccountService accountService = new AccountServiceImpl();
    @Test
	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat("your first test").isBlank();
    }

    @Test
    public void accountIs0_Ok() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void deposit_money_To_accountsSuccessful() {
        Account account = new Account();
        account.deposit(100);
        assertThat(account.balance()).isEqualTo(100);
    }

    @Test
    public void depositMultipleAmountsSuccessful() {
        Account account = new Account();
        account.deposit(100);
        account.deposit(200);
        assertThat(account.balance()).isEqualTo(300);
    }

    //I can Withdraw money from accounts
    @Test
    public void withdraw_money_from_accountsSuccessful() {
    }
    //I can Transfer amounts between accounts (if I have the funds)
    @Test
    public void transfer_money_between_accountsSuccessful() {
    }


    //I can print out an Account balance slip (date, time, balance)
    @Test
    public void printStatementAccount_Successful() {
    }

    @Test
    public void printStatementAccountWithFilters_Successful() {

    }
}
