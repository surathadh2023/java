
# Step-by-Step Guide to Create and Run a Java File in Gitpod (VSCode Environment)

1. **Open Gitpod Workspace**
   - Ensure that you are in your Gitpod workspace that's linked to your "java" repository.

2. **Create a New Folder**
   - In the left sidebar (File Explorer), right-click on the empty space.
   - Select "New Folder" from the dropdown.
   - Name this folder, for example, "java_projects".

3. **Create the Java File**
   - Navigate inside the "java_projects" folder by clicking on it.
   - Right-click within the folder space in the sidebar.
   - Select "New File" from the dropdown.
   - Name this file `SayHello.java`.

4. **Enter the Java Code**
   - Copy the following Java code:

```java
public class SayHello {
    public static void main(String[] args) {
        System.out.println("Hello Everyone!");
    }
}
```

   - Paste the code into the `SayHello.java` file that you just created in Gitpod.
   - Save the file.

5. **Run the Java Program via VSCode Interface**
   - Right-click on the `SayHello.java` file in the File Explorer sidebar.
   - Choose "Run Java".
   - The program should execute, and you should see the output: `Hello Everyone!` in the terminal.

6. **Compile and Run the Java Program from a New Terminal**
   - Open a new terminal in Gitpod by clicking on the "+" icon at the top-left corner of the terminal pane.
   - Navigate to the "java_projects" directory using:
     ```
     cd java_projects
     ```
   - Compile the Java file using:
     ```
     javac SayHello.java
     ```
   - If there are no errors, run the compiled Java program using:
     ```
     java SayHello
     ```
   - Again, you should see the output: `Hello Everyone!`

7. **Check Java Version**
   - In the terminal, type:
     ```
     java -version
     ```
   - This will display the version of Java installed in your Gitpod environment. Make a note of this version for future reference.

---

By following these steps, you've successfully created a Java file in the Gitpod environment, ran it using the VSCode interface, compiled it from the command line, and executed it. This confirms that your Gitpod setup is correctly configured for Java development.
