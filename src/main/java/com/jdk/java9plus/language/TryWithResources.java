package com.jdk.java9plus.language;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResources {

    public void doWithFile(FileInputStream fileInputStream) throws IOException {
        try (fileInputStream) { // no need to re-assign fileInputStream
            fileInputStream.read();
        }
    }

}
