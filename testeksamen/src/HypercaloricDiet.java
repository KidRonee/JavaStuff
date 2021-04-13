import java.util.ArrayList;

public class HypercaloricDiet extends Diet{
    private Float maxWeightKg;
    private Float minCaloriesPerDay;

    public HypercaloricDiet(int daysDuration, String purpose, ArrayList<Food> allowedFood, boolean isVegan, Float minCaloriesPerDay, Float maxWeightKg) {
        super(daysDuration, purpose, allowedFood, isVegan);
        this.maxWeightKg = maxWeightKg;
        this.minCaloriesPerDay = minCaloriesPerDay;
        this.isVegan = checkIfVegan();
    }

    public Float getMaxWeightKg() {
        return maxWeightKg;
    }

    public void setMaxWeightKg(Float maxWeightKg) {
        this.maxWeightKg = maxWeightKg;
    }
    public Float getMinCaloriesPerDay() {
        return minCaloriesPerDay;
    }


    public void setMinCaloriesPerDay(Float minCaloriesPerDay) {
        this.minCaloriesPerDay = minCaloriesPerDay;
    }

    @Override
    public String writeDuration() {
        return String.format("This Hyper Caloric Diet lasts for: %s", daysDuration);
    }

    @Override
    public String writeAllowedFood() {
        return String.format("The following food is allowed in this Hyper Caloric Diet:\n%s", printAllowedFood());
    }

}
