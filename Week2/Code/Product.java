import java.util.ArrayList;

/**
 * Created by ryanabbott on 10/9/16.
 */
public class Product {
    private String productName;
    private int productOunces;
    private int price;
    private int productColumn;
    private int productRow;
    private int quantity;


    public static void displayProduct(){
        ArrayList<Candy> candyList = new ArrayList <~>(){
            candyList.add(new Candy(
                    "Name",
                    "Ounces",
                    "price",
                    "Column",
                    "Row",
                    "Quantity"
            ));
        }

        ArrayList<Chips> chipsList = new ArrayList <~>(){
            chipsList.add(new Chips(
                    "Name",
                    "Ounces",
                    "price",
                    "Column",
                    "Row",
                    "Quantity"
            ));
        }

        ArrayList<Gum> gumList = new ArrayList <~>(){
            gumList.add(new Gum(
                    "Name",
                    "Ounces",
                    "price",
                    "Column",
                    "Row",
                    "Quantity"
            ));
        }

        ArrayList<Drink> drinkList = new ArrayList <~>(){
            drinkList.add(new Drink(
                    "Name",
                    "Ounces",
                    "price",
                    "Column",
                    "Row",
                    "Quantity"
            ));
        }



    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductOunces(int productOunces) {
        this.productOunces = productOunces;
    }

    public void setPrice(int price) {
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

    public String getProductName() {

        return productName;
    }

    public int getProductOunces() {
        return productOunces;
    }

    public int getPrice() {
        return price;
    }

    public int getProductColumn() {
        return productColumn;
    }

    public int getProductRow() {
        return productRow;
    }

    public int getQuantity() {
        return quantity;
    }
}
