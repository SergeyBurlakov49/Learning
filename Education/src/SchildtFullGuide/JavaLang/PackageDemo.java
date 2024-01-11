package SchildtFullGuide.JavaLang;

public class PackageDemo {
    public static void main(String[] args) {
        Package [] packages = Package.getPackages();
        for (Package pckage:packages) System.out.println(pckage.getImplementationTitle() + " "
                                                         + pckage.getImplementationVendor() + " "
                                                         + pckage.getImplementationVersion());
    }
}
