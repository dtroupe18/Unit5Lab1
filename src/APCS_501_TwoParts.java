/**
 * Created by Dave on 1/19/17.
 */
class APCS_501_TwoParts {

    public static void main(String[] args) {

        System.out.println("1 factorial: " + factorial(1));
        System.out.println("3 factorial: " + factorial(3));
        System.out.println("25 factorial: " + factorial(25));
        System.out.println("30 factorial: " + factorial(30));

        System.out.println("GCD(12, 8): " + gcd(12, 8));
        System.out.println("GCD(12, 8): " + gcd(35, 12));
        System.out.println("GCD(12, 8): " + gcd(21, 7));

        System.out.println(factorialWithStackTrace(3));
    }

    public static int factorial(int value) {
        if (value == 1)
            return 1;
        else
           return  value * factorial(value - 1);
    }

    public static int gcd(int a, int b) {

        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }


    public static int factorialWithStackTrace(int a) {

        if (a == 1) {
            System.out.println("we know the result for 1, returning 1");
            return 1;
        }
        else {
            System.out.println("we don't know the result, calling for " + (a-1));
            int temp = factorialWithStackTrace(a - 1) + 1;
            System.out.println("Found the result for " + (a-1) +
                    ", calculating the result for " + temp);
            return a * factorialWithStackTrace(a - 1);
        }

    }




}
