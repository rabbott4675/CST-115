/**
 * Created by ryanabbott on 10/9/16.
 */
public class Gum extends Product {

    String flavor;

    public Gum(String name, double ounces, double price, int column, int row, int quantity, String flavor) {
        setProductName(name);
        setProductOunces(ounces);
        setPrice(price);
        setProductColumn(column);
        setProductRow(row);
        setQuantity(quantity);
        this.flavor = flavor;
    }

}
