import java.util.ArrayList;
import java.util.Random;

public class DietManager {

     public Boolean areCompatible(Person person, Diet diet) {
          if (!person.getFavoriteFood().isVegan() && diet instanceof VeganDiet) {
               System.out.println("This person's favorite food is non-vegan and can therefore not follow a vegan diet!");
               return false;
          }
          new Person(person.getFavoriteFood(), person.getAllergies(), person.getWeight()).setDiet(diet);
          System.out.println("This person is compatible with this diet");
          return true;

     }

     public  HypercaloricDiet randomDiet(Person person, ArrayList<Food> foodList) {
          Random randomCalories = new Random();
          Random randomWeight = new Random();
          int calMax = 4000;
          int calMin = 2000;
          int weightMax = 20;
          int weightMin = 0;
          int counter = 0;
          for (int i = 0; i < foodList.size(); i++) {
               for (int j = 0; i < person.getAllergies().size(); i++) {
                    if(!foodList.get(i).isVegan())
                         counter++;
                    if (foodList.get(i).getName().equals(person.getAllergies().get(j).getName())) {
                         foodList.remove(i);
                    }
               }
          }
          HypercaloricDiet hcd;
          if (counter == 0)
               hcd = new HypercaloricDiet(50, "Random diet", foodList, true, (float) (randomCalories.nextInt(calMax-calMin) + calMin), (float) person.getWeight() + randomWeight.nextInt(weightMax-weightMin) + weightMin);
          else
               hcd = new HypercaloricDiet(50, "Random diet", foodList, false, (float) (randomCalories.nextInt(calMax-calMin) + calMin), (float) person.getWeight() + randomWeight.nextInt(weightMax-weightMin) + weightMin);
          person.setDiet(hcd);
          return hcd;
     }
}


