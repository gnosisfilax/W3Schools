package classes.constructors.parameters;

public class Main {
    int x, modelYear;
    String modelName;

    public Main (int year, String name){

        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Main myCar = new Main(1969,"Mustang");
        System.out.println(myCar.modelYear + " " +myCar.modelName);
    }
}
