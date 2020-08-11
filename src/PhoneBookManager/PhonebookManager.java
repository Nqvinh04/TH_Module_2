package PhoneBookManager;

import PhoneModel.PhoneBook;
import PhoneStorage.FilePhone;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PhonebookManager {

    public static Scanner sc = new Scanner(System.in);
    private FilePhone filePhone;
    private ArrayList<PhoneBook> phoneBookArrayList;

//    public PhonebookManager() throws IOException {
//        filePhone = new FilePhone();
//        phoneBookArrayList = filePhone.readFile();
//    }

    // xem danh sách danh bạ
    public void showPhone(){

    }

    // thêm mới danh bạ
    public void addPhoneBook(){

    }

    // cập nhật danh bạ
    public  void editPhone(){

    }

    // xóa thông tin danh bạn
    public void deletePhone(){

    }

    // Tìm số điện thoại
    public void findPhone(){

    }

//    // Đọc văn bản
//    public void readFile(){
//
//    }
//
//    // ghi văn bản
//    public void writeFile(){
//
//    }

    //Nhập số điện thoại
    public String inputPhoneNumber(){
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        return phoneNumber;
//        String regexPhoneNumber ="[0-9]{10}";
//        if (phoneNumber.equals(regexPhoneNumber)){
//            return phoneNumber;
//        } else {
//            System.out.println("Vui lòng nhập lại thông tin: ");
//        }

    }

    // Nhập nhóm của danh bạ
    public String inputGroup(){
        System.out.println("Nhập nhóm danh bạ: ");
        return sc.nextLine();
    }
    // Nhập họ tên
    public String inputFullName(){
        System.out.println("Nhập Họ Tên: ");
        return sc.nextLine();
    }
    // Nhập Giới tính
    public String inputGender(){
        System.out.println("Nhập Giới Tính: ");
        return sc.nextLine();
    }
    // Nhập địa chỉ
    public String inputAddress(){
        System.out.println("Nhập Địa Chỉ: ");
        return sc.nextLine();
    }
    // Nhập ngày sinh
    public String inputBirthday(){
        System.out.println("Nhập Ngày Sinh: ");
        return sc.nextLine();
    }
    // Nhập emails
    public String inputEmail(){
        System.out.println("Nhập Email: ");
        return sc.nextLine();
    }

}
