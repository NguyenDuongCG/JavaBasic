import java.util.Scanner;

public class BT03 {
    public static String input=checkIsString(input);
    public static boolean flat;
    public static void main (String[] args){
        input = inputStringFromKeyboard(input);
        flat = checkIsString(flat);
        System.out.println(flat);
    }
    public static String inputStringFromKeyboard(String input){
        //Print out: Input the String
        System.out.println("Input the String: ");
        //Scanner, save the inputted from keyboard
        Scanner scanner = new Scanner(System.in);
        //The value 'scanner' is assigned to 'input'
        input = scanner.next();
        return input;
    }
    public static boolean checkIsString(boolean flat){
        input = inputStringFromKeyboard(input);
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                System.out.println("Way2 - Not a Number");
                return flat=false;
            }
            else
                if (i + 1 == input.length()) {
                System.out.println("Way2 - Is a Number");
                return flat=true;
            }
        }
        return flat;
    }

}
