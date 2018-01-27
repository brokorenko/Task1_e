package main.java.com.andy.task1_oop.dao;

import main.java.com.andy.task1_oop.model.search.SearchCriteria;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface ApplianceDAO {
    ArrayList<String> find(SearchCriteria searchCriteria) throws Exception;
}
