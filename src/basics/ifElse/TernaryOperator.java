package basics.ifElse;

public class TernaryOperator {
    public static void main(String[] args) {
        // variable = (condition) ? expressionTrue : expressionFalse;
        int time = 20;
       String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
