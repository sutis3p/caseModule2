package view;

import controller.AccountManager;
import controller.ProductManager;

import java.util.Scanner;

public class Client {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        AccountManager accountManager = new AccountManager();
        AdminMenu adminMenu = new AdminMenu();
        UserMenu userMenu = new UserMenu();

        while (true) {
            int choice = 0;
            System.out.println("""
                    ------------------------
                    |   Mời nhập lựa chọn  |
                    | 1. Đăng kí           |
                    | 2. Đăng nhập         |
                    ------------------------
                    """);
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.println("Đăng kí: ");
                    accountManager.CreateAccount();
                    System.out.println(AccountManager.listAccount);
                }
                case 2 -> {
                    System.out.println("Đăng nhập: ");
                    System.out.println("Nhập tên đăng nhập");
                    String username = scanner.nextLine();
                    System.out.println("Nhập mật khẩu");
                    String password = scanner.nextLine();
                    if (username.equals("Admin")) {
                        if (password.equals("1"))
                            adminMenu.showAdminMenu();
                        else System.out.println("Sai mật khẩu admin");
                    } else {
                        if (accountManager.login(username, password) != -1) {
                            System.out.println("Đăng nhập thành công");
                            AccountManager.indexUser = accountManager.login(username, password);
                            userMenu.showMenuUser();
                        } else {
                            System.out.println("Mật khẩu hoặc tài khoản đã sai");
                        }
                    }
                }
            }
        }
    }
}
