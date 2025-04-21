package level2.exercise1.dataClass;

public class GenericsMethods {

    public <T, U>void generic(T t, U u ,Person person){
        System.out.println("First argument: "+t);
        System.out.println("Second argument: "+u);
        System.out.println("Third argument: "+person);

    }

}
