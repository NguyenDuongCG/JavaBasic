package JavaBasic;

import java.util.Scanner;

public class triangleSquare {
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
        while(input<0);
        //Call the method 'triangleSquare' with variable 'input'
        triangleSquare(input);
    }
    public static int triangleSquare(int height){
        //Loop for, the row will begin from 1 to 'height'
        for (int i = 1; i <= height; i++){
            //Loop for, each column will begin from 1 to 'i'. And print out "*"
            for (int j = 1; j <= i; j++) System.out.print("*");
            //Break line
            System.out.println("");
        }
        return height;
    }
}
