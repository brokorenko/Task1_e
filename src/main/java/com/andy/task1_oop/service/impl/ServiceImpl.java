package main.java.com.andy.task1_oop.service.impl;

import main.java.com.andy.task1_oop.dao.ApplianceDAO;
import main.java.com.andy.task1_oop.dao.DAOFactory;
import main.java.com.andy.task1_oop.model.search.SearchCriteria;
import main.java.com.andy.task1_oop.service.Service;
import main.java.com.andy.task1_oop.service.validation.Validator;

import java.io.IOException;

public class ServiceImpl implements Service {
    @Override
    public String find(SearchCriteria searchCriteria) throws IOException {
        Validator validator = new Validator();// зачем тебе каждый раз новый валидатор?
        validator.checkCriteria(searchCriteria);

        DAOFactory daoFactory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = daoFactory.getApplianceDAO();
        return applianceDAO.find(searchCriteria);
    }
}
