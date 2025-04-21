package level1.exercise2.dataClass;

public class GenericsMethods {

    public <T, U, V>void generic(T t, U u , V v){
        System.out.println("First argument: "+t);
        System.out.println("Second argument: "+u);
        System.out.println("Third argument: "+v);

    }

}
