package factory;

import model.Camaro;
import model.Car;
import model.Onix;
import model.Kwid;


public class CarFactory {
    public static Car orderCar(String model) {
        Car device = null;

        if (model.equals("Camaro")) {
            device = new Camaro();
        } else if (model.equals("Onix")) {
            device = new Onix();
        } else if (model.equals("Kwid")) {
            device = new Kwid();
        }
        device.getHardware();


        return device;
    }
}

