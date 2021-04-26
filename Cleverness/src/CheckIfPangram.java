public class CheckIfPangram {
    public static boolean check(String sentence) {
        int i = 0;
        for (char c : sentence.toCharArray()) {
            int x = Character.toUpperCase(c);
            if (x >= 'A' && x <= 'Z') {
                i |= 1 << (x - 'A');
            }
        }
        return i == (1 << (1 + 'Z' - 'A')) - 1;
    }
}
