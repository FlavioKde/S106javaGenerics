package level1.exercise1.mainManager;

import level1.exercise1.logic.InstanceManager;

public class MainNoGenericsMethods {

    public static void main(String[] args) {

        InstanceManager instanceManager = new InstanceManager();
        instanceManager.initializeInstance();
        System.out.println(instanceManager);

    }

}
