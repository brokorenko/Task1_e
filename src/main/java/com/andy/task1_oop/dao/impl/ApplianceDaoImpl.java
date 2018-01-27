package main.java.com.andy.task1_oop.dao.impl;

import main.java.com.andy.task1_oop.dao.ApplianceDAO;
import main.java.com.andy.task1_oop.dao.ApplianceSourceComparator;
import main.java.com.andy.task1_oop.dao.file.ResourceReader;
import main.java.com.andy.task1_oop.model.search.SearchCriteria;

import java.util.*;


//Если имя продукта не указано???

public class ApplianceDaoImpl implements ApplianceDAO {
    @Override
    public ArrayList<String> find(SearchCriteria searchCriteria) throws Exception {

        String checkLine;
        int entryCount;
        ArrayList<String> appliances = new ArrayList<>();
        Iterator<Map.Entry> criteriaIterator;

        ResourceReader rs = ResourceReader.getResourceReaderInstance();
        ApplianceSourceComparator applianceSourceComparator = new ApplianceSourceComparator();

        Set<HashMap.Entry> set = searchCriteria.getCriteria().entrySet();
        try {
            while (rs.haveNextLine()){
                entryCount = 0;
                checkLine = rs.readLine();
                criteriaIterator = set.iterator();
                if (checkLine.contains(searchCriteria.getProductName())){
                    while (criteriaIterator.hasNext()){
                        Map.Entry entryCheck= criteriaIterator.next();
                        //keyValue = String.valueOf(iterator.next()); //Not toString!!
                        if (applianceSourceComparator.match(entryCheck.getKey(), entryCheck.getValue(), checkLine)){
                            entryCount++;
                        }
                        if (set.size() == entryCount){
                            appliances.add(checkLine);
                            break;
                        }
                    }
                }
            }
        } finally {
            rs.close();
        }
        return appliances;
    }
}
