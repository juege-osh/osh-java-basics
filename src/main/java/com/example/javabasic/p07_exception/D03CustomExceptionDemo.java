package com.example.javabasic.p07_exception;

public class D03CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            login("admin", "wrong-password");
        } catch (LoginException e) {
            System.out.println("登录失败: " + e.getMessage());
        }
    }

    public static void login(String username, String password) throws LoginException {
        if (!"admin".equals(username) || !"123456".equals(password)) {
            throw new LoginException("用户名或密码错误");
        }
        System.out.println("登录成功");
    }

    static class LoginException extends Exception {
        public LoginException(String message) {
            super(message);
        }
    }
}
