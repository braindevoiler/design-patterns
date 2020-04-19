package com.braindevoiler.designpattern.structural.facade;

public class FacadeTest {

    /*
     * The Facade Pattern provides a unified interface to a set of interfaces in a subsystem.
     * Facade defines a higher level interface that makes the subsystem easier to use.
     *
     * In simple words, the Facade Pattern makes an interface simpler.
     * It makes a subsystem easier to use through a simplified interface.
     *
     * Facade Pattern allows us to avoid tight coupling between clients and subsystems.
     *
     * To use it, we create a class that simplifies and unifies a set of more complex classes that
     * belong to some subsystem. Client talks only with the Facade class for the functionality.
     */
    public static void main(String args[]) {
        Screen screen = new Screen();
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        DvdPlayer dvdPlayer = new DvdPlayer(amplifier, projector);
        TheaterLights theaterLights = new TheaterLights();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, projector, theaterLights, screen);
        homeTheater.watchMovie("Judwaa");
        homeTheater.endMovie();

    }
}
