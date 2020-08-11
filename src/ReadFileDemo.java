import PhoneModel.PhoneBook;
import PhoneStorage.FilePhone;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFileDemo {
    public static void main(String[] args) throws IOException {
        FilePhone filePhone = new FilePhone();
        ArrayList<PhoneBook> newList = filePhone.readFile();
        for (PhoneBook phoneBook : newList) {
            System.out.println(phoneBook);
        }
    }
}
