package JavaBasic;

import java.text.ParseException;
import java.util.Scanner;


public class number {
    public static void main(String[] args) throws ParseException {
        System.out.println("Enter 2 Number: ");
        //Scanner, save the inputted from keyboard
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input<0 || input>99){
            System.out.println("Enter 2 Number: ");
            input = scanner.nextInt();
        }
        number(input);
    }
    public static int number (int n){
        int a = n/10;
        int b = n%10;
        switch (a) {
            case 1:
                System.out.print("Muoi ");
                break;
            case 2:
                System.out.print("Hai Muoi ");
                break;
            case 3:
                System.out.print("Ba Muoi ");
                break;
            case 4:
                System.out.print("Bon Muoi ");
                break;
            case 5:
                System.out.print("Nam Muoi ");
                break;
            case 6:
                System.out.print("Sau Muoi ");
                break;
            case 7:
                System.out.print("Bay Muoi ");
                break;
            case 8:
                System.out.print("Tam Muoi ");
                break;
            case 9:
                System.out.print("Chin Muoi ");
                break;
        }
        switch (b) {
            case 0:
                System.out.println("Khong ");
            case 1:
                System.out.println("Mot ");
                break;
            case 2:
                System.out.println("Hai ");
                break;
            case 3:
                System.out.println("Ba ");
                break;
            case 4:
                System.out.println("Bon ");
                break;
            case 5:
                System.out.println("Nam ");
                break;
            case 6:
                System.out.println("Sau ");
                break;
            case 7:
                System.out.println("Bay ");
                break;
            case 8:
                System.out.println("Tam ");
                break;
            case 9:
                System.out.println("Chin ");
                break;
        }
        return n;
    }
}