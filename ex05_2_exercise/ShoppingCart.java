package ex05_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String items[] = {"Shirts", "Shoes", "Colone", "Hair brush"};
        String message = String.format("%s wants to purchase %d items.",custName, items.length);      
       
        System.out.println(message);

         System.out.println(items[2]);
    }
    
}
