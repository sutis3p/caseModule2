package view;

import manager.AccountManager;
import manager.ProductManager;

import java.util.Scanner;

public class UserMenu {
    Scanner scanner = new Scanner(System.in);
    ProductManager productManager = new ProductManager();
    AccountManager accountManager = new AccountManager();
    public void showMenuUser(){
        int a = Integer.parseInt(scanner.nextLine());
        while (true) {
            System.out.println("""
                    ------------------------------------------------
                    |***************** User menu ******************|
                    ------------------------------------------------
                    | 1. Nhập 1 để xem danh sách sản phẩm          |
                    | 2. Nhập 2 để xem danh sách sản phẩm theo giá |
                    | 3. Nhập 3 để thêm sản phẩm vào giỏ hàng      |
                    | 4. Nhập 4 để xem sản phẩm trong giỏ hàng     |
                    | 5. Nhập 5 để mua hàng                        |
                    | 6. Nhập 6 để xem bill                        |
                    | 7. Nhập 7 để thoát                           |
                    | Mời bạn nhập lựa chọn                        |
                    ------------------------------------------------
                    """);
            switch (a){
                case 1->{
                    productManager.show();
                }
                case 2->{
                    productManager.sortPrice();
                }
                case 3->{

                }
                case 4->{

                }
                case 5->{

                }
                case 6->{

                }
                case 7->{
                    System.exit(0);
                }
        }

        }
    }
}
