package com.braindevoiler.designpattern.structural.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface GumballMachineRemoteProxy extends Remote {

    void insertQuarter() throws RemoteException;

    void ejectQuarter() throws RemoteException;

    void turnCrank() throws RemoteException;

    void report() throws RemoteException;
}
