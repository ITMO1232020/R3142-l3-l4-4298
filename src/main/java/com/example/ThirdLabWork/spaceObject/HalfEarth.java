package com.example.ThirdLabWork.spaceObject;

import com.example.ThirdLabWork.surface.Environment;
import com.example.ThirdLabWork.surface.EnvironmentColor;

public class HalfEarth extends BaseDecorator {

    public HalfEarth(Environment surface) {
        this.environment = surface;
        name = "Half Earth";
    }

    @Override
    public void illuminate() {
        environment.illuminate();
        setColor(EnvironmentColor.PURPLE);
        setDescription(environment.getDescription() + ", Земля в виде сине-голубого месяца");
    }
}