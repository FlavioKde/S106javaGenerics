package level2.exercise2.mainManager;

import level2.exercise2.dataClass.GenericsMethodsVarargs;
import level2.exercise2.dataClass.Person;

public class MainGenerics {
    public static void main(String[] args) {
        Person person = new Person("Jorgito","Vidal",35);
        GenericsMethodsVarargs genericsMethods = new GenericsMethodsVarargs();

        genericsMethods.genericElements("Hey",54.5,person,34.5,person);
        genericsMethods.genericElements(189,23,person,"parking","stop");
        genericsMethods.genericElements("Hey",89,person,45.45,"s");

    }
}
