package view;

import controller.ProductManager;

import java.util.Scanner;

public class AdminMenu {
    Scanner scanner = new Scanner(System.in);
    ProductManager productManager = new ProductManager();

    public void showAdminMenu(){
        int a = 0;
        while (true) {
            System.out.println("""
                    -----------------------------------------
                    |************* ADMIN MENU **************|
                    -----------------------------------------
                    | 1. Thêm sản phẩm                      |
                    | 2. Hiển thị tất cả sản phẩm           |
                    | 3. Xóa sản phẩm                       |
                    | 4. Sửa danh sách các sản phẩm         |
                    | 5. Tìm kiếm sản phẩm                  |
                    | 6. Hiển thị danh sách đã được sắp xếp |
                    | 7. Thoát                              |
                    | Mời bạn nhập lựa chọn                 |
                    -----------------------------------------
                    """);
            a = Integer.parseInt(scanner.nextLine());
            switch (a){
                case 1-> {
                    System.out.println("Nhập sản phẩm muốn thêm");
                    productManager.add(productManager.createProduct());
                }
                case 2-> {
                    productManager.show();
                }
                case 3-> {
                    System.out.println("nhập tên sản phẩm muốn xóa");
                    String name = scanner.nextLine();
                    productManager.delete(productManager.findIdByName(name));
                }
                case 4-> {
                    System.out.println("Nhập tên sản phẩm muốn sửa");
                    String name1 = scanner.nextLine();
                    productManager.edit(productManager.findIdByName(name1), productManager.createProduct());
                }
                case 5->{
                    productManager.search();
                }
                case 6->{
                    productManager.sortPrice();
                }
                case 7->{
                    System.exit(0);
                }
            }
        }
    }
}
