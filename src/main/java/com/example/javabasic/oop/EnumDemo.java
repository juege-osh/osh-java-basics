package com.example.javabasic.oop;

public class EnumDemo {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.PAID;
        System.out.println("订单状态: " + status);
        System.out.println("中文说明: " + status.getDescription());

        for (OrderStatus value : OrderStatus.values()) {
            System.out.println(value.name() + " -> " + value.getDescription());
        }
    }

    enum OrderStatus {
        CREATED("已创建"),
        PAID("已支付"),
        SHIPPED("已发货"),
        FINISHED("已完成");

        private final String description;

        OrderStatus(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
}
