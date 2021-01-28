package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	 public void createAccountwithZeroBalance() {
        Account acc = new Account();
        assertThat(acc.balance).isEqualTo(0);
    }

    @Test
    public void depositAmount() {
        Account acc = new Account();
        acc.depositAmount(100);
        assertThat(acc.balance).isEqualTo(100);
    }

    @Test
    public void depositMultipleTransaction() {
        Account acc = new Account();
        acc.depositAmount(100);
        acc.depositAmount(100);
        assertThat(acc.balance).isEqualTo(200);
    }
}
