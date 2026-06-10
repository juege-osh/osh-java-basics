package com.example.javabasic.p07_exception;

/**
 * 学习自定义异常：让错误类型更贴近业务含义。
 */
public class D03CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            login("admin", "wrong-password");
        } catch (LoginException e) {
            System.out.println("登录失败: " + e.getMessage());
        }
    }

    public static void login(String username, String password) throws LoginException {
        // equals 写在常量后面，可以避免 username 为 null 时空指针。
        if (!"admin".equals(username) || !"123456".equals(password)) {
            throw new LoginException("用户名或密码错误");
        }
        System.out.println("登录成功");
    }

    // 继承 Exception 表示这是一个受检异常，方法上要写 throws。
    static class LoginException extends Exception {
        public LoginException(String message) {
            // super(message) 把错误信息交给父类 Exception 保存。
            super(message);
        }
    }
}
