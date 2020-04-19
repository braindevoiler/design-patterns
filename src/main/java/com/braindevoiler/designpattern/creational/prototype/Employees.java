package com.braindevoiler.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;


public class Employees implements Cloneable {
    private List<String> empList;

    public Employees() {
        empList = new ArrayList<String>();
    }

    public Employees(List<String> empList){
        this.empList = empList;
    }

    public void loadData() {
        // Load data from DB
        empList.add("Ankur Gupta");
        empList.add("Nandni Gupta");
        empList.add("Suresh Gupta");
        empList.add("Sarita Gupta");
    }

    public void printData() {
        for(String emp : this.empList) {
            System.out.println(emp);
        }
    }

    @Override
    protected Employees clone() throws CloneNotSupportedException {
        List<String> tempList = new ArrayList<String>();
        for(String emp : this.empList) {
            tempList.add(emp);
        }
        return new Employees(tempList);
    }
}
