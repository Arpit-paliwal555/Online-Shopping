package AppAtributes;
import Products.Electronics;
import Products.Clothing;
import Products.Product;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> list;
    public ShoppingCart(){
        list = new ArrayList<>();
        System.out.println("New Cart Created!");
    }

    public void addElectronics(Electronics product){
        list.add(product);
        System.out.println("Electronics product added!");
    }
   public  void addClothing(Clothing product){
        list.add(product);
        System.out.println("Clothing product added!");
    }
   public int sizeOfCart(){
        return list.size();
    }
    public void displayCartContents(){
        System.out.println("items:");
        for (Product electronics :list) {
            electronics.displayDetails();
            System.out.println();
        }

    }


}
