package PhoneStorage;

import PhoneModel.PhoneBook;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilePhone{
    private static final String fileName = "D:\\TH_Module_2\\src\\data\\contacts.csv";
    File file = new File(fileName);
    public ArrayList<PhoneBook> readFile() throws IOException {
        BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
        bufferedReader.readLine();
        ArrayList<PhoneBook> phoneBooks = new ArrayList<>();
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            String[] tokens = line.split(",");
//            System.out.println(Arrays.toString(tokens));
            PhoneBook phoneBook = new PhoneBook(tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6]);
            phoneBooks.add(phoneBook);
        }
        return phoneBooks;
    }

    public void writeFile(ArrayList<PhoneBook> phoneBooks){
        for (PhoneBook phoneBook : phoneBooks) {
            phoneBook.
        }

    }
}
