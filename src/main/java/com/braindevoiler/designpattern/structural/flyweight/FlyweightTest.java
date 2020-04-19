package com.braindevoiler.designpattern.structural.flyweight;

public class FlyweightTest {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    /*
     * Flyweight pattern is used when one instance of a class can be used to provide many virtual instances.
     *
     * It reduces the number of object instances at runtime, saving memory.
     *
     * It centralizes state for many virtual objects into a single location.
     *
     * It is used when a class has many instances, and they can all be controlled identically.
     *
     * A drawback of the Flyweight pattern is that once you've implemented it, single, logical instances of the class
     * will not be able to behave independently from the other instances.
     *
     * Each "flyweight" object is divided into two pieces: the state-dependent (extrinsic) part, and the
     * state-independent (intrinsic) part. Intrinsic state is stored (shared) in the Flyweight object. Extrinsic
     * state is stored or computed by client objects, and passed to the Flyweight when its operations are invoked.
     *
     * Flyweights are stored in a Factory's repository. The client restrains herself from creating Flyweights
     * directly, and requests them from the Factory. Each Flyweight cannot stand on its own. Any attributes that
     * would make sharing impossible must be supplied by the client whenever a request is made of the Flyweight.
     *
     * Modern web browsers use this technique to prevent loading same images twice. When browser loads a web page,
     * it traverse through all images on that page. Browser loads all new images from Internet and places them the
     * internal cache. For already loaded images, a flyweight object is created, which has some unique data like
     * position within the page, but everything else is referenced to the cached one.
     */
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
