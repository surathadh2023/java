package ex06_exercise;

public class Item {
  public int ID;
  public String descr;
  public int quantity;
  double price;

  public Item(int id, String descr, int quantity, double price) {
    this.ID = id;
    this.descr = descr;
    this.quantity = quantity;
    this.price = price;
  }

  public double calcuateTotalPrice() {
    System.out.println("Caculating total price");
    return this.quantity * this.price;

  }
}
