package com.fileCreating;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SnackMachine extends LocalOperator{

    public SnackMachine(String location, String location_id) {
        super(5, 5, 10, location, location_id);
    }
}
