import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;

import static java.lang.String.format;
import static java.lang.String.join;
import static java.lang.System.out;

public class Assignment {
    /**
     * Returns the sum of all the received numbers.
     */
    public int addThreeNumbers(int i, int j, int k) {
        int sum = i+j+k;
        return sum;
    }

    /**
     * Evaluates if the received number is
     * Small (less than 100).
     * Big (greater than 1000).
     * Medium (not small or big)
     */
    public String isNumberSmallMediumOrBig(int number) {
        if(number < 100) {
            return "Small";
        } else if (number > 1000) {
            return "Big";
        } else {
            return "Medium";
        }
    }

    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     */
    public void printAllStrings(String[] strings){
        out.println(String.join("",strings));
    }

    /**
     * Returns the sum of all numbers in received array.
     */
    public int arraySum(int[] numbers){
        int sum = 0;
        for (int i: numbers) {
            sum += i;
        }
        return sum;
    }

    /**
     * Print all characters until a char is "."
     * Do not print in separate lines.
     */
    public void printFirstSentence(char[] chars) {
        int i = 0;
        while (true) {
            System.out.print(chars[i]);
            if (chars[i] == '.') { break; }
            i++;
        }

        /*
        for (char aChar : chars) {
            System.out.print(aChar);
            if (aChar == '.') {
                break;
           }
        }
         */

       /* Does same as the one above
        for (int i = 0; i < chars.length; i++) {
           System.out.print(chars[i]);
            if (chars[i] == '.') {
                break;
            }
        }
       */
   }

    /**
     * Prints course name for provided course code.
     * PGR103 -> Objektorientert programmering
     * DB1102 -> Database
     * TK2100 -> Informasjonssikkerhet
     * or "Uknown" if none of the above.
     */
    public void printCourseName(String courseCode){

        switch (courseCode) {
            case "PGR103":
                System.out.println("Objektorientert programmering");
                break;
            case "DB1102":
                System.out.println("Database");
                break;
            case "TK2100":
                System.out.println("Informasjonssikkerhet");
                break;
            default:
                System.out.println("Unknown");
        }
    }

    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     * But only if the String is not exactly "Corona".
     */
    public void printAllStringsNotCorona(String[] strings){
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != "Corona") {
                System.out.println(strings[i]);
            }
        }
    }

    /**
     * Prints the provided strings in upper case letters.
     * One String on each line.
     */
    public void printUpperCaseStrings(String[] strings){

        for (String s: strings) {
            System.out.println(s.toUpperCase());

        }
        //String newString = Arrays.toString(strings).replace("[","").replace("]", "").replace(", ", "");
        //System.out.println(newString.toUpperCase());
    }

    /**
     * Returns true if provided color is represented in the Norwegian flag.
     * Color input is lowercase only.
     */
    public boolean isColorInNorwegianFlag(String color){
        color.toLowerCase();
        if (color == "red" || color == "blue" || color == "white") {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the index of the first occurrence of char c in String string.
     * Returns -1 if char is not found.
     */
    public int firstOccurrence(String string, char c){
        return string.indexOf(c);
    }

    /**
     * Returns the combined length of the provided Strings.
     */
    public int combinedLength(String s1, String s2){
        int length = s1.length() + s2.length();
        return length ;
    }

    /**
     * Returns the sum of all the received numbers.
     */
    public int addNumbers(int... numbers){
        return Arrays.stream(numbers).sum();
    }

    /**
     * Prints all Strings in received array to standard output.
     * One String on each line.
     * But only if the String is not Corona (case insensitive).
     */
    public void printAllStringsNotCoronaCaseInsensitive(String[] strings){
        //String corona = Arrays.toString(strings).toLowerCase();
        String printString = "";
        for (int i = 0; i < strings.length; i++) {

            if (strings[i].toLowerCase().contains("corona")) {
                strings[i] = "";
            } else {
                printString += strings[i];
            }
        }
        System.out.println(printString);

    }

}
