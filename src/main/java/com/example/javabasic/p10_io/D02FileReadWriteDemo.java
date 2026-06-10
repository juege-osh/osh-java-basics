package com.example.javabasic.p10_io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * 学习 NIO 文件读写：用 Path 和 Files 读写文本文件。
 */
public class D02FileReadWriteDemo {
    public static void main(String[] args) throws IOException {
        // Path 是文件路径对象，比旧的 File API 更适合现代代码。
        Path dir = Paths.get("target/demo-files");
        Files.createDirectories(dir);

        Path file = dir.resolve("students.txt");
        List<String> lines = Arrays.asList("小明,90", "小红,98", "小刚,85");
        // 指定 UTF-8，避免中文在不同电脑上乱码。
        Files.write(file, lines, StandardCharsets.UTF_8);

        // readAllLines 一次性把小文本文件读成 List<String>。
        List<String> readLines = Files.readAllLines(file, StandardCharsets.UTF_8);
        for (String line : readLines) {
            // 每一行格式是“姓名,分数”，按逗号切成两段。
            String[] parts = line.split(",");
            System.out.println("姓名=" + parts[0] + ", 分数=" + parts[1]);
        }
    }
}
