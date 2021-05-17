package org.xpdojo.bank;

import java.util.Objects;

/**
 * Immutable class to represent Money as a concept.
 * This class should have no accessor methods.
 */
public class Money {
    private double amount;

    private Money(final double anAmount) {
        this.amount = anAmount;
    }

    public void increase(final Money anAmount) {
        amount = this.amount + anAmount.amount;
    }

    public void decrease(final Money anAmount) {
        amount = this.amount - anAmount.amount;
    }

    public static Money anAmountOfAccount(final double anAmount) {
        return new Money(anAmount);
    }

}
