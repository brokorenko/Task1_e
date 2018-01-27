package main.java.com.andy.task1_oop.model.search;

import java.util.HashMap;
import java.util.Map;

public final class SearchCriteria<T> {
    private Map<T, Object> criteria = new HashMap<>();
    private String productName = "";

    public void setCriteria(HashMap<T, Object> criteria) {
        this.criteria = criteria;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Map<T, Object> getCriteria() {
        return criteria;
    }
    public String getProductName() {
        return productName;
    }
}
