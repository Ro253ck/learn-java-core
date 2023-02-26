package com.nbicocchi.exercises.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CreateDelete {
    public static void createFile(String src, String dst) throws IOException {
        Files.createFile(Paths.get(src));
    }

    public static void deleteFile(String src, String dst) throws IOException {
        Files.deleteIfExists(Paths.get(src));
    }
}
