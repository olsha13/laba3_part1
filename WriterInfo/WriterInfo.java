package WriterInfo;

import People.*;

public class WriterInfo {
    public static void printInf(Human h)
    {
        h.print();
        System.out.println("\nСпособ обращения");
        System.out.println( h.Name());
    }

}
