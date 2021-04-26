public class KeepUpTheHoop {
    public static String hoopCount(int n) {
        return n >= 10 ? "Great, now move on to tricks" : "Keep at it until you get it";
    }

    public static String hoopCount2(int n) {
        if(n >= 10)
            return "Great, now move on to tricks";
        return "Keep at it until you get it";
    }
}
