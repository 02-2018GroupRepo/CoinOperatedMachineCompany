package com.Project1;

import java.util.*;

public class DasCompany {
    String Name = "Backpfeifengesicht";

    enum machine{
        SNACK,DRINK
    }

    Map<Operator,String> operators = new HashMap<>();

    //ArrayList<Operator> operators;
    Collection<String> validIDs = operators.values();
    Iterator <String> ids = validIDs.iterator();


}
