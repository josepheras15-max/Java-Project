/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private Engine engine;
    private int year;
    private String model;
    private String brand;
    //constructors
    public Car(){
        engine = new Engine();
        year= 2025;
        model =" model y";
        brand =" Tesla";
    }
    public Car(int price, String type, String brand, double horsepower, 
    int year, String carModel, String carBrand){
        engine = new Engine(price, type, brand, horsepower);
        this.year = year;
        this.model =carModel;
        this.brand = carBrand;
    }
    public Car(int price, String type){
        engine = new Engine(price, type);
        this.year = 2025;
        this.model = "model Y";
        brand = "Tesla";
    }
    //getter
    public int getYear(){
        return year;
    }
    public String getCarModel(){
        return model;
    }
    public String getBrand(){
        return brand;
    }
    public int getEnginePrice(){
        return engine.getPrice();
    }
    public String getEngineType(){
        return engine.getType();
    }
    public String getEngineBrand(){
        return engine.getBrand();
    }
    public double getEngineHorsePower(){
        return engine.getHorsePower();
    }
    //setters
    public void setCarYear(int year){
        this.year= year;
    }
    public void setCarModel(String model){
        this.model = model;
    }
    public void setCarbrand(String brand){
        this.brand = brand;
    }
    public void setEnginePrice(int price){
        if (price>100){
        engine.setPrice(price);}
        else{
            System.out.println("the price is too low");
        }
    }
    public void setEngineType(String type){
        engine.setType(type);
    }
    public void setEngineHorsePower(double hrp){
        engine.setHorsePower(hrp);
    }
    public void setEngineBrand(String brand){
        engine.setBrand(brand);
    }
    public void printCarInfo(){
        engine.displayInfo();
       displayCarOnly();
    }
    public void displayCarOnly(){
        System.out.println("this car is "+ year +"" +model + " " + brand);
    }
    //return the whole object
    public Engine getEngine(){
        return engine;
    }
}