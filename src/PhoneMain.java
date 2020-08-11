import PhoneBookManager.PhonebookManager;
import PhoneStorage.FilePhone;

import java.io.IOException;
import java.util.Scanner;

public class PhoneMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        PhonebookManager phonebookManager = new PhonebookManager();
        FilePhone filePhone = new FilePhone();
        while (true){
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
                    phonebookManager.showPhone();
                    break;
                case 2:
                    phonebookManager.addPhoneBook();
                    break;
                case 3:
                    System.out.println("Nhập số điện thoại thay đổi: ");
                    String numberPhone1 = sc.nextLine();
                    phonebookManager.editPhone(numberPhone1);
                    break;
                case 4:
                    System.out.println("Nhập số điện thoại cần xóa: ");
                    String numberPhone = sc.nextLine();
                    phonebookManager.deletePhone(numberPhone);
                    break;
                case 5:
//                    phonebookManager.findPhone();
                    System.out.println("----------Find----------");
                    System.out.println("1. Tìm theo tên");
                    System.out.println("2. Tìm theo mã sản phẩm");
                    System.out.println("-----------------------");
                    System.out.println("Vui lòng chọn: ");
                    int findPhone = Integer.parseInt(sc.nextLine());
                    while (true){
                        switch (findPhone){
                            case 1:
                                System.out.println("Nhập số điện thoại cần tìm: ");
                                String phoneNumber = sc.nextLine();
                                phonebookManager.findPhoneByPhonenumber(phoneNumber);
                                break;
                            case 2:
                                System.out.println("Nhập số điện thoại cần tìm: ");
                                String phoneName = sc.nextLine();
                                phonebookManager.findPhoneByFullName(phoneName);
                                break;
                            case 0:
                                System.out.println("Thoát tìm kiếm! Quay lại màn hình chính.");
                        }
                        break;
                    }
                    break;
                case 6:
                    filePhone.readFile();
                    break;
                case 7:
                    //filePhone.writeFile();
                    break;
                case 0:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Không hợp lệ! Vui lòng chọn lại:  ");
            }
        }




    }
}
