import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.function.Function;

public class MovesinSquaredStrings {

    public static String vertMirror (String str) {
        return split(str).stream().map(s -> reverse(s)).collect(Collectors.joining("\n"));
    }
    public static String horMirror (String s) {
        return reverse(split(s)).stream().collect(Collectors.joining("\n"));
    }
    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
    private static List<String> split(String s) {
        return Arrays.asList(s.split(" "));
    }
    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    private static List<String> reverse(List<String> elements) {
        Collections.reverse(elements);
        return elements;
    }
}
