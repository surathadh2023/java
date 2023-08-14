
# Exercise 5-1: Conditionals and Flow Control in Gitpod

## Starter Code:

Below is the starter code you should begin with:

```java
package ex05_1_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        // Calculating total cost
        total = (price * quantity) * tax;

        // Declare outOfStock variable and initialize it
        // ... Your code here ...

        // Test quantity and modify message if quantity > 1.
        // ... Your code here ...

        // Test outOfStock and notify user in either case.
        // ... Your code here ...
    }
}
```

1. **Open Your Gitpod Workspace**: 
   - Ensure you're in your Gitpod workspace linked to your Java repository.

2. **Create a New Directory for the Package**: 
   - In the Gitpod interface (which is similar to VSCode), locate the File Explorer on the left sidebar.
   - Right-click on the directory where you want to add the new folder.
   - Choose "New Folder".
   - Name the folder `ex05_1_exercise`.

3. **Create a New Java Class Within the Folder**: 
   - Right-click on the newly created folder `ex05_1_exercise`.
   - Choose "New File".
   - Name the file `ShoppingCart.java`.
   - Copy and paste the starter code provided above into this file.

... (rest of the content remains unchanged) ...
