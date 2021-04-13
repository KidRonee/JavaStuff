import java.util.ArrayList;

public class FlexitarianDiet extends Diet{
    private Float maxMeatGramsPerWeek;
    private Food preferredMeat;

    public FlexitarianDiet(int daysDuration, String purpose, ArrayList<Food> allowedFood, boolean isVegan, Float maxMeatGramsPerWeek, Food preferredMeat) {
        super(daysDuration, purpose, allowedFood, isVegan);
        this.maxMeatGramsPerWeek = maxMeatGramsPerWeek;
        this.preferredMeat = preferredMeat;
        this.isVegan = checkIfVegan();
        if(!validatePreferredMeat()) {
            throw new IllegalArgumentException("Preferred meat must be of food type PROTEIN!");
        }
    }


    public boolean validatePreferredMeat() {
        return preferredMeat.getType().equals(Food.FoodType.PROTEIN);
    }

    @Override
    public String writeDuration() {
        return String.format("This Flexitarian diet lasts for: %s", daysDuration);
    }


    @Override
    public String writeAllowedFood() {
        return String.format("The following food is allowed in this Flexitarian diet:\n%s", printAllowedFood());
    }

    public Float getMaxMeatGramsPerWeek() {
        return maxMeatGramsPerWeek;
    }

    public void setMaxMeatGramsPerWeek(Float maxMeatGramsPerWeek) {
        this.maxMeatGramsPerWeek = maxMeatGramsPerWeek;
    }

    public Food getPreferredMeat() {
        return preferredMeat;
    }

    public void setPreferredMeat(Food preferredMeat) {
        this.preferredMeat = preferredMeat;
    }

}
