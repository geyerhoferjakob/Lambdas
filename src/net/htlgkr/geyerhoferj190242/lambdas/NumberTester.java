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

    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest panlindromeTester){
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

        System.out.println(list.get(0) + " Tests");
        for (int i = 1; i < list.size(); i++) {
            System.out.println();
            switch(list.get(i)){
                case "1":
                    System.out.println("OddEvenTester");
                    if(oddTester.testNumber(Integer.parseInt(list.get(i+1)))){
                        System.out.println("EVEN");
                    }else{
                        System.out.println("ODD");
                    }
                    i++;
                    break;
                case "2":
                    System.out.println("PrimeTester");
                    if(primeTester.testNumber(Integer.parseInt(list.get(i+1)))){
                        System.out.println("Prime");
                    }else{
                        System.out.println("NotPrime");
                    }
                    i++;
                    break;
                case "3":
                    System.out.println("PalindromeTester");
                    if(primeTester.testNumber(Integer.parseInt(list.get(i+1)))){
                        System.out.println("NotPalindrome");
                    }else{
                        System.out.println("Palindrome");
                    }
                    i++;
                    break;
                default:return;
            }
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
