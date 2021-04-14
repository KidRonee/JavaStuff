import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Food> foodList = new ArrayList<Food>();
        Food strawberry = new Food("Strawberry",20.5f,true, Food.FoodType.CARB);
        Food raspberry = new Food("Raspberry",20.5f,true, Food.FoodType.CARB);
        Food blueberry = new Food("Blueberry",20.5f,true, Food.FoodType.CARB);
        Food chicken = new Food("Chicken",50.5f,true, Food.FoodType.PROTEIN);
        Food bacon = new Food("Bacon",70f,true, Food.FoodType.FAT);
        foodList.add(strawberry);
        foodList.add(chicken);
        foodList.add(bacon);
        //foodList.add(raspberry);
        foodList.add(blueberry);
        ArrayList<Food> allergies = new ArrayList<Food>();
        Diet lcd = new LowCarbDiet(200, "Need a change", foodList, true, 75f);
        System.out.println(lcd.isVegan);
        Diet hypercaloricDiet = new HypercaloricDiet(199, "healthy lifestyle", foodList, false, 4000f, 100f);
        Person p1 = new Person(strawberry, allergies, 100f);
        Person p2 = new Person(strawberry, allergies, 100f);
        //p1.setDiet(hypercaloricDiet);
        //System.out.println(p1.diet.purpose);
        DietManager dietManager = new DietManager();
        dietManager.areCompatible(p1, hypercaloricDiet);
        //p2.setDiet(dietManager.randomDiet(p2, foodList));
        //System.out.println(p2.diet.isVegan);
        System.out.println(hypercaloricDiet.daysDuration);
        float maxWeightKg = (float) Math.random()*80+21+ 80f;
        float minCalories = (float) (Math.floor(Math.random()*2001)+2000);
        System.out.println(Math.round(maxWeightKg));
    }
}
