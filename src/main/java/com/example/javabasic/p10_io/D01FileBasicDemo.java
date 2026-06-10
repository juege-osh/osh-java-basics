package com.example.javabasic.p10_io;

import java.io.File;
import java.io.IOException;

/**
 * 学习 File：表示文件或目录本身，常用于判断、创建和查看文件信息。
 */
public class D01FileBasicDemo {
    public static void main(String[] args) throws IOException {
        // target 是 Maven 编译输出目录，适合放练习产生的临时文件。
        File dir = new File("target/demo-files");
        if (!dir.exists()) {
            // mkdirs 可以创建多级目录。
            boolean created = dir.mkdirs();
            System.out.println("创建目录: " + created);
        }

        File file = new File(dir, "hello.txt");
        if (!file.exists()) {
            // createNewFile 只创建空文件，不写入内容。
            boolean created = file.createNewFile();
            System.out.println("创建文件: " + created);
        }

        // 下面这些方法只是在查看文件信息，不会读取文件内容。
        System.out.println("文件名: " + file.getName());
        System.out.println("绝对路径: " + file.getAbsolutePath());
        System.out.println("是否文件: " + file.isFile());
        System.out.println("文件大小: " + file.length());

        // listFiles 读取目录下的文件列表；如果目录不存在或无权限，可能返回 null。
        File[] files = dir.listFiles();
        if (files != null) {
            for (File item : files) {
                System.out.println("目录下文件: " + item.getName());
            }
        }
    }
}
