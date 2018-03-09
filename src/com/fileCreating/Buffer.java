package com.fileCreating;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer {
    public static String stringBufferIO() {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        try {
            return console.readLine();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
