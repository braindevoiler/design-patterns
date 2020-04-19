package com.braindevoiler.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Employees implements Cloneable {
    private static final Logger LOGGER = LoggerFactory.getLogger(Employees.class);

    private final List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    public void loadData() {
        // Load data from DB
        empList.add("Ankur Gupta");
        empList.add("Suresh Gupta");
        empList.add("Sarita Gupta");
    }

    public void printData() {
        for (String emp : this.empList) {
            LOGGER.info(emp);
        }
    }

    @Override
    protected Employees clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<>(this.empList);
        return new Employees(tempList);
    }
}
