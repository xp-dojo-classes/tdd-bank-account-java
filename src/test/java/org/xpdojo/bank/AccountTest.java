package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.xpdojo.bank.service.AccountService;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    private AccountService accountService;
    @Test
	@Disabled
    public void depositAnAmountToIncreaseTheBalance() {
        assertThat("your first test").isBlank();
    }

    //I can Deposit money to accounts
    @Test
    public void deposit_money_To_accountsSuccessful() {
        Money money = new Money();
        Account account = new Account();
        accountService.depositMoneyToAccount(account, money);
    }
    //I can Withdraw money from accounts
    @Test
    public void withdraw_money_from_accountsSuccessful() {
        Money money = new Money();
        Account account = new Account();
        accountService.withdrawMoneyFromAccount(account, money);
    }
    //I can Transfer amounts between accounts (if I have the funds)
    @Test
    public void transfer_money_between_accountsSuccessful() {
        Money money = new Money();
        Account accountFrom = new Account();
        Account accountTo = new Account();
        accountService.transferMoneyBetweenAccount(accountFrom, accountTo, money);
    }


    //I can print out an Account balance slip (date, time, balance)
    @Test
    public void printStatementAccount_Successful() {
        Account account = new Account();
        accountService.printStatementAccount(account );
    }

    enum AccountStatementTypeEnum{
        DEPOSITS, WITHDRAWAL, DATE
    }
    //I can apply Statement filters (include just deposits, withdrawal, date)
    @Test
    public void printStatementAccountWithFilters_Successful() {
        Account account = new Account();

        //accountService.printStatementAccount(account, AccountStatementTypeEnum.DEPOSITS);
    }
}
