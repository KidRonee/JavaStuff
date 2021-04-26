import java.util.ArrayList;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        int y = seconds / 31556952;
        int d = (seconds % 31556952 ) / 86400;
        int h = (seconds % 86400) / 3600;
        int m = (seconds % 3600) / 60;
        int s = seconds % 60;

        String year, day, hour, min, sec;
        ArrayList<String> arrList = new ArrayList<>();

        if(y > 0) {
             year = y > 1 ? String.format("%d years", y) : String.format("%d year", y);
             arrList.add(year);
        }
        if(d > 0) {
             day = d > 1 ? String.format("%d days", d) : String.format("%d day", d);
             arrList.add(day);
        }
        if(h > 0) {
             hour = h > 1 ? String.format("%d hours", h) : String.format("%d hour", h);
             arrList.add(hour);
        }
        if(m > 0) {
             min = m > 1 ? String.format("%d minutes", m) : String.format("%d minute", m);
             arrList.add(min);
        }
        if(s > 0) {
             sec = s > 1 ? String.format("%d seconds", s) : String.format("%d second", s);
             arrList.add(sec);
        }
        return buildFormat(arrList).toString();
    }

    public static StringBuilder buildFormat(ArrayList<String> arrList) {
        StringBuilder formattedString = new StringBuilder();
        switch (arrList.size()) {
            case 1 -> formattedString.append(arrList.get(0));
            case 2 -> formattedString.append(arrList.get(0))
                    .append(" and")
                    .append(arrList.get(1));
            case 3 -> formattedString.append(arrList.get(0))
                    .append(", ")
                    .append(arrList.get(1))
                    .append(" and ")
                    .append(arrList.get(2));
            case 4 -> formattedString.append(arrList.get(0))
                    .append(", ").append(arrList.get(1))
                    .append(", ").append(arrList.get(2))
                    .append(" and ")
                    .append(arrList.get(3));
            case 5 -> formattedString.append(arrList.get(0))
                    .append(", ")
                    .append(arrList.get(1))
                    .append(", ").append(arrList.get(2))
                    .append(", ").append(arrList.get(3))
                    .append(" and ")
                    .append(arrList.get(4));
            default -> formattedString.append("now");
        }
        return formattedString;
    }
}
