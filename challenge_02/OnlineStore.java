package challenge_02;


public class OnlineStore {

    public static void main(String[] args) {
        Product shirt = new Product("Shirt", 20.00, 10);
        Product pant =  new Product("Pants", 30.00, 5);
        Customer harry = new Customer("Harry",2);

        harry.purchase(pant,2);
        harry.purchase(shirt,2);

        harry.checkout();

    
    }
    
}
