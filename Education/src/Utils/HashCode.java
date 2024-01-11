package Utils;

public class HashCode {

    public static int getHashCode(Object ... objects){
        int hashCode = 0;
        int magicNumber = (int) Math.round(Math.pow(Integer.MAX_VALUE, (1. / (double) objects.length)));
        for (int i = 0; i < objects.length; i++) hashCode += (int) ((objects[i].hashCode() % magicNumber) * Math.pow(magicNumber, i));
        return hashCode;
    }

}
