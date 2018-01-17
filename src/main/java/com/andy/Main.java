package main.java.com.andy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] s = new String[]{"POWER_CONSUMPTION=100"};

        String filename = "C:\\Users\\Andrew\\IdeaProjects\\Task1_e\\src\\main\\java\\resources\\appliances_db.txt";
        Scanner scanner = null;
        String check;
        int i;

        try {
            FileReader fileReader = new FileReader(filename);
            scanner = new Scanner(fileReader).useDelimiter("\\s*\\n\\s*");
            while (scanner.hasNext()){
                i = 0;
                check = scanner.next();

                while (i < s.length) {
                    if (check.contains(s[i])){
                        i++;
                    } else break;
                }

                if (i == s.length)
                {
                    System.out.println(check);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Error");
        }
    }
}
