/**
 * Write a description of class Garage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Garage
{
    private Car myCar;
    private Address address;
    
    // HW 7 private Person person;
    //constructer
    public Garage(Car myCar, Address address){
        this.myCar = myCar;
        this.address = address;
    }
    public Garage(){
        myCar = new Car();
        address = new Address();
    }
    public Garage(int price, String type, String brand, double horsepower, 
    int year, String carModel, String carBrand,int houseNumber,String street, 
    String city, String state, String zipcode){
        myCar = new Car(price,type,brand,horsepower,year,carModel,carBrand);
        address = new Address(houseNumber,street,city,state,zipcode);
    }
    public Garage(int price, String type, int houseNumber){
        myCar = new Car(price, type);
        address = new Address(houseNumber);
    }
    //getter
    //for car information
    public String getCarModel(){
        return myCar.getCarModel();
    }
    //get car year
    public int getCarYear(){
        return myCar.getYear();
    }
    //get car brand
    public String getCarBrand(){
        return myCar.getBrand();
    }
    //for engine information
    public String getEngineType(){
        return myCar.getEngineType();
    }
    public double getEngineHorsePower(){
        return myCar.getEngineHorsePower();
    }
    //two ways to get engine brand
    
    public String getEngineBrand(){
        return myCar.getEngineBrand();
    }
    public String getEngineBrandWithNotation(){
        return myCar.getEngine().getBrand();
    }
    
    //for address information
    public int getHouseNumber(){
        return address.getHouseNumber();
    }
    public String getStreet(){
        return address.getStreet();
    }
    public String getFullAddress(){
        return address.getFullAddress();
    }
    //setter
    public void setCarModel(String newModel){
        myCar.setCarModel(newModel);
    }
    public void setEnginePrice(int price){
        myCar.setEnginePrice(price);
    }
    public void setEngineHP(double hp){
        myCar.setEngineHorsePower(hp);
    }
    //set Engine brand 
    public void setAddressNumber(int num){
        address.setHouseNumber(num);
    }
    //display method
    public void displayGarageInfo(){
        System.out.println("The garage address is");
        address.printInfo();
        System.out.println("The car in the garage is");
        myCar.printCarInfo();
    }
    //another example for notation
    public void displayEngineInfo(){
        myCar.getEngine().displayInfo();
    }
}