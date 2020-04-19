package com.braindevoiler.designpattern.structural.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Circle implements Shape {
    private static final Logger LOGGER = LoggerFactory.getLogger(Circle.class);

    private final String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        LOGGER.info("Circle: Draw() [Color : {}, x : {}, y : {}, radius : {}", color, x, y, radius);
    }
}
