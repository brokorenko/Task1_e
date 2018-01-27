package main.java.com.andy.task1_oop.service.validation;

import main.java.com.andy.task1_oop.model.search.SearchCriteria;

public class Validator {
    public void checkCriteria(SearchCriteria searchCriteria){
        if (searchCriteria.getProductName().isEmpty())
         {
            throw new IllegalArgumentException("Validation error, empty project name");
         }

         if (searchCriteria.getCriteria().isEmpty())
         {
            throw new IllegalArgumentException("Validation error, empty criteria");
         }
    }
}
