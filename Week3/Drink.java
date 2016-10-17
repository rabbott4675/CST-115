/**
 * Created by ryanabbott on 10/9/16.
 */
public class Drink extends Product {

    boolean caffine;

    public Drink(String name, double ounces, double price, int column, int row, int quantity, boolean caffine) {
        setProductName(name);
        setProductOunces(ounces);
        setPrice(price);
        setProductColumn(column);
        setProductRow(row);
        setQuantity(quantity);
        this.caffine = caffine;
    }


}
