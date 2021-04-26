import java.sql.Time;
import java.util.Arrays;

public class Main {

    public static int[] race (int v1, int v2, int g) {
        int[] time = {0, 0, 0};
        int distV1 = 1;
        int distV2 = 0;
        int i = 0;
        if (v1 >= v2)
            return null;
        while(distV2 < distV1) {
            distV1 = v1 * (g+i);
            distV2 = v2 * i;
            if(time[2] == 60) {
                time[1]++;
                time[2] = 0;
            }
            if(time[1] == 60) {
                time[0]++;
                time[1] = 0;
            } else {
                time[2]++;
            }
            i++;
        }
        System.out.println(Arrays.toString(time));
        return time;
    }

    public static int[] race2 (int v1, int v2, int g) {
        int totalSecondsTaken = 0;
        int hours;
        int minutes;
        int seconds;

        if (v2 > v1 ) {
            totalSecondsTaken = (g*3600) / (v2-v1) ;
            hours = totalSecondsTaken / 3600;
            minutes = (totalSecondsTaken % 3600) / 60;
            seconds = totalSecondsTaken % 60;
        } else {
            return null;
        }
        System.out.println(Arrays.toString(new int[]{totalSecondsTaken / 3600, (totalSecondsTaken % 3600) / 60, totalSecondsTaken % 60}));
        return new int[] {hours, minutes, seconds};
    }

    public static int twiceAsOld(int dadYears, int sonYears) {
        return Math.abs((sonYears*2)-dadYears);
    }

    public static String camelCase(String str) {
        char[] ch = str.toCharArray();
        for(int i = 0; i < str.length(); i++) {
            if(ch[i] == ' ')
                ch[i+1] = Character.toUpperCase(ch[i+1]);
        }
        str = Arrays.toString(ch);
        System.out.println(str);
        return str;
    }

    public static String[] solution(String s) {
       if(s.length() % 2 == 1)
           s+="_";
       int n = s.length() / 2;
       String[] sub = new String[n];
       for(int i = 0; i < n; i++) {
           sub[i] = "" + s.charAt(i*2)+s.charAt(1+i*2);
       }
        System.out.println(n);
        return sub;
    }


    public static void main(String[] args) {

        race2(720, 850, 70);
        System.out.println(1938/3600);
        System.out.println((1938 % 3600) / 60);
        System.out.println(1938 / 60);
        System.out.println((1938 / 60) % 60);
        System.out.println(1938 % 60);
        //camelCase("hello my name is mathias.");
        wave("hello");
        System.out.println(Arrays.toString(solution("abcde")));
        System.out.println(twiceAsOld(45, 30));
        System.out.println(AbbreviateTwoWords.abbrevName3("Mathias Brevik"));
        System.out.println(HarvestFestival.plant('@', 3, 7, 20));
        System.out.println(HarvestFestival.plant3('@', 3, 7, 20));
        System.out.println(DigitRoots.digitRoot(3785));
        System.out.println(Arrays.toString(RobinsonCrusoe.crusoe(5, 0.2, 30, 1.02, 1.1)));
        System.out.println(42 * Math.tan(Math.toRadians(38)));
        System.out.println(DisemvowelTrolls.disemvowel("hello"));
        System.out.println(CheckIfPangram.check("The quick brown fox jumps over the lazy dog."));
        //System.out.println(Arrays.toString(Tribonacci.tribonacci(new double[]{1, 2, 3}, 1)));
        System.out.println(Mubling.accum("ZpglnRxqenU"));
        System.out.println(HighestAndLowest.highAndLow("1 2 5 60 -9 99"));
        System.out.println(TimeFormatter.formatDuration(3662));

    }

    //org.junit.ComparisonFailure: expected:<4 years, 6[8] days, 3 hours and 4...> but was:<4 years, 6[7] days, 3 hours and 4...>


    public static String[] wave(String str) {
        char[] ch = str.toCharArray();
        String[] result = new String[str.length()];
        if(str.length() <= 0)
            return null;
        for(int i = 0; i < str.length(); i++) {
            if(ch[i] == ',')
                i+=1;
            else
            result[i] = String.valueOf(Character.toUpperCase(ch[i]));
        }
        int i = 0;
        System.out.println(ch);
        System.out.println(Arrays.toString(result));
        return result;
    }
}
