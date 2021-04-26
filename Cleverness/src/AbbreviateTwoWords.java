public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] nameArr = name.split(" ");
        String firstNameInitial = nameArr[0];
        String lastNameInitial = nameArr[1];
        return (firstNameInitial.charAt(0) + "." + lastNameInitial.charAt(0)).toUpperCase();
    }

    public static String abbrevName2(String name) {
        String[] nameArr = name.split(" ");
        return (nameArr[0].charAt(0) + "." + nameArr[1].charAt(0)).toUpperCase();
    }

    public static String abbrevName3(String name) {
       return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
       // (.) = 1 character (remember it as group 1)
       // .*\\s = some more characters, and a space
       // (.) = 1 character (remember it as group 2)
       // .* = some more characters
       // and replace with "$1.$2"
       // $1 = the 1st group (which was 1 char)
       // . = 1 dot
       // $2 = the 2nd group (which was 1 char)
    }
}
