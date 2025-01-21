package com.example;

import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;
import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        Tika tika = new Tika();
        File folder = new File("upload-files");

        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        try {
                            String content = tika.parseToString(file);
                            System.out.println("Extracted text from " + file.getName() + ":");
                            System.out.println(content);
                        } catch (IOException | TikaException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else {
            System.out.println("The provided path is not a directory.");
        }
    }
}