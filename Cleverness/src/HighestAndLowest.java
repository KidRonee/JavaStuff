import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();
        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);

    }
}
