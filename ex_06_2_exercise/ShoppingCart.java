package ex_06_2_exercise;

public class ShoppingCart {
    public static void main(String[] args) {
         // Declare and initialize 2 Item objects
        Item item1 = new Item(1, "Windows",100.00,1);
        Item item2 = new Item(2, "Mac Book",120.00,1);
        // Print both item descriptions and run code.
            System.out.println(item1.desc);
            System.out.println(item2.desc);

            item1.displayItemDetails();
            item2.displayItemDetails();
        // Assign one item to another and run it again.
        item2 = item1;
        System.out.println(item1.desc);
        System.out.println(item2.desc);
    }
}
