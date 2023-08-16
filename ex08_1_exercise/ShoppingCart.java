package ex08_1_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        if(item1.setColor( 'N')) {
            System.out.println("Item color is " + item1.color);
        }else {
            System.out.println("Invalid Character");
        }
        
    }
}
