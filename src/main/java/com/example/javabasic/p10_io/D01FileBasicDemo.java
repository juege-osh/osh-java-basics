package com.example.javabasic.p10_io;

import java.io.File;
import java.io.IOException;

public class D01FileBasicDemo {
    public static void main(String[] args) throws IOException {
        File dir = new File("target/demo-files");
        if (!dir.exists()) {
            boolean created = dir.mkdirs();
            System.out.println("创建目录: " + created);
        }

        File file = new File(dir, "hello.txt");
        if (!file.exists()) {
            boolean created = file.createNewFile();
            System.out.println("创建文件: " + created);
        }

        System.out.println("文件名: " + file.getName());
        System.out.println("绝对路径: " + file.getAbsolutePath());
        System.out.println("是否文件: " + file.isFile());
        System.out.println("文件大小: " + file.length());

        File[] files = dir.listFiles();
        if (files != null) {
            for (File item : files) {
                System.out.println("目录下文件: " + item.getName());
            }
        }
    }
}
