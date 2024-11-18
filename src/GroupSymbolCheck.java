import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner; // Import the Scanner class to read text files

// TODO: Write a list or a regular expression or just something to check if the java source file has the proper grouping symbols such as () {} []

public class GroupSymbolCheck {
    public static void main(String[] args) {
        try {
            File myObj = new File("TestCode.java");
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




    }
}
