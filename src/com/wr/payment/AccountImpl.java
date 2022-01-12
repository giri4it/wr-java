package com.wr.payment;

/**
 * Created by admin on 12/01/22.
 */


final class AccountImpl implements SendMoneyAccount, ReceiveMoneyAccount {

    float balance;

    public void debit(Money m){
        this.balance = this.balance - m.amount;
    }

    public void credit(Money m){

        this.balance = this.balance + m.amount;

    }
}
