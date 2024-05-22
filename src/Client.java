import factory.CarFactory;
import model.Car;

public class Client {
    public static void main (String[] args) throws Exception {
        System.out.println("\n\n### Camaro");
        Car camaro = CarFactory.orderCar("Camaro");
        System.out.println(camaro);

        System.out.println("\n\n### Onix");
        Car onix = CarFactory.orderCar("Onix");
        System.out.println(onix);
    }

}