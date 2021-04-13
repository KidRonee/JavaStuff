import java.util.ArrayList;

public class LowCarbDiet extends Diet{

    private Float minWeightKg;

    public LowCarbDiet(int daysDuration, String purpose, ArrayList<Food> allowedFood, boolean isVegan, Float minWeightKg) {
        super(daysDuration, purpose, allowedFood, isVegan);
        this.minWeightKg = minWeightKg;
        this.purpose = "Intended mostly to loose weight";
        this.isVegan = checkIfVegan();

        if (tooManyCarbTypes()){
            throw new IllegalArgumentException("There is too many carb type foods for a low carb diet!");
        }
    }

    private boolean tooManyCarbTypes() {
        int count = 0;
        for (Food food : allowedFood) {
            if (food.getType().equals(Food.FoodType.CARB))
                count++;
        }
        return count > 2;
    }

    public Float getMinWeightKg() {
        return minWeightKg;
    }

    public void setMinWeightKg(Float minWeightKg) {
        this.minWeightKg = minWeightKg;
    }

    @Override
    public String writeDuration() {
        return String.format("This Low-Carb diet lasts for: %s", daysDuration);
    }

    @Override
    public String writeAllowedFood() {
        return String.format("The following food is allowed in this Low-Carb diet: %s", printAllowedFood());
    }

}

