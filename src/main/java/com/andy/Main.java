package main.java.com.andy;

import main.java.com.andy.task1_oop.model.search.Criteria;
import main.java.com.andy.task1_oop.model.search.SearchCriteria;
import main.java.com.andy.task1_oop.service.Service;
import main.java.com.andy.task1_oop.service.ServiceFactory;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
/*        String [] s = new String[]{"POWER_CONSUMPTION=100"};

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
        }*/
        HashMap<Criteria.VacuumCleaner, Object> criterias = new HashMap<>();
        criterias.put(Criteria.VacuumCleaner.FILTER_TYPE, "B");
        criterias.put(Criteria.VacuumCleaner.WAND_TYPE, "all-in-one");
        HashMap<Criteria.VacuumCleaner, Object> criterias1 = new HashMap<>();
        criterias1.put(Criteria.VacuumCleaner.FILTER_TYPE, "A");
        criterias1.put(Criteria.VacuumCleaner.WAND_TYPE, "all-in-one");

        SearchCriteria<Criteria.VacuumCleaner> searchCriteria = new SearchCriteria<>();
        searchCriteria.setProductName("VacuumCleaner");
        searchCriteria.setCriteria(criterias);

        SearchCriteria<Criteria.VacuumCleaner> searchCriteria1 = new SearchCriteria<>();
        searchCriteria1.setProductName("VacuumCleaner");
        searchCriteria1.setCriteria(criterias1);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        Service service = serviceFactory.getService();
        try {
            System.out.println(service.find(searchCriteria));
            System.out.println(service.find(searchCriteria1));
        } catch (FileNotFoundException e) {
            System.out.println("Cant find file");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
