package main.java.com.andy.task1_oop.dao;

import main.java.com.andy.task1_oop.dao.impl.ApplianceDaoImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();  //Зачем final?, к ним и так нет доступа
    private final ApplianceDAO applianceDAO = new ApplianceDaoImpl();

    public ApplianceDAO getApplianceDAO() {
        return applianceDAO;
    }

    public static DAOFactory getInstance(){
        return instance;
    }
    private DAOFactory() {
    }
}
