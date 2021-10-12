// Learning 23 : File Handling in Java
/*
    File Handling in Java is same as C programming that allows us to create, read, update and delete
    files.

    In order to get access to the File functions, we need to import the File class from the java.io package.
 */

import java.io.File; // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.IOException;  // Import the IOException class to handle errors

public class L23_FileHandling {
    public static void main(String[] args){
        // create a file object
        try {
            File myObj = new File("demo.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // write into the created file using FileWriter class
        try {
            FileWriter myWriter = new FileWriter("demo.txt");
            myWriter.write("You have write into your file successfully.");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // read from the file using Scanner class
        try {
            File myObj = new File("demo.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // delete file by using delete() method
        // let's create another file just for delete method demo
        try {
            File file = new File("deleteDemo.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        File file = new File("deleteDemo.txt");
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

    }
}
