package main.java.com.andy.task1_oop.service;

import main.java.com.andy.task1_oop.model.search.SearchCriteria;

import java.util.ArrayList;

public interface Service {
    ArrayList<String> find(SearchCriteria searchCriteria) throws Exception;
}
