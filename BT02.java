import java.util.Scanner;

public class BT02 {
    //Bai Tap 02: Viết hàm kiểm tra số nguyên tố, tính tổng các số nguyên tố nhỏ hơn n. N nhập từ bàn phím
    public static void main(String[] args){
        //Khai bao n
        int n;
        //Loop do while
        do{
            //In ra man hinh noi dung "Nhap n: "
            System.out.println("Nhap n >= 2: ");
            //Ham Scanner luu tru so da nhap tu ban phim
            Scanner input1 = new Scanner(System.in);
            //Gan so da nhap tu ban phim vao n
            n = input1.nextInt();
        }
        while(n<2);
        //Neu method kiemTraSoNguyenTo tra ve 1 thi n la so nguyen to
        if(kiemTraSoNguyenTo(n)==1) {
            int iSum=0;
            System.out.println(n + " la so nguyen to");
            System.out.println("Tất cả các số nguyên tố nhỏ hơn " +n+" la: ");
            for (int i = 1; i < n; i += 1) {
                if (isPrimeNumber(i)) {
                    System.out.print(" " + i);
                    iSum = iSum +i;
                }
            }
            System.out.println("\nTổng tất cả các số nguyên tố nhỏ hơn " +n+ " là: " + iSum);
        }

        //Neu method kiemTraSoNguyenTo tra ve 1 thi n khong la so nguyen to
        else
            System.out.println(n + " khong la so nguyen to");

        //Tinh tong cac so nguyen to nho hon n
        if(n==2)
            System.out.println("Tong cac so nguyen to nho hon 2 la chinh no");
    }
    //Ham kiem tra so nguyen to
    public static int kiemTraSoNguyenTo(int n){
            //Khai bao dem=0
            int dem=0;
            //Loop for
            for(int i=1;i<=n;i++){
                //Neu n chia het cho i thi dem + 1
                if(n%i==0)
                    dem++;
            }
            //Neu sau loop for ma dem = 2 thi return 1
            if(dem==2)
                return 1;
                //Neu sau loop for ma dem = 2 thi return 0
            else return 0;
    }
    //
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
