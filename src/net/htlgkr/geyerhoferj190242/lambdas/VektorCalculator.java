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
        return super.subtract.cale(a,b);
    }

    @Override
    public Number multiply(Number a, Number b) {
        return super.multiply.cale(a,b);
    }

    @Override
    public Number divide(Number a, Number b) {
        return super.divide.cale(a,b);
    }
}
