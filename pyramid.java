package JavaBasic;

import java.util.Scanner;

public class pyramid {
    public static void main (String[] args) {
        //Initialize variable 'input'
        int input;
        //Loop do while
        do{
            //Print out 'Enter the Heigh: '
            System.out.println("Enter the Height: ");
            //Scanner, storage the value which entering from keyboard
            Scanner scanner = new Scanner(System.in);
            //Assign the storage to the variable 'input'
            input = scanner.nextInt();
        }
        //Condition, loop if 'input' < 0
        while(input<0);
        //Call the method 'pyramid' with variable 'input'
        Pyramid(input);
    }
    public static int Pyramid(int height){
        //Loop for, the row will begin from 1 to 'height'
        for (int i = 1; i <= height; i++){
            //Loop for, the column will begin from 1 to 'height' - 1. And print out " "
            for (int j = 1; j <= height - i; j++) System.out.print(" ");
            //Loop for, the column will begin from 1 to '2*i-1'. And print out "*"
            //It means print out the the bottom of the triangle with the height = i
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            //Break line
            System.out.println("");
        }
        return height;
    }
}
