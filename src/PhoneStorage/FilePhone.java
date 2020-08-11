package PhoneStorage;

import PhoneModel.PhoneBook;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilePhone{
    private static final String fileName = "D:\\TH_Module_2\\src\\data\\contacts.csv";
    private String header = "Số điện thoại,Nhóm,Họ tên,Giới tính,Địa chỉ,Ngày sinh,Email";
    File file = new File(fileName);
    public void writeFile(ArrayList<PhoneBook> phoneBooks) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(header + "\n");
        for (PhoneBook phoneBook : phoneBooks) {
            String[] info = phoneBook.infoToString();
            bufferedWriter.write(info[0]);
            for (int i=1; i < info.length; i++) {
                bufferedWriter.write("," + info[i]);
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
    }

    public ArrayList<PhoneBook> readFile() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        bufferedReader.readLine();
        ArrayList<PhoneBook> newList = new ArrayList<>();
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] info = line.split(",");
            PhoneBook newPhoneBook = new PhoneBook();
            newPhoneBook.setPhoneNumber(info[0]);
            newPhoneBook.setGroup(info[1]);
            newPhoneBook.setFullName(info[2]);
            newPhoneBook.setGender(info[3]);
            newPhoneBook.setAddress(info[4]);
            newPhoneBook.setBirthday(info[5]);
            newPhoneBook.setEmail(info[6]);
            newList.add(newPhoneBook);
        }
        return newList;
    }
}
