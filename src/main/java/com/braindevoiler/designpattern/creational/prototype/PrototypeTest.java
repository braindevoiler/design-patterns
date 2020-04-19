package com.braindevoiler.designpattern.creational.prototype;

public class PrototypeTest {
    /*
     * Use the Prototype Pattern when creating an instance of a given class is either expensive or complicated.
     *
     * It hides the complexities of making new instances from the client.
     *
     * In some circumstances, copying an object can be more efficient than creating a new object.
     */
    public static void main(String args[]){
        Employees employees = new Employees();
        employees.loadData();
        System.out.println("\nPrinting actual data:\n");
        employees.printData();
        try {
            Employees employeesClone = employees.clone();
            System.out.println("\nPrinting cloned data:\n");
            employeesClone.printData();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
