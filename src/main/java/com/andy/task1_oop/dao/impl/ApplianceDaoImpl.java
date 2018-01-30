package main.java.com.andy.task1_oop.dao.impl;

import main.java.com.andy.task1_oop.dao.ApplianceDAO;
import main.java.com.andy.task1_oop.dao.ApplianceSourceComparator;
import main.java.com.andy.task1_oop.dao.file.ResourceReader;
import main.java.com.andy.task1_oop.model.search.SearchCriteria;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Если имя продукта не указано???

public class ApplianceDaoImpl implements ApplianceDAO {

    @Override
    public String find(SearchCriteria searchCriteria) throws IOException {

        String appliance = null;
        int entryCount;
        Iterator<Map.Entry> criteriaIterator;

        final ResourceReader rs = ResourceReader.getResourceReaderInstance();
        final ApplianceSourceComparator applianceSourceComparator = new ApplianceSourceComparator();

        Set<HashMap.Entry> set = searchCriteria.getCriteria().entrySet();

        try {
            while (rs.haveNextLine()){
                String checkLine;
                entryCount = 0;
                checkLine = rs.readLine();
                criteriaIterator = set.iterator();

                if (checkLine.contains(searchCriteria.getProductName())){

                    while (criteriaIterator.hasNext()){
                        Map.Entry entryCheck= criteriaIterator.next();

                        if (applianceSourceComparator.match(entryCheck.getKey(), entryCheck.getValue(), checkLine)){
                            entryCount++;
                        }

                        if (set.size() == entryCount){
                            appliance = checkLine;
                            break;
                        }
                    }
                }
            }
        } finally {
            rs.close();
        }
        return appliance;
    }
}
