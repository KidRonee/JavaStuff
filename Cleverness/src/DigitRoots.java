public class DigitRoots {
    public static int digitRoot(int n) {
        while(n > 10) {
            n = n % 10;
        }
        return n;
    }
}
