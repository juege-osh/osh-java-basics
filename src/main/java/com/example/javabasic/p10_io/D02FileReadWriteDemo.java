package com.example.javabasic.p10_io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class D02FileReadWriteDemo {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("target/demo-files");
        Files.createDirectories(dir);

        Path file = dir.resolve("students.txt");
        List<String> lines = Arrays.asList("小明,90", "小红,98", "小刚,85");
        Files.write(file, lines, StandardCharsets.UTF_8);

        List<String> readLines = Files.readAllLines(file, StandardCharsets.UTF_8);
        for (String line : readLines) {
            String[] parts = line.split(",");
            System.out.println("姓名=" + parts[0] + ", 分数=" + parts[1]);
        }
    }
}
