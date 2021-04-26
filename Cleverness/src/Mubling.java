public class Mubling {
    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(i == 0) {
                sb.append(s.toUpperCase().charAt(i));
            }
            else {
                sb.append(s.toUpperCase().charAt(i));
                sb.append(String.valueOf(s.toLowerCase().charAt(i)).repeat(i));
            }
            if(i != s.length()-1)
                sb.append("-");
        }
        return sb.toString();
    }
}
