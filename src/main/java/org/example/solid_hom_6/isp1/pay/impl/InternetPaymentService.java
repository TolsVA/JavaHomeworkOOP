package org.example.solid_hom_6.isp1.pay.impl;


import org.example.solid_hom_6.isp1.pay.PayableCard;
import org.example.solid_hom_6.isp1.pay.PayablePhone;

public class InternetPaymentService implements PayableCard, PayablePhone {
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Internet pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Internet pay by credit card %d\n", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.printf("Internet pay by phone number %d\n", amount);
    }
}
