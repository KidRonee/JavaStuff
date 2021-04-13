public class Food {
    private String name;
    private Float caloriesPer100g;
    private boolean isVegan;
    private FoodType type;

    enum FoodType{
        RECIPE,
        PROTEIN,
        CARB,
        FAT
    }

    public Food(String name, Float caloriesPer100g, Boolean isVegan, FoodType foodType) {
        this.name = name;
        this.caloriesPer100g = caloriesPer100g;
        this.isVegan = isVegan;
        this.type = foodType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCaloriesPer100g() {
        return caloriesPer100g;
    }

    public void setCaloriesPer100g(Float caloriesPer100g) {
        this.caloriesPer100g = caloriesPer100g;
    }

    public Boolean isVegan() {
        return isVegan;
    }

    public void setVegan(Boolean vegan) {
        isVegan = vegan;
    }

    public FoodType getType() {
        return type;
    }

    public void setType(FoodType type) {
        this.type = type;
    }
}
