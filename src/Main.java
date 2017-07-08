import Read_Write_File.in_Excel;

import java.io.*;
import java.net.InetAddress;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        in_Excel ex = new in_Excel();
        String x = ex.Read_Cell(0,0,0);
        System.out.println(x);
    }
}
