package org.xpdojo.bank;

import java.util.Objects;

public class Account {
    Money balance;

    private Account(Money anAmount) {
        this.balance = anAmount;
    }

    public static Account accountWithMoney(Money amount) {
        return new Account(amount);
    }


    public void depositAmountToAccount(Money amount){

        balance.increase(amount);
    }

    public void withdrawAmountFromAccount(Money amount){

        balance.decrease(amount);
    }



}
