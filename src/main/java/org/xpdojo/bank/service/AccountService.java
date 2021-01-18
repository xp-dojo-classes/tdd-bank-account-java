package org.xpdojo.bank.service;

import org.xpdojo.bank.Account;
import org.xpdojo.bank.Money;

public interface AccountService {
    void withdrawMoneyFromAccount(Account account, Money money);

    void transferMoneyBetweenAccount(Account accountFrom, Account accountTo, Money money);

    void depositMoneyToAccount(Account account, Money money);

    void printStatementAccount(Account account);
}
