package level2.exercise2.dataClass;

public class Person {
    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Person " +"\n"+
                "name: " + name + '\n' +
                "lastName: " + lastName + '\n' +
                "age: " + age ;
    }
}
