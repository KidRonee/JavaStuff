import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {
    BufferedReader reader;
    Scanner sc;
    ArrayList<String> equipmentInfoList;
    ArrayList<Equipment> equipments;

    public ReadFromFile() throws IOException {
        readEquipmentsFromFile();
        makeEquipmentObjectsFromList();

        /*metoden under er en kombinasjon av de to over*/
        //readFromFileAndMakeObjects();
    }



    public ArrayList<String> readEquipmentsFromFile() throws IOException {
        equipmentInfoList = new ArrayList<>();
        reader = new BufferedReader(new FileReader("resources\\equipment.txt"));
        sc = new Scanner(reader);
        while(sc.hasNextLine()) {
            equipmentInfoList.add(sc.nextLine());
        }
        reader.close();
        return equipmentInfoList;
    }

    public ArrayList<Equipment> makeEquipmentObjectsFromList() {
        equipments = new ArrayList<>();
        final String ball = "Ball";
        final String tableTennisRacket = "TableTennisRacket";

        for(int i  = 0; i < equipmentInfoList.size(); i++) {
            switch(equipmentInfoList.get(i)) {
                case ball:
                    equipments.add(new Ball(
                                    Integer.parseInt(equipmentInfoList.get(i+1)),
                                    equipmentInfoList.get(i+2),
                                    Boolean.parseBoolean(equipmentInfoList.get(i+3)),
                                    equipmentInfoList.get(i+4),
                                    Boolean.parseBoolean(equipmentInfoList.get(i+5)))
                                    );
                    break;
                case tableTennisRacket:
                    equipments.add(new TableTennisRacket(
                                    Integer.parseInt(equipmentInfoList.get(i+1)),
                                    equipmentInfoList.get(i+2),
                                    Boolean.parseBoolean(equipmentInfoList.get(i+3)),
                                    Boolean.parseBoolean(equipmentInfoList.get(i+4)))
                                    );
                    break;
                default:
                    break;
            }
        }
        return equipments;
    }

    public ArrayList<Equipment> readFromFileAndMakeObjects() throws IOException {
        equipmentInfoList = new ArrayList<>();
        reader = new BufferedReader(new FileReader("resources\\equipment.txt"));
        sc = new Scanner(reader);
        while(sc.hasNextLine()) {
            equipmentInfoList.add(sc.nextLine());
        }
        reader.close();

        equipments = new ArrayList<>();
        final String ball = "Ball";
        final String tableTennisRacket = "TableTennisRacket";

        for(int i  = 0; i < equipmentInfoList.size(); i++) {
            switch(equipmentInfoList.get(i)) {
                case ball:
                    equipments.add(new Ball(
                                    Integer.parseInt(equipmentInfoList.get(i+1)),
                                    equipmentInfoList.get(i+2),
                                    Boolean.parseBoolean(equipmentInfoList.get(i+3)),
                                    equipmentInfoList.get(i+4),
                                    Boolean.parseBoolean(equipmentInfoList.get(i+5)))
                                    );
                    break;
                case tableTennisRacket:
                    equipments.add(new TableTennisRacket(
                                    Integer.parseInt(equipmentInfoList.get(i+1)),
                                    equipmentInfoList.get(i+2),
                                    Boolean.parseBoolean(equipmentInfoList.get(i+3)),
                                    Boolean.parseBoolean(equipmentInfoList.get(i+4)))
                                    );
                    break;
                default:
                    break;
            }
        }
        return equipments;
    }

    public void printEquipments() {
        for(Equipment e : equipments) {
            System.out.println(e.toString());
            System.out.println("----------------------------------------");
        }
    }
}
