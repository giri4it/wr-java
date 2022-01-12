package com.wr.enrollment;

import com.wr.payment.MoneyTransfer;

/**
 * Created by admin on 12/01/22.
 */
public class Enrollment {

    void enroll(){

        MoneyTransfer.transfer(MoneyTransfer.getSendMoneyAccount("234"),
                MoneyTransfer.getreceiveMoneyAccount("123"),
                MoneyTransfer.getMoney(2400));
    }
}
