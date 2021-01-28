package org.xpdojo.bank;

import java.util.Currency;
import java.util.Objects;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {

    Currency currency;
    float amount;
    public Money() {
    }

    public Money(Float amount, Currency currency) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Objects.equals(currency, money.currency) && Objects.equals(amount, money.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currency, amount);
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency=" + currency +
                ", amount=" + amount +
                '}';
    }

    public void depositMoney(Money money) {
        this.amount += money.amount;
    }

    public Float getAmount() {
        return this.amount;
    }
}
