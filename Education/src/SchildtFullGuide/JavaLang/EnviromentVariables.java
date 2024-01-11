package SchildtFullGuide.JavaLang;

public class EnviromentVariables {
    public static void main(String[] args) {
        System.out.println("file.separator: " + System.getProperty("file.separator"));
        System.out.println("java.class.path: " + System.getProperty("java.class.path"));
        System.out.println("java.class.version: " + System.getProperty("java.class.version"));
        System.out.println("java.compiler: " + System.getProperty("java.compiler"));
        // еще дофига всякой хрени, см. Герберт Шилдт руководство для чайников сттр 598
        System.out.println("os.arch: " + System.getProperty("os.arch"));
        System.out.println("os.name: " + System.getProperty("os.name"));
        System.out.println("os.version: " + System.getProperty("os.version"));
        System.out.println("user.dir: " + System.getProperty("user.dir"));
        System.out.println("user.home: " + System.getProperty("user.home"));
        System.out.println("user.name: " + System.getProperty("user.name"));
    }
}
