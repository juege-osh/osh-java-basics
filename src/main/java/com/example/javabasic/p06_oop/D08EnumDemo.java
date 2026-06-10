package com.example.javabasic.p06_oop;

/**
 * 学习枚举：用固定的一组值表示状态，避免到处写魔法字符串。
 */
public class D08EnumDemo {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.PAID;
        System.out.println("订单状态: " + status);
        System.out.println("中文说明: " + status.getDescription());

        // values() 可以拿到枚举里的全部值。
        for (OrderStatus value : OrderStatus.values()) {
            System.out.println(value.name() + " -> " + value.getDescription());
        }
    }

    enum OrderStatus {
        // 每个枚举值都是 OrderStatus 的一个固定对象。
        CREATED("已创建"),
        PAID("已支付"),
        SHIPPED("已发货"),
        FINISHED("已完成");

        private final String description;

        OrderStatus(String description) {
            this.description = description;
        }

        // 枚举也可以有字段、构造方法和普通方法。
        public String getDescription() {
            return description;
        }
    }
}
