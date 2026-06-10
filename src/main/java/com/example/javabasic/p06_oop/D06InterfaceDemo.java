package com.example.javabasic.p06_oop;

/**
 * 学习接口：接口定义“能做什么”，具体类决定“怎么做”。
 */
public class D06InterfaceDemo {
    public static void main(String[] args) {
        // 接口变量可以接收任何实现了该接口的对象。
        Payment aliPay = new AliPay();
        Payment weChatPay = new WeChatPay();

        payOrder(aliPay, 99.9);
        payOrder(weChatPay, 188.0);
    }

    public static void payOrder(Payment payment, double amount) {
        // 这里不关心具体是支付宝还是微信，只关心它能 pay。
        payment.pay(amount);
    }

    interface Payment {
        // 接口方法默认只声明规则，不写具体实现。
        void pay(double amount);
    }

    // implements 表示 AliPay 实现 Payment 接口。
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
