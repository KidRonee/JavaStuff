public class RemoveChars {

    public static String remove(String str) {
        return str.substring(1, str.length()-1);
    }

    public static String remove2(String str) {
        return str.replaceAll("^.|.$", "");
        // ^ Finds regex that must match at the beginning of the line
        // . Matches any character
        // $ Finds regex that must match at the end of the line.
        // | or
        // ^.|.$ the first part ^. finds the first char and replace it with empty String (replaceAll method)
        // the second part (|.$) means find the last char and replace it with empty "" (replaceAll function)
    }
}
