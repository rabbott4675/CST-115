import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ryanabbott on 10/9/16.
 */
public class Dispenser {
    private final int maxLoad = 10;
    static int row;
    static int column;


    public static void main(String[] args) {

        Product[] products = {Product.drink1,Product.drink2, Product.drink3, Product.drink4,
                            Product.gum1,Product.gum2,Product.gum3,Product.gum4,
                            Product.chip1, Product.chip2,Product.chip3,Product.chip4,
                            Product.candy1, Product.candy2, Product.candy3, Product.candy4};

        Scanner input = new Scanner(System.in);
       System.out.println(Arrays.toString.products[]);

/*
        System.out.println("Choose Column");
        column = input.nextInt();

        System.out.println("Choose Row");
        row = input.nextInt();



        dispense(row, column);
*/



    }

    private static int dispense(int row, int column) {
        return column + row;
        //will handle the dispensing (just did addition to make error go away)
    }



    public int getMaxLoad() {
        return maxLoad;
    }


}
