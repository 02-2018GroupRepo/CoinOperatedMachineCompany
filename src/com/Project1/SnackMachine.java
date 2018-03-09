package com.Project1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Vector;

public class SnackMachine extends AbstractMachine {

    SnackMachine(int columns, int rows) {
        super(columns, rows);


        myMachineID = ++AbstractMachine.lastMachineID;

        String machineStringID = Integer.toString(myMachineID);

        URL logFolder = getClass().getResource("logs/");
        String machineLogPath = logFolder.getPath() + machineStringID + ".txt";

        File file = new File(machineLogPath);

        try {
            if (!file.createNewFile()) ;
            FileWriter writer = new FileWriter(file);
            writer.write("Created \t\t\t " + LocalDateTime.now());
            writer.flush();
            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
