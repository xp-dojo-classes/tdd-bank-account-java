package org.xpdojo.bank;

public class Account {
    Money balance;

    private Account(Money anAmount) {
        this.balance = anAmount;
    }

    public void depositAmountToAccount(Money amount){

        balance.increase();
    }

    public void withdrawAmountFromAccount(Money amount){

        balance.decrease();
    }




}
