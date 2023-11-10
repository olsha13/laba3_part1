import People.*;
import WriterInfo.WriterInfo;

public class Main
{
    public static void main(String[] args) {
        Child child = new Child();
        WriterInfo.printInf(child);

        Teenager teen = new Teenager();
        WriterInfo.printInf(teen);

        Parent parent = new Parent();
        WriterInfo.printInf(parent);


    }
}