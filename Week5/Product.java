import java.util.ArrayList;

public abstract class Product implements Comparable<Product>{

private String productName;
private double pPrice;
public double count = 0.00;

static Drink soda = new Drink("Soda", 1.25);
static Drink gatorade = new Drink("Gatorade", 1.25);
static Drink water = new Drink("Water", 1.25);
static Candy lifesavers = new Candy("Lifesavers", 0.75);
static Candy candybar = new Candy("Candybar", 0.75);
static Chips lays = new Chips("Lays", 1.50);
static Chips doritos = new Chips("Doritos", 1.50);
static Gum bubbleYum = new Gum("Bubble Yum", 0.75);
static Gum dentyne = new Gum("Dentyne", 0.75);

public Product(){
}
public Product(String productName, double pPrice){
	this.productName = productName;
	this.pPrice = pPrice;
}
public double getPrice(){
	return pPrice;
}
public double getCount(){
	count += pPrice;
	return count;
}
public static Object[] getDrinks(){
	Drink[] drinks = new Drink[] {gatorade, soda, water};
	return drinks;
}
public static Object[] getSnacks(){
	Snack[] snacks = new Snack[] {bubbleYum, candybar, dentyne, doritos, lays, lifesavers};
	return snacks;
}
public int compareTo(Product other){
	if(!this.productName.equalsIgnoreCase(other.productName))
	return this.productName.compareTo(other.productName);
	else{
		return this.productName.compareTo(other.productName);
	}
}

@Override
public String toString(){
	return productName + " " + pPrice;
}
}

ArrayList productList = new ArrayList(Product);