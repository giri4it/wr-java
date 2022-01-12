package com.wr.enrollment;

import com.wr.payment.MoneyTransfer;
import com.wr.payment.ReceiveMoneyAccount;
import com.wr.payment.SendMoneyAccount;

/**
 * Created by admin on 12/01/22.
 */
public class Enrollment {

    void enroll(){

        MoneyTransfer.transfer((SendMoneyAccount) MoneyTransfer.getAccount("234"),
                (ReceiveMoneyAccount) MoneyTransfer.getAccount("123"),
                MoneyTransfer.getMoney(2400));
    }
}
