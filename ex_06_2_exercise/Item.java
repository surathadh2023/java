package ex_06_2_exercise;

public class Item {
    public int itemID;
    public String desc;
    public double price;
    public int quantity;

    public Item(int itemID, String desc, double price, int quantity) {
        this.itemID = itemID;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayItemDetails() {
       String message =  "[" + this.quantity + " quantity for " +  this.desc + " with product id of " + this.itemID + " with the price of each " + this.price +  "]";
       System.out.println(message);
    }
}
