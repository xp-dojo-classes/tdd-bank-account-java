package org.xpdojo.bank;



public class Account {
    int balance;
    public void createAccount()
    {
        balance = 0;
    }

    public void depositAmount(int amount)
    {
        balance = balance + amount;
    }
}
