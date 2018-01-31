package main.java.com.andy.task1_oop.service.impl;

import main.java.com.andy.task1_oop.dao.ApplianceDAO;
import main.java.com.andy.task1_oop.dao.DAOFactory;
import main.java.com.andy.task1_oop.model.search.SearchCriteria;
import main.java.com.andy.task1_oop.service.Service;
import main.java.com.andy.task1_oop.service.validation.Validator;

import java.io.IOException;

public class ServiceImpl implements Service {
    @Override
    public String find(SearchCriteria searchCriteria) throws IOException {// опять String? я электротовары ищу, а не строки, ты должен был реализоать код, позволяющий создавать объекты иерархии, а не пытаться упростить задачу
    // если вам каждется, что какой-то кодписать должго и сложно - то это вам кажетс, нужно сейсть и разобраться
        // приставка в специальности 'инженер' и говорит, что вылжны сами уметь находить решения
        // фабрика обуви тебе тоже может кусок кожи дать и сказать, что это те ботинки, что ты ыискал - ведь ей так проще
        Validator validator = new Validator();// зачем тебе каждый раз новый валидатор?
        validator.checkCriteria(searchCriteria);

        DAOFactory daoFactory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = daoFactory.getApplianceDAO();
        return applianceDAO.find(searchCriteria);
    }
}
