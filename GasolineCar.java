public class GasolineCar extends AFuelCar {


    public GasolineCar(String registrationNumber, String make, String model, int kmPrLiter) {
        super(registrationNumber, make, model );

    }

    public int getRegistrationFee() {

        if (getKmPrLiter() >= 30 && getKmPrLiter() <= 50) {
            return 350;

        } else if (getKmPrLiter() > 15 && getKmPrLiter() <= 20) {
            return 1050;
        } else if (getKmPrLiter() > 10 && getKmPrLiter() <= 15) {
            return 2340;
        } else if (getKmPrLiter() > 5 && getKmPrLiter() <= 10) {
            return 5500;
        } else if (getKmPrLiter() <= 5) {
            return 10470;
        }
        else {
            return getKmPrLiter();
        }


    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public String toString (){
return super.toString();


    }
}
