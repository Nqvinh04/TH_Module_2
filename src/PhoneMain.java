import PhoneBookManager.PhonebookManager;

import java.util.Scanner;

public class PhoneMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        PhonebookManager phonebookManager = new PhonebookManager();

        System.out.println("-----Chương Trình Quản Lý Danh Bạ-----");
        System.out.println("Chọn chức năng theo số (để tiếp tục): ");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng: ");
        int choose = Integer.parseInt(sc.nextLine());

        switch (choose) {
            case 1:
        }



    }
}
