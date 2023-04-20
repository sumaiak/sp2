public  class ElectricCar extends AFuelCar{
    int batteryCapacity;
    int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }



    @Override
    public int getRegistrationFee() {
        int price = 0;

        double whatprKm = (getwhPrKm() / 91.25) / 100;

        if (getKmPrLiter() >= 20 && getKmPrLiter() <= 50) {
            price = 350;

        } else if (getKmPrLiter() > 15 && getKmPrLiter() <= 20) {
            price = 1050;
        } else if (getKmPrLiter() > 10 && getKmPrLiter() <= 15) {
            price = 2340;
        } else if (getKmPrLiter() > 5 && getKmPrLiter() <= 10) {
            price = 5500;
        } else if (getKmPrLiter() <= 5) {
            price = 10470;
        }
        return price;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }


    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }
    public int getwhPrKm() {
        return (batteryCapacity * 1000 / maxRange);
    }


    @Override
    public String getFuelType() {
        return "power";
    }

    @Override
    public String toString(){
return  super.toString()+ getwhPrKm()+getBatteryCapacityKWh() ;
    }
}
