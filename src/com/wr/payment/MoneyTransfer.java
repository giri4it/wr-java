package com.wr.payment;

/**
 * Created by admin on 12/01/22.
 */
public class MoneyTransfer {

    public static boolean transfer(SendMoneyAccount fromAccount, ReceiveMoneyAccount toAccount, Money money){
            fromAccount.debit(money);
            toAccount.credit(money);
    }

    public static SendMoneyAccount getSendMoneyAccount(String accId){
        return new AccountImpl();
    }

    public static ReceiveMoneyAccount getreceiveMoneyAccount(String accId){
       return new AccountImpl();
    }

    public static Money  getMoney(float amount){
         return   new MoneyImpl(amount);
    }
}


