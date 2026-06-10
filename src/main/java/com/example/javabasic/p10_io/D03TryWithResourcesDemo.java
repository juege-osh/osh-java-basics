package com.example.javabasic.p10_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 学习 try-with-resources：自动关闭文件读写资源。
 */
public class D03TryWithResourcesDemo {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("target/demo-files");
        Files.createDirectories(dir);
        Path file = dir.resolve("try-with-resources.txt");

        // try 括号里创建的 writer，会在代码块结束后自动 close。
        try (BufferedWriter writer = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            writer.write("第一行");
            writer.newLine();
            writer.write("第二行");
        }

        // reader 也会自动关闭，不需要手动写 finally。
        try (BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            String line;
            // readLine 每次读一行；读到文件末尾时返回 null。
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
