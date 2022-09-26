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

        System.out.println(list.get(0) + " Tests" + "\n");
        for (int i = 1; i < list.size(); i++) {
            switch(list.get(i)){
                case "1":
                    System.out.println("OddEvenTester");
                    NumberTest isEven = (n) -> (n%2) == 0;
                    setOddEvenTester(isEven);
                    System.out.println();
                    i++;
                    break;
                case "2":
                    System.out.println("PrimeTester");
                    NumberTest isPrime = (n) ->
                    {
                        if(n<=2){
                            return false;
                        }
                        for (int j = 2; j < n; j++) {
                            if(n % j == 0){
                                return false;
                            }
                        }
                        return true;
                    };
                    i++;
                    break;
                case "3":
                    System.out.println("PalindromeTester");
                    NumberTest isPalindrome = (n) -> {
                        String valueN = Integer.toString(n);
                        if(valueN.length() < 1){
                            return true;
                        }
                        for (int j = 0; j < valueN.length(); j++) {
                            if(valueN.charAt(j) == valueN.charAt(valueN.length()-j)) {
                                continue;
                            }else{
                                return false;
                            }
                        }
                        return false;
                    };
                    i++;
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
