/**
 * Created by ryanabbott on 10/9/16.
 */
public class Candy extends Product {


    boolean containsNuts;

    public Candy(String name, double ounces, double price, int column, int row, int quantity, boolean containsNuts) {
        setProductName(name);
        setProductOunces(ounces);
        setPrice(price);
        setProductColumn(column);
        setProductRow(row);
        setQuantity(quantity);
        this.containsNuts = containsNuts;
    }
}
