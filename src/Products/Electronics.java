package Products;

public class Electronics extends Product{
    String warrantyPeriod = "1 year";
    String Manufacturer;
    String PowerRating = "3 star";
    public Electronics(String warrantyPeriod, String Manufacturer){
        super();
        this.warrantyPeriod = warrantyPeriod;
        this.Manufacturer = Manufacturer;
       // this.PowerRating = PowerRating;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty Period: "+warrantyPeriod);
        System.out.println("Manufacturer: "+Manufacturer);
        System.out.println("Power Rating: "+PowerRating);
    }
}
