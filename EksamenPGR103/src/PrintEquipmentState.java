import java.io.IOException;

public class PrintEquipmentState {


    public void printBallsNeedingMoreAir() throws IOException {
        ReadFromFile rf = new ReadFromFile();
        rf.readEquipmentsFromFile();
        rf.makeEquipmentObjectFromList();
        for(Equipment e : rf.equipments) {
            if(e instanceof Ball && ((Ball) e).isNeedAir()) {
                System.out.println(e.toString());
                System.out.println("----------------------------------------");
            }
        }
    }

    public void printEquipmentNeedingToBeReplaced() throws IOException {
        ReadFromFile rf = new ReadFromFile();
        rf.readEquipmentsFromFile();
        rf.makeEquipmentObjectFromList();
        for(Equipment e : rf.equipments) {
            if(e.isNeedReplacement()) {
                System.out.println(e.toString());
                System.out.println("----------------------------------------");
            }
        }
    }

    public void printTableTennisRacketsNeedingNewPad() throws IOException {
        ReadFromFile rf = new ReadFromFile();
        rf.readEquipmentsFromFile();
        rf.makeEquipmentObjectFromList();
        for(Equipment e : rf.equipments) {
            if(e instanceof TableTennisRacket && ((TableTennisRacket) e).isNeedNewPad()) {
                System.out.println(e.toString());
                System.out.println("----------------------------------------");
            }
        }
    }
}
