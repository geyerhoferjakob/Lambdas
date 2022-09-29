package net.htlgkr.geyerhoferj190242.lambdas;

public class VektorCalculator extends AbstractCalculator {

    public VektorCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        return super.add.cale(a,b);
    }

    @Override
    public Number subtract(Number a, Number b) {
        double number1 = a.getA() - b.getA();
        double number2 = a.getB() - b.getB();
        Number number = new Number();
        number.setA(number1);
        number.setB(number2);
        return number;
    }

    @Override
    public Number multiply(Number a, Number b) {
        return null;
    }

    @Override
    public Number divide(Number a, Number b) {
        return null;
    }
}
