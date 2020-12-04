package com.example.ThirdLabWork.spaceObject;

import com.example.ThirdLabWork.surface.Environment;
import com.example.ThirdLabWork.surface.EnvironmentColor;

public class FullEarth extends BaseDecorator {

    public FullEarth(Environment surface) {
        this.environment = surface;
        name = "Full Earth";
    }

    @Override
    public void illuminate() {
        environment.illuminate();
        if(getColor() == EnvironmentColor.LIGHT) {
            setColor(EnvironmentColor.ECLIPSE_COLOR);
        } else {
            setColor(EnvironmentColor.REFLECTED_LIGHT);
        }
        setDescription(environment.getDescription() + ", полная сине-голубая Земля");
    }
}
