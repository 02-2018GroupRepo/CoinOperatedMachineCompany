package coinOperatedMachine;
import java.util.*;

public class Company {

    ArrayList<Operator> myCompany;

    public Company () {
        myCompany = new ArrayList<>();
    }

    public void setOperator (Operator oper) {
        myCompany.add(oper);
    }

    public ArrayList<String> getOperator () {
        ArrayList<String> list = new ArrayList<>();
        for (Operator ope : myCompany) {
            list.add(ope.name);
        }
        return list;
    }
}


