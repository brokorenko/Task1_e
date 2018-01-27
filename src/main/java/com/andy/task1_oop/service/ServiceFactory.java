package main.java.com.andy.task1_oop.service;

import main.java.com.andy.task1_oop.service.impl.ServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final Service service = new ServiceImpl();

    public static ServiceFactory getInstance() {
        return instance;
    }

    public Service getService() {
        return service;
    }
}
