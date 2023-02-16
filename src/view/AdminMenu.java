package view;

import manager.ProductManager;

import java.util.Scanner;

public class AdminMenu {
    Scanner scanner = new Scanner(System.in);
    ProductManager productManager = new ProductManager();

    public void showAdminMenu(){
        System.out.println("""
                -----------------------
                |  Mời nhập lựa chọn  |
                -----------------------
                """);
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
                    -----------------------------------------
                    """);
            a = Integer.parseInt(scanner.nextLine());
            switch (a){
                case 1-> {
                    System.out.println("Nhập sản phẩm muốn thêm");
                }
                case 2-> {

                }
            }
        }
    }
}
