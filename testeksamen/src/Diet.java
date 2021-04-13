import java.util.ArrayList;

public abstract class Diet {
    int daysDuration;
    String purpose;
    ArrayList<Food> allowedFood;
    boolean isVegan;

    public Diet(int daysDuration, String purpose, ArrayList<Food> allowedFood, boolean isVegan) {
        this.daysDuration = daysDuration;
        this.purpose = purpose;
        this.allowedFood = allowedFood;
        this.isVegan = isVegan;
    }

    public abstract String writeDuration();
    public abstract String writeAllowedFood();

    public boolean checkIfVegan(){
        int veganCount = 0;
        if (isVegan){
            for (Food food : allowedFood) {
                if (!food.isVegan())
                    return false;
            }
        }
        for (Food food: allowedFood) {
            if(!food.isVegan())
                veganCount++;
        }
        if (veganCount == 0)
            return true;
        return false;
    }

    public int getDaysDuration() {
        return daysDuration;
    }

    public void setDaysDuration(int daysDuration) {
        this.daysDuration = daysDuration;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public ArrayList<Food> getAllowedFood() {
        return allowedFood;
    }

    public void setAllowedFood(ArrayList<Food> allowedFood) {
        this.allowedFood = allowedFood;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public String printAllowedFood() {
        StringBuilder foods = new StringBuilder();
        for (Food food: allowedFood) {
            if(allowedFood.indexOf(food) == allowedFood.size()-1) {
                foods.append(food.getName());
            } else
                foods.append(food.getName()).append("\n");
        }
        return String.format("%s", foods);
    }
}
