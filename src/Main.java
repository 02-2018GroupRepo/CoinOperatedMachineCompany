import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Customer dude = new Customer();
        Operator dudette = new Operator();
        String input;

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Are you a customer or an operator?");
            input = console.readLine();

        } catch (Exception e) {
            System.out.println(e);
        } finally {

//                console.close();
        }


        switch (input) {
            case "customer":
            case "operator":
        }

        //split string input into chars, char[0] = shelf, char[1] = product. this is how to retrieve the vending machine items


        public void vend () {
            Machine snax = new Machine();
            int id = (int) Math.floor(Math.random() * 1000);
            Product chips1 = new Product(id, "chips1", "cheese poofs", 3.50, 10);
            Product chips2 = new Product(id, "chips2", "bbq", 2.50, 10);
            Product chips3 = new Product(id, "chips3", "chiips", 1.50, 10);
            Product chips4 = new Product(id, "chips4", "chiiips", 2.00, 10);
            Product chips5 = new Product(id, "chips5", "chiiiiips", 2.50, 10);

            Product[] vShelfA = {chips1, chips2, chips3, chips4, chips5};

//            for (Product product : productList3) {
//                vendor3.add(product);
//                System.out.println(product.toString());
//                store.setProductAvail(product.getName(), product.getQty());,
//            }

        }

        static void drink () {
            Machine dranks = new Machine();
            Product cheetos = new Product(1, "Cheetos", "cheese poofs", 3.50, 10);
            Product cheetos = new Product(1, "Cheetos", "cheese poofs", 3.50, 10);
            Product cheetos = new Product(1, "Cheetos", "cheese poofs", 3.50, 10);
            Product cheetos = new Product(1, "Cheetos", "cheese poofs", 3.50, 10);
            Product cheetos = new Product(1, "Cheetos", "cheese poofs", 3.50, 10);

            Product[] dShelfA = {chips1, chips2, chips3, chips4, chips5};

        }


    }
}
