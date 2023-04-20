import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> cars = new ArrayList<Car>();

    public ArrayList<Car> getCars() {
        return cars;
    }

    void addCar(Car car) {
        cars.add(car);
    }

    int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;
        for (Car car : cars) {

            totalFee += car.getRegistrationFee();
        }
        return totalFee;
    }
    @Override
    public String toString(){
        String list = cars.toString();
        return list;




    }

}