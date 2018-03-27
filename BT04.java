import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BT04 {
    //BT04: Mở 1 file txt, xuất ra màn hình nội dung của file.
    public static void main(String[] args){
        try {
            //Tạo đối tượng luồng và liên kết nguồn dữ liệu
            File file = new File("d:/file/mydata.txt");
            FileReader fileReader = new FileReader(file);

            //Đọc dữ liệu
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println("Nôi dung của file " + file + " la" + "\n"+line);
            }

            //Bước 3: Đóng luồng
            fileReader.close();
            bufferedReader.close();
        }
        catch (Exception ex) {
            System.out.println("Loi doc file: "+ex);
        }
    }
}
