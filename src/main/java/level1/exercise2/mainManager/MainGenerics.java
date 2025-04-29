package level1.exercise2.mainManager;

import level1.exercise2.dataClass.GenericsMethods;
import level1.exercise2.dataClass.Person;

public class MainGenerics {
    public static void main(String[] args) {
        Person person = new Person("Jorgito","Alfajor",35);
        GenericsMethods genericsMethods = new GenericsMethods();

        genericsMethods.generic(person,"Hey",54);
        genericsMethods.generic(189,23,56);
        genericsMethods.generic("Hey",89,person);

    }
}
