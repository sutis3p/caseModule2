package controller;

import model.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Account> listAccount = new ArrayList<>();

    public static int indexUser;

    final Account Admin = new Account("Admin","1","Quản trị viên",19);

    public AccountManager(){
        Account account = new Account("Admin","3","Admin",22);
    }

    public void CreateAccount(){
        String username;
        String password;
        String name;
        int age;
        do {
            System.out.println("Mời nhập username");
            username = scanner.nextLine();
            System.out.println("Mời nhập password");
            password = scanner.nextLine();
            System.out.println("Mời nhập tên hiển thị");
            name = scanner.nextLine();
            System.out.println("Mời nhập tuổi");
            age = Integer.parseInt(scanner.nextLine());
        } while (username.equals("") || password.equals("") || name.equals("") || age > 120 || age < 0);
    }

    public int login(String username, String password) {
        int check = 0;
        for (int i = 0; i < listAccount.size(); i++) {
            if (username.equals(listAccount.get(i).getUsername())) {
                if (password.equals(listAccount.get(i).getPassword())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean checkLogin(Account account) {
        for (int i = 0; i < listAccount.size(); i++) {
            if (account.getUsername().equals(listAccount.get(i).getUsername()) && account.getPassword().equals(listAccount.get(i).getPassword()))
                return true;
        }
        return false;
    }

}
