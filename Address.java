
    /**
 * Write a description of class Address here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Address
{
    //fields
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private int houseNumber;
    //constructor(overload)
    public Address(){
        
    }
    public Address(int houseNumber,String street, String city, String state, 
    String zipcode){
        this.houseNumber = houseNumber;
        this.street = street;
        this.city  = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    public Address(int houseNumber){
        this.houseNumber = houseNumber;
        this.street = "college rd";
        this.city = city;
    }
    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getZipcode(){
        return zipcode;
    }
    public int getHouseNumber(){
        return houseNumber;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public void setCity(String city){
        this.city= city;
    }
    public void setZipcode(String zipcode){
        this.zipcode= zipcode;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setHouseNumber(int houseNumber){
        this.houseNumber = houseNumber;
        this.street = "college rd";
        this.city = "suffern";
        this.state = state;
    }
    public void printInfo(){
        System.out.println("The address is" +houseNumber + street+city +state
        +zipcode);
    }
    public String getFullAddress(){
        return street+houseNumber+city+state+zipcode;
    }
}
