import AppAtributes.ShoppingCart;
import Products.Clothing;
import Products.Electronics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart newCart = new ShoppingCart();
        System.out.println("which product you want to add to cart: 1:electronics, 2: clothing");
        int n = sc.nextInt();
        if(n==1){
            System.out.println("Enter product name:");
            String productName = sc.next();
            System.out.println("Enter Manufacturer:");
            String Manufacturer = sc.next();
            newCart.addElectronics(new Electronics(productName, Manufacturer));

        } else if (n==2) {
            System.out.println("Enter Brand name:");
            String Brand = sc.next();
            System.out.println("Enter Size:");
            int Size = sc.nextInt();
            System.out.println("Enter Material you want:");
            String Material = sc.next();
            newCart.addClothing(new Clothing(Brand,Size,Material));
        }else{
            System.out.println("Invalid input!");
        }
        System.out.println("Size Of the Cart:");
        System.out.println(newCart.sizeOfCart());
        System.out.println("Card Contents:");
        newCart.displayCartContents();

    }
}