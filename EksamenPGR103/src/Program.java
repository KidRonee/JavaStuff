import java.io.IOException;

public class Program {

    public Program() throws IOException {
        System.out.println("Printing balls needing more air");
        new PrintEquipmentState().printBallsNeedingMoreAir();
        System.out.println("Printing equipment needing to be replaced");
        new PrintEquipmentState().printEquipmentNeedingToBeReplaced();
        System.out.println("Printing table tennis rackets needing new pad");
        new PrintEquipmentState().printTableTennisRacketsNeedingNewPad();
    }
}
