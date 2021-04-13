import java.util.ArrayList;

public class Person extends DietManager{
    private Food favoriteFood;
    private ArrayList<Food> allergies;
    private Diet diet;
    private Float weight;

    public Person(Food favoriteFood, ArrayList<Food> allergies, Float weight) {
        this.favoriteFood = favoriteFood;
        this.allergies = allergies;
        this.weight = weight;
    }

    public Person(Food favoriteFood, ArrayList<Food> allergies, Float weight, Diet diet) {
        this.favoriteFood = favoriteFood;
        this.allergies = allergies;
        this.diet = diet;
        this.weight = weight;

        if (diet instanceof VeganDiet && !favoriteFood.isVegan()) {
            throw new IllegalArgumentException("If their favorite food is not vegan, their diet can't be vegan");
        }

        if (checkIfAllergic()) {
            throw new IllegalArgumentException("More than 50% of diet consists of allergic foods");
        }

    }

    private boolean checkIfAllergic() {
        double allergyMismatch = 0;
        for (Food food : diet.allowedFood) {
            for (Food allergy : allergies) {
                if (allergy.getName().equals(food.getName())) {
                    allergyMismatch++;
                }
            }
        }
        return allergyMismatch / diet.allowedFood.size() >= 0.5;
    }

    public Food getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(Food favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public ArrayList<Food> getAllergies() {
        return allergies;
    }

    public void setAllergies(ArrayList<Food> allergies) {
        this.allergies = allergies;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        if (diet instanceof VeganDiet && this.weight < ((VeganDiet) diet).getMinWeightKg())
            throw new IllegalArgumentException("This person doesn't meet the diet's requirements");
        if (diet instanceof LowCarbDiet && this.weight < ((LowCarbDiet) diet).getMinWeightKg())
            throw new IllegalArgumentException("This person doesn't meet the diet's requirements");
        if (diet instanceof HypercaloricDiet && this.weight > ((HypercaloricDiet) diet).getMaxWeightKg())
            throw new IllegalArgumentException("This person doesn't meet the diet's requirements");
        else
            this.diet = diet;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
}
