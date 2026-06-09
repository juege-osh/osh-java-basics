package com.example.javabasic.oop;

public class InterfaceDemo {
    public static void main(String[] args) {
        Payment aliPay = new AliPay();
        Payment weChatPay = new WeChatPay();

        payOrder(aliPay, 99.9);
        payOrder(weChatPay, 188.0);
    }

    public static void payOrder(Payment payment, double amount) {
        payment.pay(amount);
    }

    interface Payment {
        void pay(double amount);
    }

    static class AliPay implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("支付宝支付: " + amount);
        }
    }

    static class WeChatPay implements Payment {
        @Override
        public void pay(double amount) {
            System.out.println("微信支付: " + amount);
        }
    }
}
