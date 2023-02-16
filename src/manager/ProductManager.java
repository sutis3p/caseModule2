package manager;

import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> listProducts = new ArrayList<>();


    public void add (Product product){
        listProducts.add(product);
    }
    public void createProduct(){
        int b = 0;
        while (true) {
            System.out.println("Nhập 1 để chọn BodyMist");
            System.out.println("Nhập 2 để chọn ShowerGel");
        }
    }
    public void show () {
        for (Product listProduct : listProducts){
            System.out.println(listProduct.toString());
        }
    }

    public int findIdByName (String name){
        for (int i = 0; i < listProducts.size(); i++) {
            if (name.equals(listProducts.get(i).getName()))
                return 1;
        }
        return -1;
    }

}
