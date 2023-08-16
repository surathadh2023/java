package ex08_2_exercise;

public class Item {
    String desc;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + desc + ", " + quantity + ", "
                + price + ", "+colorCode);
    }

    // Write a public 3-arg setItemDisplay method that returns void.
    public void setItemDisplay(String description, int qty, double price) {
        this.desc = description;
        this.quantity = qty;
        this.price = price;
        this.displayItem();
    }
    

    // Write a public 4-arg setItemDisplay method that returns an int.
    public int setItemDisplay(String description, int qty, double price, char colorCode) {
        this.desc = description;
        this.quantity = qty;
        this.price = price;
       if(colorCode == ' ') return -1;
       this.colorCode = colorCode;
        this.setItemDisplay(description, qty, price, colorCode);
        return 0;
    }
    
    
}
