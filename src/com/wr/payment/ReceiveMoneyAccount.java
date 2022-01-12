package com.wr.payment;

/**
 * Created by admin on 12/01/22.
 */
public interface ReceiveMoneyAccount extends  Account {
    void credit(Money money);
}
