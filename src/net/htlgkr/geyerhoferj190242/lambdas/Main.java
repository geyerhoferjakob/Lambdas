package net.htlgkr.geyerhoferj190242.lambdas;

public class Main {

    public static void main(String[] args) {
	    HalloJavaMitForEach hjmfe = new HalloJavaMitForEach();
        hjmfe.showList();
        NumberTester numberTester = new NumberTester("Textdokument.csv");

        numberTester.setOddEvenTester((n) -> (n%2) == 0);
        numberTester.setPrimeTester((n) ->
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
        });
        numberTester.setPalindromeTester((n) -> {
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
        });
        numberTester.testFile();
    }
}
