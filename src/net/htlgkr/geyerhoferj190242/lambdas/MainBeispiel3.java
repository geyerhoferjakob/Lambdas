package net.htlgkr.geyerhoferj190242.lambdas;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class MainBeispiel3 {
    public static void main(String[] args) {
        CalculationOperation add = (n,m)->{
            double number1 = n.getA() + m.getA();
            double number2 = n.getB() + m.getB();
            Number number = new Number();
            number.setA(number1);
            number.setB(number2);
            return number;
        };

        CalculationOperation subtract = (n,m)->{
            double number1 = n.getA() - m.getA();
            double number2 = n.getB() - m.getB();
            Number number = new Number();
            number.setA(number1);
            number.setB(number2);
            return number;
        };

        CalculationOperation multiply = (n,m)->{
            double number1 = n.getA() * m.getB();
            double number2 = m.getA()* n.getB();
            Number number = new Number();
            number.setA(number1);
            number.setB(number2);
            return number;
        };

        CalculationOperation divide = (n,m)->{
            double number1 = n.getA() * n.getB();
            double number2 = m.getA() * m.getB();
            Number number = new Number();
            number.setA(number1);
            number.setB(number2);
            return number;
        };

        VektorCalculator vektorCalculator = new VektorCalculator(add,subtract,multiply,divide);
        String auswahl = "";
        Scanner s = new Scanner(System.in);
        do{
            auswahl = menue1();
            switch (auswahl){
                case "1":
                    Number[] numbers = menue3();
                    Number sol;
                    switch (menue2()){
                        case "1":
                            sol = vektorCalculator.add(numbers[0], numbers[1]);
                            System.out.println("[" + sol.getA() + " | " + sol.getB() +"]");
                            break;
                        case "2":
                            sol = vektorCalculator.subtract(numbers[0],numbers[1]);
                            System.out.println("[" + sol.getA() + " | " + sol.getB() +"]");
                            break;
                        case "3":
                            sol = vektorCalculator.multiply(numbers[0],numbers[1]);
                            System.out.println("[" + sol.getA() + " | " + sol.getB() +"]");
                            break;
                        case "4":
                            sol = vektorCalculator.divide(numbers[0],numbers[1]);
                            System.out.println("[" + sol.getA() + " | " + sol.getB() +"]");
                            break;
                        default:
                            System.out.println("Error");
                    }

                    break;
                case "4":
                    return;
                default:
                    System.out.println("Falsche Eingabe");;


            }
        }while(auswahl!="4");
    }

    private static String menue1(){
        Scanner s = new Scanner(System.in);
        System.out.println("1...VektorCalculator");
        System.out.println("4...Exit");
        return s.nextLine();
    }

    private static String menue2(){
        Scanner s = new Scanner(System.in);
        System.out.println("Choose Option:");
        System.out.println("1...Add");
        System.out.println("2...Subtract");
        System.out.println("3...Multiply");
        System.out.println("4...Divide");
        return  s.nextLine();
    }

    private static Number[] menue3(){
        Scanner s = new Scanner(System.in);

        String a;String b;String c;String d;

        System.out.println("Enter number x a>");
        a = s.nextLine();
        System.out.println("Enter number x b>");
        b = s.nextLine();
        System.out.println("Enter number y a>");
        c = s.nextLine();
        System.out.println("Enter number y b>");
        d = s.nextLine();

        Number vektor1 = new Number();
        vektor1.setA(Double.parseDouble(a));
        vektor1.setB(Double.parseDouble(b));

        Number vektor2 = new Number();
        vektor2.setA(Double.parseDouble(c));
        vektor2.setB(Double.parseDouble(d));

        Number vektoren[] = new Number[2];
        vektoren[0] = vektor1;
        vektoren[1] = vektor2;

        return vektoren;
    }
}
