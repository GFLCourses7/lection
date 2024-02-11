package builder;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        CarDirector director = new CarDirector(builder);


        Car sportsCar = director.constructSportsCar();
        System.out.println("Sports Car:");
        System.out.println(sportsCar);


        Car familyCar = director.constructFamilyCar();
        System.out.println("\nFamily Car:");
        System.out.println(familyCar);
    }
}