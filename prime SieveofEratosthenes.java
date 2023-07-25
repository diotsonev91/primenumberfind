public class SieveOfEratosthenes {
    public static void sieveOfEratosthenes(int limit) {
        boolean[] primes = new boolean[limit + 1];
        Arrays.fill(primes, true);

        primes[0] = false;
        primes[1] = false;

        for (int p = 2; p * p <= limit; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    primes[i] = false;
                }
            }
        }

        // Printing the prime numbers
        for (int i = 2; i <= limit; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int limit = 30;
        System.out.println("Prime numbers up to " + limit + ":");
        sieveOfEratosthenes(limit);
    }
}
