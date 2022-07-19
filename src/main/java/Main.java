import java.util.function.IntUnaryOperator;

public class Main {
    /*
    Write a lambda expression that takes an integer and returns the next odd number.
    The expression should be public and static.
     */
	// write the nextOddNum here
    @FunctionalInterface
    interface NextOddNum {
        int applyAsInt(int n);
    }

    public static NextOddNum nextOddNum = (int n) -> (n % 2 == 0) ? n + 1 : n + 2;

    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;

        System.out.println(nextOddNum.applyAsInt(num)); // 7
        System.out.println(nextOddNum.applyAsInt(num2)); // 11
    }
}
