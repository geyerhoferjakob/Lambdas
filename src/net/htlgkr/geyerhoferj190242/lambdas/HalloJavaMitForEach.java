package net.htlgkr.geyerhoferj190242.lambdas;


import java.util.ArrayList;
import java.util.List;

public class HalloJavaMitForEach {
    List<String> stringList = new ArrayList<>();
    public HalloJavaMitForEach(){
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
    }

    public void showList(){
        System.out.println("Erste Variante:");
        for (String s : stringList) {
            System.out.print(s);
        }

        System.out.println("\nZweite Variante:");
        stringList.forEach((String s) -> System.out.print(s));

        System.out.println("\nDritte Variante:");
        stringList.forEach(System.out::print);
        System.out.println("\n\n");
    }
}
