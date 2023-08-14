package lab_exercises;

public class NumericManipulation {
    public static void main(String[] args) {
        double price = 200.00;
        double tax = 0.10;
        int quantity = 2;
        String custName = "Guy";
        String itemDesc = "New item on the block";

        String message = custName + " wants to purchase " + quantity + " " + itemDesc + ".\n";
        System.out.println(message);

        double total = price * quantity * (1 + tax);

        System.out.printf("total cost with the tax is %.2f%n", total);

    }

}
