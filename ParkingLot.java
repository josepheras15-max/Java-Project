
//coding part 
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
/**
 * A parkinglot contain multiple car objects
 * have different loop methods
 * add a car in the lot 
 * add a car based on Scanner class 
 * @author (Josepher Salto)
 * @version (3/26/25)
 */
public class ParkingLot
{
   private ArrayList<Car> parkingLot;
   private Scanner kybd;
   //constructor 
   public ParkingLot(){
       parkingLot = new ArrayList<>();
       kybd = new Scanner(System.in);// need to use Scanner class methods later
   }
   public void addCar(Car car){
       parkingLot.add(car);
       System.out.println("This car was added to the parking lot.");
   }
   public void removeCar(Car car){
       if(parkingLot.remove(car)){
           System.out.println("This car was removed from the parking lot");
       }
       else{
           System.out.println("This car was not found in the parking lot.");
       }
   }
   public void displayWhileLoop(){
       System.out.println("Displaying cars using while loop:");
       int index = 0;
       while(index < parkingLot.size()){
           System.out.println("Car" + (index + 1) + ":");
           parkingLot.get(index).printCarInfo();
           index++;
       }
   }
   public void displayForEachLoop(){
       System.out.println("Displaying cars using for each loop:");
       int count = 1;
       for(Car car : parkingLot){
           System.out.println("Car" + count +":");
           car.printCarInfo();
           count ++;
       }
   }
   public void displayForLoop(){
       System.out.println("Displaying cars using regular for loop:");
       for(int i=0; i<parkingLot.size(); i++){
           System.out.println("Car" + (i+1) + ":");
           parkingLot.get(i).printCarInfo();
       }
   }
   public void displayIterator(){
       System.out.println("Displaying cars using iterator:");
       Iterator<Car> it = parkingLot.iterator();
       int count = 1;
       while(it.hasNext()){
           System.out.println("Car" + count + ":");
           it.next().printCarInfo();
           count++;
       }
   }
   public void addCarWithScanner(){
       System.out.println("Enter the car details:");
       System.out.println("Enter the engine details:");
       
       System.out.println("Engine price:");
       int price = kybd.nextInt();
       kybd.nextLine();
       
       System.out.println("Engine type:");
       String type = kybd.next();
       
       System.out.println("Engine brand:");
       String engineBrand = kybd.next();
       
       System.out.println("Engine horsepower:");
       double horsePower = kybd.nextDouble();
       
       System.out.println("Car year:");
       int year = kybd.nextInt();
       
       System.out.println("Car model:");
       String model = kybd.next();
       
       System.out.println("Car brand:");
       String carBrand = kybd.next();
       
       Car newCar = new Car( price, type, engineBrand, horsePower, year, model, carBrand);
       parkingLot.add(newCar);
       System.out.println("New car added to the parking lot.");
   }
   public int getNumberOfCars(){
       return parkingLot.size();
   }
   public Car getCarFromLocation(int index){
       if(index >= 0 && index < parkingLot.size()){
           return parkingLot.get(index);
       }
       else{
           System.out.println("Location is invalid.");
           return null; 
       }
   }
}
