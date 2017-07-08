package Read_Write_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class in_Keyboard {
    Scanner sc;
    String file_name;
    public in_Keyboard( String file_name) throws IOException {
        sc = new Scanner(System.in);
        System.out.println("Nhập vào tên file bạn muốn tạo!!!");
        file_name = sc.nextLine();
        File f_create = new File("C:\\Users\\nguyenthanhnam0212\\Desktop\\"+file_name+".txt");
        f_create.createNewFile();
        FileWriter ghi = new FileWriter(f_create);
        ghi.write("line1\n");
        ghi.write("line2\n");
        ghi.close();
    }
}
