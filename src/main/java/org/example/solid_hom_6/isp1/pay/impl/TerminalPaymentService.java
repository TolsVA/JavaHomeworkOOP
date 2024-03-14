package org.example.solid_hom_6.isp1.pay.impl;

import org.example.solid_hom_6.isp1.pay.PayableCard;
public class TerminalPaymentService implements PayableCard {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }
}
