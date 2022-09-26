package net.htlgkr.geyerhoferj190242.lambdas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberTester {
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;

    private String fileName;
    public NumberTester(String fileName){
        this.fileName = fileName;
    }

    public void settOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPaindromeTester(NumberTest panlindromeTester){
        this.palindromeTester = panlindromeTester;
    }


    public void testFile(){
        File file = new File(fileName);
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner s = new Scanner(new FileReader(file));
            while(s.hasNextLine()){
                String[] value = s.nextLine().split("\t");
                list.add(value[0]);
                if(value.length == 2 && value[1]!=null && !value[1].equals(" ")){
                    list.add(value[1]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public NumberTest getOddTester() {
        return oddTester;
    }

    public NumberTest getPrimeTester() {
        return primeTester;
    }

    public NumberTest getPalindromeTester() {
        return palindromeTester;
    }
}
