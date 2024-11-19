import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Stack;

// TODO: Write a list or a regular expression or just something to check if the java source file has the proper grouping symbols such as () {} []



public class GroupSymbolCheck {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }

                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false; // Mismatched brackets
                }
            }
        }

        return stack.isEmpty(); // If stack is empty, all brackets are matched
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        try {
            File myObj = new File("TestCode.java");
            Scanner myReader = new Scanner(myObj);
            String fileData = myReader.nextLine();
            System.out.println(isBalanced(fileData));




//            while (myReader.hasNextLine()) {
//
//                System.out.println(data);
//
//                if (data.equals("// Couldn't get the Java file writer to create a file inside the src folder. Just move this manually when you want to run the code")) {
//                    System.out.println("String detection passed");
//                } else if (data.equals("}")) {
//                    System.out.println("String detection 2 passed");
//                } else {
//                    System.out.println("Nothing detected");
//                }
//            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }




    }
}
