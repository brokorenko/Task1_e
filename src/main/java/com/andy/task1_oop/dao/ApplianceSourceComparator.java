package main.java.com.andy.task1_oop.dao;

public class ApplianceSourceComparator {
    public boolean match(Object applianceParamName, Object applianceParamValue, String fileLine){
        return fileLine.contains(String.valueOf(applianceParamName) + "=" + String.valueOf(applianceParamValue));
    }
}
