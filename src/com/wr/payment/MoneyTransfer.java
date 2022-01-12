package com.wr.payment;

/**
 * Created by admin on 12/01/22.
 */
public class MoneyTransfer {

    public static void transfer(SendMoneyAccount fromAccount, ReceiveMoneyAccount toAccount, Money money){
            fromAccount.debit(money);
            toAccount.credit(money);
    }

    public static Account getAccount(String acId){
        return new AccountImpl();
    }

    public static Money  getMoney(float amount){
         return   new MoneyImpl(amount);
    }
}


