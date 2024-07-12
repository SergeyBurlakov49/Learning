package SchildtFullGuide.Files;


import java.io.File;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

/** Я скипнул большую часть 21 главы, потому что там мало че интересного */

public class FilesTest {
    public static void main(String[] args) {
        File c = new File("C:/");
        Stream.of(c.listFiles()).filter(file -> !file.getName().contains(".")).forEach(file -> System.out.println(file.getName()));
    }

}
