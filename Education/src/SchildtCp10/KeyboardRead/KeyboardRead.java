package SchildtCp10.KeyboardRead;

import java.io.IOException;

public class KeyboardRead {

    public static void main(String[] args) throws IOException {
        byte [] data = new byte[1024];
        int i = System.in.read(data);
        System.out.println(i);
        for (int i1 = 0; i1 < (i - 1); i1++){
            System.out.print((char) data[i1]);
        }
    }

}
