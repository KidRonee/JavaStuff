import java.util.ArrayList;

public class VeganDiet extends Diet {
    private Float minWeightKg;

    public VeganDiet(int daysDuration, String purpose, ArrayList<Food> allowedFood, boolean isVegan, Float minWeightKg) {
        super(daysDuration, purpose, allowedFood, isVegan);
        this.minWeightKg = minWeightKg;
        this.isVegan = checkIfVegan();
        if (!this.isVegan){
            throw new IllegalArgumentException("This diet is not vegan");
        }
    }

    public Float getMinWeightKg(){
        return minWeightKg;
    }

    public void setMinWeightKg (Float minWeightKg){
        this.minWeightKg = minWeightKg;
    }

    @Override
    public String writeDuration() {
        return String.format("This vegan diet lasts for: %s", daysDuration);
    }

    @Override
    public String writeAllowedFood() {
        return String.format("The following food is allowed in this Vegan diet: %s", printAllowedFood());
    }
}
