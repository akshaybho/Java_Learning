package practice_questions.functional;

public class PrimeChecker {

    public static void main(String[] args) {

        Prime isPrime = n -> {
            if (n < 2) return false;
            for (int i = 2; i < n; i++){
                if (n % i == 0) return false;
        }
            return true;
        };

        System.out.println(isPrime.check(11));
    }
}
