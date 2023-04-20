import javax.swing.*;

public class DieselCar extends AFuelCar {
    boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int kmPrLiter) {
        super(registrationNumber, make, model);
    }


    boolean hasParticleFilter() {
        return particleFilter;

    }

    public int getRegistrationFee() {
        int price = 0;
        if (!hasParticleFilter()) {

            price = 1000;

        }

        if (getKmPrLiter() >= 30 && getKmPrLiter() <= 50) {


            price = 130;

        } else if (getKmPrLiter() > 15 && getKmPrLiter() <= 20) {
            price = 1390;
        } else if (getKmPrLiter() > 10 && getKmPrLiter() <= 15) {

            price = 1850;
        } else if (getKmPrLiter() > 5 && getKmPrLiter() <= 10) {
            price = 2770;
        } else if (getKmPrLiter() <= 5) {

            price = 15260;
        }
        return price;
    }






    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
public String toString (){
        return  super.toString()+getKmPrLiter();

    }
}
