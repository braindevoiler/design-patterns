package com.braindevoiler.designpattern.structural.proxy;

import java.rmi.Naming;


public class GumballMonitorTest {
    /*
     * The Proxy Pattern provides a surrogate or placeholder for another object to control access to it.
     *
     * Use the Proxy Pattern to create a representative object that controls access to another object, which may be
     * remote, expensive to create or in need of securing.
     *
     * A remote proxy controls access to a remote object.
     *
     * A virtual proxy controls access to a resource that is expensive to create.
     * The virtual proxy often defers the creation of the object until it is needed.
     * The virtual proxy also acts as a surrogate for the object before and while it is being created. After that,
     * the proxy delegates requests directly to the RealSubject.
     *
     * A caching proxy maintains a cache of previously created objects and when a request is made it returns cached
     * objects, if possible.
     *
     * A protection proxy controls access to a resource based on access rights.
     */
    public static void main(String[] args) {
        try {
            String location = "rmi://127.0.0.1:9099/gumballmachine";
            GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location);
            GumballMonitor monitor = new GumballMonitor(machine);
            monitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
