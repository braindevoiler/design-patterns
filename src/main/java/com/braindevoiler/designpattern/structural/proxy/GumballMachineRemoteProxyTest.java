package com.braindevoiler.designpattern.structural.proxy;

import java.rmi.Naming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GumballMachineRemoteProxyTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(GumballMachineRemoteProxyTest.class);

    /**
     * The Proxy Pattern provides a surrogate or placeholder for another object to control access to it. Use the
     * Proxy Pattern to create a representative object that controls access to another object, which may be
     * remote, expensive to create or in need of securing. The following are the different kinds of proxies:
     * <p>
     * <b>1. Remote Proxy:</b> A remote proxy controls access to a remote object.
     * <p>
     * <b>2. Virtual Proxy:</b> A virtual proxy controls access to a resource that is expensive to create. The virtual
     * proxy often defers the creation of the object until it is needed. The virtual proxy also acts as a surrogate
     * for the object before and while it is being created. After that, the proxy delegates requests directly to the
     * RealSubject.
     * <p>
     * <b>3. Caching Proxy:</b> A caching proxy maintains a cache of previously created objects and when a request is
     * made it returns cached objects, if possible.
     * <p>
     * <b>4. Protection Proxy:</b> A protection proxy controls access to a resource based on access rights.
     */
    public static void main(String[] args) {
        try {
            String location = "rmi://127.0.0.1:9099/gumballmachine";
            GumballMachineRemoteProxy remoteProxyMachine = (GumballMachineRemoteProxy) Naming.lookup(location);
            remoteProxyMachine.report();
            remoteProxyMachine.insertQuarter();
            remoteProxyMachine.turnCrank();
            remoteProxyMachine.turnCrank();
            remoteProxyMachine.ejectQuarter();
            remoteProxyMachine.report();
        } catch (Exception e) {
            LOGGER.error("Error:", e);
        }
    }
}
