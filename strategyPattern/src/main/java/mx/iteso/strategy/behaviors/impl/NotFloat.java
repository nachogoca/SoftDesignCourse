package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FloatBehavior;

public class NotFloat implements FloatBehavior   {
    public String floatt() {
        return "I'm not floating!";
    }
}
