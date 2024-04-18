package AppAtributes;
import Products.Electronics;
import Products.Clothing;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Electronics> electronicsArrayList;
    ArrayList<Clothing> clothsArrayList;
    public ShoppingCart(){
        electronicsArrayList = new ArrayList<>();
        clothsArrayList = new ArrayList<>();
        System.out.println("New Cart Created!");
    }


    public void addElectronics(Electronics product){
        electronicsArrayList.add(product);
        System.out.println("Electronics product added!");
    }
   public  void addClothing(Clothing product){
        clothsArrayList.add(product);
        System.out.println("Clothing product added!");
    }
   public int sizeOfCart(){
        return electronicsArrayList.size()+clothsArrayList.size();
    }
    public void displayCartContents(){
        System.out.println("Electronic items:");
        for (Electronics electronics : electronicsArrayList) {
            electronics.displayDetails();
            System.out.println();
        }
        System.out.println("Clothing items:");
        for (Clothing clothing : clothsArrayList) {
            clothing.displayDetails();
            System.out.println();
        }
    }


}
