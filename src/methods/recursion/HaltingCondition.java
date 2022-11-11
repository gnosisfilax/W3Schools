package methods.recursion;
/*
The halting condition for this recursive function is when end is not greater than start.
 */
public class HaltingCondition {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
