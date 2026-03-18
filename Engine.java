
import java.util.Scanner;
/**
 * Write a description of class Engine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Engine
{//fields
    private int price;
    private String type;
    private String brand;
    private double horsePower;
    //constructor
    private Scanner keybd;
    public Engine(){
        price = 100;
        type="Gas";
        brand = "Toyato";
        horsePower = 7.5;
        keybd = new Scanner(System.in);
    }
    public Engine(int price, String type){
        this.price = price;
        this.type = type;
        brand = "toyato";
        horsePower =6.5;
        keybd = new Scanner(System.in);
    }
    public Engine(int price, String type,String brand,double horsePower){
        this.price = price;
        this.type = type;
        this.brand = brand;
        this.horsePower = horsePower;
        keybd = new Scanner(System.in);
    }
    //getter
     public int getPrice(){
         return price;
     }
     public String getType(){
         return type;
     }
     public String getBrand(){
         return brand;
     }
     public double getHorsePower(){
         return horsePower;
     }
     //setter
     public void setPrice(int newPrice){
         price = newPrice;
     }
     public void setPrice(){
         System.out.println("Please type the price");
         price = keybd.nextInt();
         keybd.nextLine();
     }
     public void setType(String type){
         this.type = type;
     }
     public void setType(){
         System.out.println("Please type the type of Engine");
         type = keybd.nextLine();
     }
     public void setBrand(String brand){
         this.brand = brand;
     }
     public void setBrand(){
         System.out.println("Please type the Brand");
         type = keybd.nextLine();
     }
     public void setHorsePower(double horsePower){
         this.horsePower = horsePower;
     }
     public void setHorsePower(){
         System.out.println("Please type the type of Horsepower");
         horsePower = keybd.nextDouble();
         keybd.nextLine();
     }
     public void startEngine(){
         System.out.println(" The engine is started");
     }
     public void turnOffEngine(){
         System.out.println("Turn off the engine");
     }
     public void displayInfo(){
         System.out.println(" The engine is " +brand+ " "+type+ "" + horsePower+ " with the price of " +price);
     }
     public void setInfo(){
         System.out.println("Please type the price");
         price = keybd.nextInt();
         keybd.nextLine();
         System.out.println("Please type the type of Engine");
         type = keybd.nextLine();
         System.out.println("Please type the Brand");
         type = keybd.nextLine();
         System.out.println("Please type the type of Horsepower");
         horsePower = keybd.nextDouble();
     }
}
