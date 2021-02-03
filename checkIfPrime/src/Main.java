import java.util.ArrayList;

public class Main {

    public boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> onlyPrimes(ArrayList<Integer> numbers) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }


    public static void main (String[] args) {
        Main test = new Main();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 1000000; i++) {
            numbers.add(i);
        }
        System.out.println(test.onlyPrimes(numbers));
    }
}
