package SchildtCp10.FIS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIS {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:/Java/Education/src/SchildtCp10/FIS/file.txt");
            byte [] data = new byte[1024];
            int i = fileInputStream.read(data);
            for (int x = 0; x < i; x++){
                System.out.print((char) data[x]);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
