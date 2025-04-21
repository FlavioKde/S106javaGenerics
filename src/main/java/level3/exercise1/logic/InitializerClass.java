package level3.exercise1.logic;

import level3.exercise1.dataClass.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class InitializerClass {
    private List<Smartphone>smartphoneList;

    public InitializerClass(){
        this.smartphoneList = new ArrayList<>();
    }
    public void loadClass() {
        smartphoneList.add(new Smartphone(12345678,"Apple", "iPhone 13", "Black"));
        smartphoneList.add(new Smartphone(99876543,"Samsung", "Galaxy S22", "Blue"));
        smartphoneList.add(new Smartphone(12341234,"Google", "Pixel 6", "White"));
        smartphoneList.add(new Smartphone(98765432,"Xiaomi", "Mi 11", "Gray"));
    }

    public List<Smartphone> getSmartphoneList() {
        return smartphoneList;
    }
    public void printInitializer(){

        for (Smartphone smartphone: smartphoneList){
            System.out.println(smartphone.getDescription());
        }
    }
    public  void smartphoneMethodPhotos(){
        if (smartphoneList.isEmpty()) {
            System.out.println("No smartphones available to take photos.");
            return;
        }
        for(Smartphone smartphone: smartphoneList){
            smartphone.takePhotos();
        }
    }
    public void smartphoneMethodCall(){
        for (Smartphone smartphone: smartphoneList){
            smartphone.call();
        }
    }
}
