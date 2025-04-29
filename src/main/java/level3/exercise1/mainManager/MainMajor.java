package level3.exercise1.mainManager;

import level3.exercise1.dataClass.Generics;
import level3.exercise1.dataClass.Smartphone;
import level3.exercise1.logic.InitializerClass;

public class MainMajor {
    public static void main(String[] args) {

        InitializerClass initializerClass = new InitializerClass();
        Generics generics = new Generics();


        initializerClass.loadClass();
        initializerClass.smartphoneMethodCall();
        initializerClass.smartphoneMethodPhotos();
        initializerClass.printInitializer();

    }
}
