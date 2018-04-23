package JavaBasic;

import java.util.Scanner;

public class splitString {
    public static void main (String[] args){
        //Print out: Enter the String
        System.out.println("Enter the String: ");
        //Scanner, save the inputted from keyboard
        Scanner scanner = new Scanner(System.in);
        //The value 'scanner' is assigned to 'input'
        String input = scanner.next();
        //Print out
        System.out.print("The chain symmetric with string '" + input + "' is: ");
        //Call the method 'splitString' with the variable 'input'
        reverseString(input);
    }

    public static void reverseString(String split){
        //Loop: Init 'i' with split.length()-1
        for (int i = split.length()-1; i >=0; i--) {
            //Assign 'result' with character at the specified index 'i' of the String
            char result = split.charAt(i);
            //Print out 'result'
            System.out.print(result);
        }
    }
}
