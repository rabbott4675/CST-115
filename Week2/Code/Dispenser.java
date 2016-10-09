import java.util.Scanner;

/**
 * Created by ryanabbott on 10/9/16.
 */
public class Dispenser {
    private final int maxLoad = 10;
    static int row;
    static int column;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose Column");
        column = input.nextInt();

        System.out.println("Choose Row");
        row = input.nextInt();

        Product.displayProduct();

        dispense(row, column);

    }

    private static int dispense(int row, int column) {
        return column + row;
        //will handle the dispensing (just did addition to make error go away)
    }



    public int getMaxLoad() {
        return maxLoad;
    }


}
