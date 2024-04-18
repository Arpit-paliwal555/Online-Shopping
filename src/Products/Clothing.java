package Products;

public class Clothing extends Product{
    String Brand;
    int Size;
    String Material;
    public Clothing( String Brand,int Size, String Material) {
        super();
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
