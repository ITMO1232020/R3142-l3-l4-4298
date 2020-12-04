package com.example.ThirdLabWork.spaceObject;

import com.example.ThirdLabWork.surface.Environment;
import com.example.ThirdLabWork.surface.EnvironmentColor;

public class FullMoon extends BaseDecorator {


    public FullMoon(Environment surface) {
        this.environment = surface;
        name = "Full Moon";
    }

    @Override
    public void illuminate() {
        environment.illuminate();
        if(getColor() == EnvironmentColor.LIGHT) {
            setColor(EnvironmentColor.MOON_ECLIPSE_COLOR);
        } else {
            setColor(EnvironmentColor.REFLECTED_LIGHT);
        }
        setDescription(environment.getDescription() + ", полная блестящая Луна");
    }
}
