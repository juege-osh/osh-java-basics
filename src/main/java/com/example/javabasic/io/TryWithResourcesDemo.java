package com.example.javabasic.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResourcesDemo {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("target/demo-files");
        Files.createDirectories(dir);
        Path file = dir.resolve("try-with-resources.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(file, StandardCharsets.UTF_8)) {
            writer.write("第一行");
            writer.newLine();
            writer.write("第二行");
        }

        try (BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
