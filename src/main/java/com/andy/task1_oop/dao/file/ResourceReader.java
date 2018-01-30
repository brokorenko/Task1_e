package main.java.com.andy.task1_oop.dao.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ResourceReader implements AutoCloseable {
    private Scanner scanner;
    private FileReader fileReader;

    {
        FilenameReader filenameReader = FilenameReader.getInstance();
        fileReader = new FileReader(filenameReader.getName());
        scanner = new Scanner(fileReader).useDelimiter("\\s*\\n\\s*");
    }

    private ResourceReader() throws FileNotFoundException {
    }

    public String readLine(){
        return scanner.next();
    }

    public boolean haveNextLine(){
        return  (scanner.hasNext());
    }

    @Override
    public void close() throws IOException {
        fileReader.close();
    }

    public static ResourceReader getResourceReaderInstance() throws FileNotFoundException {
        return new ResourceReader();
    }

}
