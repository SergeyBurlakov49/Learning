package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReadLine {

    public static String consoleReadLine() throws IOException {
        return (new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

}
