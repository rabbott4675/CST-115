/**
 * Created by ryanabbott on 10/9/16.
 */

public class Product implements Comparable<Product>{
    public String productName;
    public double productOunces;
    public double price;
    public int productColumn;
    public int productRow;
    public int quantity;

    @Override
    public int compareTo(Product o) {
        return 0;
    }

    //drink
                             //Name, ounces, Price, Column, Row, Quantity, Caffeine
    static Drink drink1 = new Drink("Cola" , 16 , 1.75, 1 , 1 , 10, true);
    static Drink drink2 = new Drink("Pespsi" , 16 , 1.75, 1 , 2 , 10, true);
    static Drink drink3 = new Drink("Orange Juice" , 14 , 2.50, 1 , 3 , 10, false);
    static Drink drink4 = new Drink("Apple Juice" , 14 , 2.50, 1 , 4 , 10, false);

    ///gum
                            //Name, ounces, Price, Column, Row, Quantity, Flavor
    static Gum gum1 = new Gum("Orbit Pepermint", 1 , 1.50, 2 , 1 , 10 , "Peperment");
    static Gum gum2 = new Gum("Orbit Mint", 1 , 1.50, 2 , 2 , 10 , "Mint");
    static Gum gum3 = new Gum("DoubleMint Buble Gum", 1 , 1.50, 2 , 3 , 10 , "Bubble Gum");
    static Gum gum4 = new Gum("DoubleMint Cherry", 1 , 1.50, 2 , 4 , 10 , "Cherry");

    ///Chips
                            //Name, ounces, Price, Column, Row, Quantity, Flavor
    static Chips chip1 = new Chips("Daritos Nacho Cheese", 2.25 , 1.50, 3 , 1 , 10 , "Cheese");
    static Chips chip2 = new Chips("BBQ Lays", 3 , 1.50, 3 , 2 , 10 , "BBQ");
    static Chips chip3 = new Chips("Ranch Lays", 3 , 1.50, 3 , 3 , 10 , "Ranch");
    static Chips chip4 = new Chips("Spicy Chitos", 2.25 , 1.50, 3 , 4 , 10 , "Cheese");

    ///Candy
                                //Name, ounces, Price, Column, Row, Quantity, Flavor
    static Candy candy1 = new Candy("Resses", 4 , 1.75, 4 , 1 , 10 , true);
    static Candy candy2 = new Candy("Snickers", 10 , 1.50, 4 , 2 , 10 , true);
    static Candy candy3 = new Candy("Hershey Choclate", 10 , 1.50, 4 , 3 , 10 , false);
    static Candy candy4 = new Candy("M&M's", 10 , 1.50, 4 , 4 , 10 , false);



    //ArrayList<Product> productList = new ArrayList<Product>();


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductOunces(double productOunces) {
        this.productOunces = productOunces;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductColumn(int productColumn) {
        this.productColumn = productColumn;
    }

    public void setProductRow(int productRow) {
        this.productRow = productRow;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName(String name) {

        return productName;
    }

    public double getProductOunces(double ounces) {
        return productOunces;
    }

    public double getPrice(double price) {
        return this.price;
    }

    public int getProductColumn(int name) {
        return productColumn;
    }

    public int getProductRow(int row) {
        return productRow;
    }

    public int getQuantity(int quantity) {
        return this.quantity;
    }


}
