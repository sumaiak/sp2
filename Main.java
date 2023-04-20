


public class Main {
    public static void main(String[] args) {
FleetOfCars cars = new FleetOfCars();

cars.addCar(new GasolineCar("BD50RZ","ford","mustang",10));
cars.addCar(new ElectricCar("DH50RF","tesla","Y",75,435));
cars.addCar(new DieselCar("MN10FD","Mercedes","C class 220",5));
            cars.getTotalRegistrationFeeForFleet();
        System.out.println(cars.toString());
        }
    }




