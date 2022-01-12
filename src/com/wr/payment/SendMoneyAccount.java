package com.wr.payment;

/**
 * Created by admin on 12/01/22.
 */
public interface SendMoneyAccount extends Account {

    void debit(Money m);

}
