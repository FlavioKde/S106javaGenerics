package level1.exercise1.dataClass;

public class NoGenericMethods {
    private String name;
    private String lastName;
    private String city;

    public NoGenericMethods(String name, String lastName, String city){
        this.name = name;
        this.lastName = lastName;
        this.city = city;
    }

    public String getName() {
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public  void setCity(String city){
        this.city = city;
    }

    @Override
    public String toString() {
        return "NoGenericMethods " +"\n"+
                "name= " + name + '\n' +
                "lastName= " + lastName + '\n' +
                "city= " + city ;
    }
}
