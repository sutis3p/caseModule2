package manager;

import model.BodyMist;
import model.Product;
import model.ShowerGel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> listProducts = new ArrayList<>();
    int id = 0;

    public void add (Product product){
        listProducts.add(product);
    }
    public Product createProduct(){
        int b = 0;
            System.out.println("Nhập 1 để chọn BodyMist");
            System.out.println("Nhập 2 để chọn ShowerGel");
            b = Integer.parseInt(scanner.nextLine());
            if (b == 1){
                id++;
                System.out.println("Nhập tên sản phẩm : ");
                String name = scanner.nextLine();
                System.out.println("Nhập thể tích sản phẩm : ");
                int volume = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập nhập số lượng sản phẩm : ");
                int amount = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giá cho sản phẩm : ");
                double price = Double.parseDouble(scanner.nextLine());
                Product bodyMist = new BodyMist(id,name,volume,amount,price);
                return bodyMist;
            } else {
                id++;
                System.out.println("Nhập tên sản phẩm : ");
                String name = scanner.nextLine();
                System.out.println("Nhập thể tích sản phẩm : ");
                int volume = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập nhập số lượng sản phẩm : ");
                int amount = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giá cho sản phẩm : ");
                double price = Double.parseDouble(scanner.nextLine());
                Product showerGel = new ShowerGel(id,name,volume,amount,price);
                return showerGel;
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
    public void edit(int index, Product product){
        listProducts.set(index,product);
        listProducts.get(index).setName(product.getName());
        listProducts.get(index).setVolume(product.getVolume());
        listProducts.get(index).setAmount(product.getAmount());
        listProducts.get(index).setPrice(product.getPrice());
    }
    public void delete (int index){
        listProducts.remove(index);
    }
    public void search (){
        System.out.println("Nhập tên muốn tìm");
        String name = scanner.nextLine();
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getName().contains(name)){
                System.out.println(listProducts.get(i).toString());
            }
        }
    }
    public void sortPrice(){
        List<Product> sortedListProduct = listProducts.stream().sorted(Comparator.comparing(o -> o.getPrice())).collect(Collectors.toList());
        for (int i = 0; i < sortedListProduct.size(); i++) {
            System.out.println(sortedListProduct.get(i));
        }
    }
}
