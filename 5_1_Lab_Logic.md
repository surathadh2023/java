
# Exercise 5-1: Using Conditionals in Gitpod

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

4. **Copy and Paste the Starter Code**:
   - Copy the provided starter code and paste it into the `ShoppingCart.java` file you just created.
   
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
	String message = custName+" wants to purchase "+quantity+" "+itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;

        
        // Declare outOfStock variable and initialize it
        
        
        // Test quantity and modify message if quantity > 1.  
         
        
        // Test outOfStock and notify user in either case.  
        
        
        
    }
    
}

```

5. **Declare and Initialize the `outOfStock` Boolean**:
   - Under the comment that says "Declare outOfStock variable and initialize it", declare a boolean named `outOfStock` and initialize it to `true`.

6. **Modify the `message` Based on `quantity`**:
   - Below the comment "Test quantity and modify message if quantity > 1.", use an `if` statement to check if `quantity` is greater than 1.
   - If true, modify the `message` string to make the item description plural (i.e., add an "s" at the end).

7. **Test the `outOfStock` Variable**:
   - Under the comment "Test outOfStock and notify user in either case.", use an `if | else` statement to check the value of `outOfStock`.
   - If `outOfStock` is true, print a message to notify the user that the item is unavailable.
   - If `outOfStock` is false, print the `message` and then print the total cost with tax.

8. **Run and Test the Program**:
   - Save your file.
   - In the File Explorer, right-click on the `ShoppingCart.java` file.
   - Choose "Run Java".
   - First, observe the output with `outOfStock` set to `true`.
   - Modify the value of `outOfStock` to `false` and run the program again. Observe the new output.

---

**Note**: This exercise allows you to practice using conditional statements in Java. By following the above steps and not looking at the provided solution, you'll reinforce your understanding of Java conditionals and their applications.
