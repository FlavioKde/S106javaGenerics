package level2.exercise2.dataClass;

public class GenericsMethodsVarargs {

    @SafeVarargs
    public final <T>void genericElements(T...elements){
        for(T element : elements ){
            System.out.println(element);
        }

    }


}
