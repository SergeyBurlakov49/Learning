package Enumerations;

public class EnumsDemo {
    public static void main(String[] args) {
        TextColors [] textColors = TextColors.values();
        for (TextColors textColor:textColors){
            System.out.print(textColor.getCode() + textColor.name() + " ");
        }
        BackgroundColors [] backgroundColors = BackgroundColors.values();
        for (BackgroundColors backgroundColor: backgroundColors ){
            System.out.print(backgroundColor.getCode() + backgroundColor.name() + " ");
        }
    }
}
