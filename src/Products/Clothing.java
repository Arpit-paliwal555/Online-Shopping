package Products;

public class Clothing extends Product{
    String Brand;
    int Size;
    String Material;
    public Clothing (int productId,String ProductName,String Brand, int Size, String Material) throws IllegalArgumentException {
        super( ProductName,productId);
        if(Brand.isEmpty() || Size==0 || Material.isEmpty()){
            throw new IllegalArgumentException("Illegal Args");
        }
        this.Brand = Brand;
        this.Size = Size;
        this.Material = Material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: "+Brand);
        System.out.println("Size: "+Size);
        System.out.println("Material: "+Material);
    }
}
