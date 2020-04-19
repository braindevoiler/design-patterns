package com.braindevoiler.designpattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ShapeFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShapeFactory.class);

    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            LOGGER.info("Creating circle of color : {}", color);
        }
        return circle;
    }
}
