 abstract class ACar implements Car {
    private String   registrationNumber;
     private String make;
     private String model;
     private final int NumberOfDoor ;


     public ACar(String registrationNumber, String make, String model) {
         this.registrationNumber = registrationNumber;
         this.make = make;
         this.model = model;
         this.NumberOfDoor = 5;
     }



     public String getRegistrationNumber(){
         return this.registrationNumber = registrationNumber;


     }
    public  String getMake(){
        return this.make = make;

     }
     public String getModel(){
         return this.model = model;

     }
     public int getNumberOfDoors(){
         return NumberOfDoor;
     }

     @Override
     public  String toString(){

         return "Make: " + getMake() + ", " +
                 "Model: " + getModel() + ", " +
                 "Number of Doors: " + getNumberOfDoors() + ", " +
                 "Registration Number: " + getRegistrationNumber() + ", " +
                 "Registration Fee: " + getRegistrationFee();
     }







}
