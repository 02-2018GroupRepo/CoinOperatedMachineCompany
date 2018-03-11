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

    public static Double doubleBufferIO(){
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        try {
            return Double.parseDouble(console.readLine());

        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    public static int intBufferIO(){
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        try {
            return Integer.parseInt(console.readLine());

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
