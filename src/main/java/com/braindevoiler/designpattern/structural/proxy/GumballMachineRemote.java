package com.braindevoiler.designpattern.structural.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;

}
