/**
 * Created by ryanabbott on 10/9/16.
 */
public class Chips extends Product {

    String flavor;

    public Chips(String name, double ounces, double price, int column, int row, int quantity, String flavor) {
        setProductName(name);
        setProductOunces(ounces);
        setPrice(price);
        setProductColumn(column);
        setProductRow(row);
        setQuantity(quantity);
        this.flavor = flavor;
    }

}

