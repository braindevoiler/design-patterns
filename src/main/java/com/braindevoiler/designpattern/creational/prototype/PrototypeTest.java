package com.braindevoiler.designpattern.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PrototypeTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrototypeTest.class);

    /**
     * Use the Prototype Pattern when creating an instance of a given class is either expensive or complicated.
     * <p>
     * It hides the complexities of making new instances from the client.
     * <p>
     * In some circumstances, copying an object can be more efficient than creating a new object.
     */
    public static void main(String args[]) {
        Employees employees = new Employees();
        employees.loadData();
        LOGGER.info("\nPrinting actual data:\n");
        employees.printData();
        try {
            Employees employeesClone = employees.clone();
            LOGGER.info("\nPrinting cloned data:\n");
            employeesClone.printData();
        } catch (CloneNotSupportedException e) {
            LOGGER.error("Error in cloning.", e);
        }
    }
}
