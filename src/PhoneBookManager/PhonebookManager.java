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

    public PhonebookManager() throws IOException {
        filePhone = new FilePhone();
        phoneBookArrayList = filePhone.readFile();
    }

    // xem danh sách danh bạ
    public void showPhone() throws IOException {
        phoneBookArrayList = filePhone.readFile();
        System.out.println(phoneBookArrayList);
//        for (PhoneBook phoneBookList: phoneBookArrayList){
//            System.out.println(phoneBookList.getPhoneNumber());
//        }
    }

    // thêm mới danh bạ
    public void addPhoneBook(){
        String phoneNumber = inputPhoneNumber();
        String group = inputGroup();
        String fullName = inputFullName();
        String gender = inputGender();
        String address = inputAddress();
        String birthday = inputBirthday();
        String email = inputEmail();
        PhoneBook phoneBook = new PhoneBook
                ( phoneNumber, group, fullName, gender, address, birthday, email );
        phoneBookArrayList.add(phoneBook);
        System.out.println(phoneBookArrayList);
    }

    // cập nhật danh bạ
    public  void editPhone(String phoneNumber){
        boolean isExist = false;
        for (PhoneBook phoneBook : phoneBookArrayList) {
            if (phoneBook.getPhoneNumber().equals(phoneNumber)) {
                isExist = true;
                phoneBook.setPhoneNumber(inputPhoneNumber());
                phoneBook.setGroup(inputGroup());
                phoneBook.setGender(inputGender());
                phoneBook.setAddress(inputAddress());
                phoneBook.setBirthday(inputBirthday());
                phoneBook.setEmail(inputEmail());
                break;
            }
            if (!isExist){
                System.out.println("Sô điện thoại: " + phoneNumber + "không tồn tại");
            } else {
                System.out.println(phoneBookArrayList);
            }
        }
    }

    // xóa thông tin danh bạn
    public void deletePhone(String phoneNumber){
        PhoneBook phoneBook = null;
        int size = phoneBookArrayList.size();
        for (int i = 0; i < size; i++){
            if(phoneBookArrayList.get(i).getPhoneNumber().equals(phoneNumber)){
                phoneBook = phoneBookArrayList.get(i);
                break;
            }
        }
        if (phoneBook != null){
            phoneBookArrayList.remove(phoneBook);
            //filePhone.writeFile(phoneBookArrayList);
        } else {
            System.out.printf("Sô điện thoại = %d không tồn tại.\n",phoneNumber );
        }
    }


    // Tìm số điện thoại
    public void findPhoneByPhonenumber(String phoneNumber) {
        for (PhoneBook phoneNumberList : phoneBookArrayList) {
            if (phoneNumberList.getPhoneNumber().equals(phoneNumber)) {
                System.out.println(phoneNumberList);
            }

        }
    }

    public void findPhoneByFullName(String fullName) {
        for (PhoneBook phoneNumberList : phoneBookArrayList) {
            if (phoneNumberList.getPhoneNumber().equals(fullName)) {
                System.out.println(phoneNumberList);
            }
        }
    }

    //Nhập số điện thoại
    public String inputPhoneNumber(){
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        return phoneNumber;

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
