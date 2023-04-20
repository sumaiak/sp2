abstract class AFuelCar  extends  ACar{
    private int kmPrLiter ;

    public AFuelCar(String registrationNumber, String make, String model) {
        super(registrationNumber, make, model);
        this.kmPrLiter = kmPrLiter;

    }

    abstract public String getFuelType();

    public int getKmPrLiter(){

        return this.kmPrLiter = kmPrLiter;


}
@Override
    public String toString(){

        return super.toString()+getKmPrLiter()+"Fuel type:"+getFuelType();


}
}
