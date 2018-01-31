package main.java.com.andy.task1_oop.dao;

public class ApplianceSourceComparator {
    public boolean match(Object applianceParamName, Object applianceParamValue, String fileLine){
        return fileLine.contains(String.valueOf(applianceParamName) + "=" + String.valueOf(applianceParamValue));
        // и вот ради одной этой строки, где, кстати, лучше использовать StringBuilder, ты потом каждый раз создаешь новый объект? МОжет один и тот же постараться использовать?
    }
}
