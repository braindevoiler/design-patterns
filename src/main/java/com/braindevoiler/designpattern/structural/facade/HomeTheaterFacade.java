package com.braindevoiler.designpattern.structural.facade;

public class HomeTheaterFacade {

    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private TheaterLights theaterLights;
    private Screen screen;

    public HomeTheaterFacade(Amplifier amplifier,
                             DvdPlayer dvdPlayer,
                             Projector projector,
                             TheaterLights theaterLights,
                             Screen screen) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("\n\nGet ready to watch a movie...");
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("\n\nShutting movie theater down...");
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
