package level1.exercise1.logic;

import level1.exercise1.dataClass.NoGenericMethods;

import java.util.ArrayList;
import java.util.List;

public class InstanceManager {
    private List<NoGenericMethods>noGenericMethodsList;
    private NoGenericMethods noGenericMethods;

    public InstanceManager(){
        this.noGenericMethodsList = new ArrayList<>();
        this.noGenericMethods = new NoGenericMethods("Default Name","Default Last Name", "Default City");


    }
    public void initializeInstance(){
        noGenericMethodsList.add(new NoGenericMethods("Carlos","Gomez","Buenos Aires"));
        noGenericMethodsList.add(new NoGenericMethods("New York","Samid","Peter"));
        noGenericMethodsList.add(new NoGenericMethods("Gomez","Istanbul","Maria"));
    }

    public List<NoGenericMethods> getNoGenericMethodsList() {
        return noGenericMethodsList;
    }

    public NoGenericMethods getNoGenericMethods() {
        return noGenericMethods;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("InstanceManager= \n");

        for (NoGenericMethods item : noGenericMethodsList){
            result.append(item).append("\n");
        }
        return result.toString();
    }
}
