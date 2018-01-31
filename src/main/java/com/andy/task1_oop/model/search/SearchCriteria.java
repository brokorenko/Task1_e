package main.java.com.andy.task1_oop.model.search;// search - и что за поисковый код у тебя в пакете лежит? имена подбирай аккуратно

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
