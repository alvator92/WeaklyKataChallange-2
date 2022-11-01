package start.solutions;

public class Prime {
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        int sqrt = (int)Math.sqrt(num);
        if (sqrt == 0) {
            return false;
        }
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
