package Products;

public class Electronics extends Product{
    String warrantyPeriod;
    String Manufacturer;
    String PowerRating;
    public Electronics (String ProductName,int productId, String warrantyPeriod, String Manufacturer) throws IllegalArgumentException{
        super(ProductName, productId);
        if (ProductName.isEmpty() || warrantyPeriod.isEmpty()|| Manufacturer.isEmpty()){
            throw new IllegalArgumentException("Empty Args!");
        }
        this.warrantyPeriod = warrantyPeriod;
        this.Manufacturer = Manufacturer;
        this.PowerRating = "3 star";

    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty Period: "+warrantyPeriod);
        System.out.println("Manufacturer: "+Manufacturer);
        System.out.println("Power Rating: "+PowerRating);
    }
}
