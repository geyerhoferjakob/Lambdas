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
            System.out.println(s);
        }
    }

}
