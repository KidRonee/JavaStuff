import java.util.Arrays;

public class Methods {


    // returns a copy of the first numbers (n) of the original array
    static int[] take(int[] arr, int n) {
        return n > arr.length ? arr : Arrays.copyOf(arr, n);
    }

    // implement a function likes :: [String] -> String
    // likes {} // must be "no one likes this"
    //likes {"Peter"} // must be "Peter likes this"
    //likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
    //likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
    //likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
    public static String whoLikesIt(String... names) {
        switch(names.length) {
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this", names[0]);
            case 2: return String.format("%s and %s like this", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }


}
