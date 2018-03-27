import java.util.Scanner;

public class BT01 {
    //Bai Tap 01: Cho số nguyên a, tính tổng các chữ số của a
    public static void main (String[] args){
        int a, iSum = 0;
        System.out.println("Nhap so nguyen a: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        if(a<0) {
            a = -a;
            while (a > 0) {
                iSum += a % 10;
                a = a / 10;
            }
        }
        System.out.println("Tong so cac chu so cua a la: " + iSum);

    }
}
