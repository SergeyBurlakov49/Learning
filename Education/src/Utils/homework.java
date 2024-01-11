package Utils;

public class homework {
    public static void main(String[] args) {
        String [][] arr = new String[2][35];
        for (int i = 0; i < 35; i++){
            arr[0][i] = getNum(i);
            arr[1][i] = getNum(((i % 7) * 5) + (i / 7));
            System.out.println(new StringBuffer(arr[0][i]).reverse() + " -> " + arr[1][i]);
        }
    }

    public static String getNum(int x){
        String s = switch (x / 7) {
            case 0 -> "b";
            case 1 -> "c";
            case 2 -> "d";
            case 3 -> "e";
            case 4 -> "f";
            default -> throw new IllegalArgumentException("Wrong Number");
        };
        s = s.concat(Integer.toString(x % 7));
        return s;
    }
}