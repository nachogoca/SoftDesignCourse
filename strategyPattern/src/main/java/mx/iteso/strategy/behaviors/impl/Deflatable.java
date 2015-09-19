package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.DeflateBehavior;

public class Deflatable implements DeflateBehavior {
    public String deflate() {
        return "I'm deflating!";
    }

    public String inflate() {
        return "I'm inflating!";
    }
}
