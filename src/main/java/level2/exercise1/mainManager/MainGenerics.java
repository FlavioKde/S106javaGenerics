package level2.exercise1.mainManager;

import level2.exercise1.dataClass.GenericsMethods;
import level2.exercise1.dataClass.Person;

public class MainGenerics {
    public static void main(String[] args) {
        Person person = new Person("Jorgito","Alfajor",35);
        GenericsMethods genericsMethods = new GenericsMethods();

        genericsMethods.generic("Hey",54.5,person);
        genericsMethods.generic(189,23,person);
        genericsMethods.generic("Hey",89,person);

    }
}
