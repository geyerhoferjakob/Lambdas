package net.htlgkr.geyerhoferj190242.lambdas;

public class Main {

    public static void main(String[] args) {
	    HalloJavaMitForEach hjmfe = new HalloJavaMitForEach();
        hjmfe.showList();
        NumberTester numberTester = new NumberTester("Textdokument.csv");
        numberTester.testFile();
    }
}
