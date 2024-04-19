import AppAtributes.ShoppingCart;
import ProductNotFound.ProductNotFound;
import Products.Clothing;
import Products.Electronics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart newCart = new ShoppingCart();
        System.out.println("how many product you want to add!");
        int p = sc.nextInt();
        while (p-- > 0) {
            System.out.println("which product you want to add to cart: 1:electronics, 2: clothing");
            int n = sc.nextInt();
            if(n==1){
                System.out.println("Enter product Id:");
                int productId = sc.nextInt();
                System.out.println("Enter product name:");
                String productName = sc.next();
                System.out.println("Enter desired warranty:");
                String warrantyPeriod = sc.next();
                System.out.println("Enter Manufacturer:");
                String Manufacturer = sc.next();
                try {
                    Electronics product1 = new Electronics(warrantyPeriod,productId,productName, Manufacturer);
                    newCart.addElectronics(product1);
                }catch (IllegalArgumentException e){
                    System.err.println("Invalid Args"+e);
                }

    
            } else if (n==2) {
                System.out.println("Enter product Id:");
                int productId = sc.nextInt();
                System.out.println("Enter product name:");
                String productName = sc.next();
                System.out.println("Enter Brand name:");
                String Brand = sc.next();
                System.out.println("Enter Size:");
                int Size = sc.nextInt();
                System.out.println("Enter Material you want:");
                String Material = sc.next();
                try {
                    Clothing product2 = new Clothing(productId,productName,Brand,Size,Material);
                    newCart.addClothing(product2);
                }catch (IllegalArgumentException e){
                    System.err.println("Invalid Args"+e);
                }

            }else{
                System.out.println("Invalid input!");
            }
        }
       
        System.out.println("Size Of the Cart:");
        System.out.println(newCart.sizeOfCart());
        System.out.println("Cart Contents:");
        newCart.displayCartContents();
        System.out.println("Do you want to delete a product!(y/n)");
        String check = sc.next();
        System.out.println("Enter Id:");
        int id = sc.nextInt();
        if(check.equals("y")){
            try {
                newCart.deleteProduct(id);
            }catch (ProductNotFound e){
                System.out.println("Product is not in the cart!"+e);
            }

        }

    }
}