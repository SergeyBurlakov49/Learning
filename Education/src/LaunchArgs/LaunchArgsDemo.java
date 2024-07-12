package LaunchArgs;

import java.util.List;

public class LaunchArgsDemo {
    public static void main(String[] args) {
        List.of(args).forEach(System.out::println);
    }
}
