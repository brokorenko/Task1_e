package main.java.com.andy.task1_oop;// зачем этот класс лежит в корне всего проекта?

import main.java.com.andy.task1_oop.model.search.Criteria;
import main.java.com.andy.task1_oop.model.search.SearchCriteria;
import main.java.com.andy.task1_oop.service.Service;
import main.java.com.andy.task1_oop.service.ServiceFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Criteria.VacuumCleaner, Object> criterias = new HashMap<>();
        criterias.put(Criteria.VacuumCleaner.FILTER_TYPE, "B");
        criterias.put(Criteria.VacuumCleaner.WAND_TYPE, "all-in-one");

        SearchCriteria<Criteria.VacuumCleaner> searchCriteria = new SearchCriteria<>();
        searchCriteria.setProductName("VacuumCleaner");
        searchCriteria.setCriteria(criterias);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        Service service = serviceFactory.getService();

        try {
            System.out.println(service.find(searchCriteria));
        } catch (FileNotFoundException e) {
            System.out.println("Cant find file");
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
