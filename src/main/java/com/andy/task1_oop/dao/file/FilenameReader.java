package main.java.com.andy.task1_oop.dao.file;

import java.io.FileNotFoundException;
import java.util.ResourceBundle;

public class FilenameReader {
    private ResourceBundle rb = ResourceBundle.getBundle("config");

    private FilenameReader() throws FileNotFoundException {
    }

    public String getName(){
        return rb.getString("filename");
    }

    public static FilenameReader getInstance() throws FileNotFoundException {
        return new FilenameReader();
    }
}
