package AppAtributes;
import ProductNotFound.ProductNotFound;
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

    public void addElectronics (Electronics product){
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
    public void deleteProduct(int id) throws ProductNotFound {
            boolean flag = false;
            for(int i=0;i< list.size();i++){
                Product p = list.get(i);
                if(p.productId == id ){
                    list.remove(p);
                    System.out.println("Product removed!");
                    flag = true;
                    break;
                }
            }
            if(!flag){
                throw new ProductNotFound();
            }
    }


}
