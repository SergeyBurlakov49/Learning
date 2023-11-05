package SchildtCp10.FIS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIS {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:/Java/Education/src/SchildtCp10/FIS/file.txt");
             FileOutputStream fos = new FileOutputStream("C:/Java/Education/src/SchildtCp10/FIS/file2.txt")) {
            byte [] data = new byte[12];
            int i = 0;
            while (i > -1){
                i = fis.read(data);
                if (i != -1)fos.write(data);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
