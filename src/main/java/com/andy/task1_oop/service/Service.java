package main.java.com.andy.task1_oop.service;

import main.java.com.andy.task1_oop.model.search.SearchCriteria;

import java.io.IOException;

public interface Service {
    String find(SearchCriteria searchCriteria) throws IOException;
}
