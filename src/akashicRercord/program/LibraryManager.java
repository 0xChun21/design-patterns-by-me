package akashicRercord.program;


import akashicRercord.Akasha;
import akashicRercord.Member;
import akashicRercord.validator.ValidateDataInput;

import java.util.Scanner;

public class LibraryManager {

    public final static Scanner scanner = new Scanner(System.in);
    public final static ValidateDataInput validateDataInput = new ValidateDataInput();

    public static void main(String [] args) {

        Akasha book1 = new Akasha("1","De men phieu luu ky", "To Hoai", "Sach thieu nhi", "NXB van hoa", false);
        Akasha book2 = new Akasha("2","So do", "Vu Trong Phung", "Sach van hoa", "NXB van hoa", false);
        Akasha book3 = new Akasha("3","Truyen kieu", "Nguyen Du", "Tho", "NXB giao duc", false);
        Akasha book4 = new Akasha("4","Thuong vo", "Tu Xuong", "Tho", "NXB Ha Noi", false);
        Akasha book5 = new Akasha("5","Co Gai Den tu hom qua", "Nguyen Nhat Anh", "Sach tinh yeu", "NXB Ho Chi Minh", false);
        Akasha book6 = new Akasha("6","Kinh Van Hoa", "Nguyen Nhat Anh", "Sach thieu nhi", "NXB Ho Chi Minh", false);
        Akasha book7 = new Akasha("7","Khong bao gio that bai", "Chung Ju-yung", "Tu truyen", "NXB first news", false);

//        Member member1 = new Member("Nguyen Hoang Trung", "trungnh@akashic.com", "0912792335");
//        Member member2 = new Member("Chun Chun","chunchun@akashic.com", "0855503545");
//        Member member3 = new Member("Vu Ngoc Anh", "anhvn@akashic.com", "0855505555");

        boolean optional = true;
        while(optional){
            System.out.println("Chuong trinh quan ly thu vien");
            System.out.println("1. danh sach Akasha");
            System.out.println("2. Tao thanh vien moi ");
            System.out.println("---- bat dau chuong trinh --------");
            System.out.print("Nhap chuc nang can thao tac: " );
            int check = scanner.nextInt();
            switch (check){

                case 1:{
                    System.out.println("1. danh sach Akasha");
                    break;
                }
                case 2:{
                    System.out.println("2. Tao thanh vien moi ");
                    System.out.print("Nhap so thanh vien can tao: ");
                    int totalMember = scanner.nextInt();
                    for (int i = 1; i < totalMember; i++) {
                        System.out.println("Nhap thanh vien moi");
                        System.out.print("Ho va Ten: ");
                        String name = scanner.nextLine();
                        System.out.print("email: ");
                        String email = scanner.nextLine();
                        System.out.println("so dien thoai: ");
                        String phone = scanner.nextLine();
                        Member member = new Member(name, email, phone);
                        System.out.println("Tao thanh vien " + name.toUpperCase() + "thanh cong");
                    }
                    break;
                }
            }
        }

    }
}
