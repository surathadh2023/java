package challenge_02;
import java.util.*;

public class PurchaseHistory {
    private Date purchaseDate;
    private List<Product> products;

    public PurchaseHistory(Date purchaseDate, List<Product> products) {
        this.purchaseDate = purchaseDate;
        this.products = products;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public Date getPurchaseDate() {
        return this.purchaseDate;
    }

}
