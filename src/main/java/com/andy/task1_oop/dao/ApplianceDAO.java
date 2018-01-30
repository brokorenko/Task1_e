package main.java.com.andy.task1_oop.dao;

import main.java.com.andy.task1_oop.model.search.SearchCriteria;

import java.io.IOException;

public interface ApplianceDAO {
    String find(SearchCriteria searchCriteria) throws IOException;
}
