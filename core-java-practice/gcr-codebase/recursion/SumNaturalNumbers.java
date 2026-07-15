package recursion;

public class SumNaturalNumbers {

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;

        int result = sum(number);

        System.out.println(result);
    }
}
