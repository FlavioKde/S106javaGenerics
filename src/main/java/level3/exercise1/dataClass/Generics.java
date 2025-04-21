package level3.exercise1.dataClass;

import level3.exercise1.interfaces.Phone;

public class Generics {

    public<P extends Phone> void genericMethodPhone(P phone){
        System.out.println("First argument: " + phone);
        phone.call();
    }
    public <S extends Smartphone> void genericMethodSmartphone (S smartphone){
        System.out.println("Second argument: " + smartphone);
        smartphone.call();
        smartphone.takePhotos();
    }
}
