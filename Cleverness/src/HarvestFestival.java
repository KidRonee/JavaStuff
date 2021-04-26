public class HarvestFestival {
    public static String plant(char seed, int water, int fert, int temp) {
        return 20 <= temp && temp <= 30 ? ("-".repeat(water) + Character.toString(seed).repeat(fert)).repeat(water) : "-".repeat(water*water) + seed;
    }

    public static String plant2(char seed, int water, int fert, int temp) {
        StringBuilder stringBuilder = new StringBuilder();
        if (temp<20 || temp >30 ) {
            stringBuilder.append("-".repeat(water*water)).append(seed);
        } else {
            for (int i = 0; i < water; i++) {
                stringBuilder.append("-".repeat(water)).append(String.valueOf(seed).repeat(fert));
            }
        }
        return String.valueOf(stringBuilder);
    }

    public static String plant3(char seed, int water, int fert, int temp) {
        if(temp < 20 || temp > 30)
            return "-".repeat(water) + seed;
                // repeats stem times water + seed times fertilizer and then repeats those combines times water
        return ("-".repeat(water) + Character.toString(seed).repeat(fert)).repeat(water);
    }
}
