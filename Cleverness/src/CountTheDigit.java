import java.util.stream.IntStream;

public class CountTheDigit {
    public static int nbDig(int n, int d) {
        int count = 0;
        String s = String.valueOf(d);
        for(int i = 0; i <= n; i++) {
            int square = (int) Math.pow(i, 2);
            String num = String.valueOf(square);
            for(int j = 0; j < num.length(); j++) {
                if(num.charAt(j) == s.charAt(0))
                    count++;
            }
        }
        return count;
    }

    public static int nbDigStream(int n, int d) {
        return (int) IntStream
                .rangeClosed(0, n)
                .map(i -> i * i)
                .flatMap(i -> String.valueOf(i).chars())
                .mapToObj(i -> (char)i)
                .mapToInt(Character::getNumericValue)
                .filter(i -> i == d)
                .count();
    }
}
