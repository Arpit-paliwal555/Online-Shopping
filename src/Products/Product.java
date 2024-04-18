package Products;

public class Product {
    String productName;
    int productId = 55;
    double price = 5000;
    int quantityInStock = 100;
    public Product(){
        System.out.println("Product Created!");
    }
    public Product(String productName, int productId, double price, int quantityInStock){
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }
    public void displayDetails(){
        System.out.println("ID: "+productId);
        System.out.println("Name: "+productName);
        System.out.println("Price: "+price);
        System.out.println("Quantity in Stock: "+quantityInStock);
    }
}
