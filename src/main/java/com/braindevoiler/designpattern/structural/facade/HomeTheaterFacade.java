package com.braindevoiler.designpattern.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HomeTheaterFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeTheaterFacade.class);

    private final Amplifier amplifier;
    private final DvdPlayer dvdPlayer;
    private final Projector projector;
    private final TheaterLights theaterLights;
    private final Screen screen;

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
        LOGGER.info("\n\nGet ready to watch a movie...");
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
        LOGGER.info("\n\nShutting movie theater down...");
        theaterLights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
