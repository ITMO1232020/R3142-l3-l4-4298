package com.example.ThirdLabWork.spaceObject;

import com.example.ThirdLabWork.surface.Environment;
import com.example.ThirdLabWork.surface.EnvironmentColor;

public class HalfMoon extends BaseDecorator {

    public HalfMoon(Environment surface) {
        this.environment = surface;
        name = "Half Moon";
    }

    @Override
    public void illuminate() {
        environment.illuminate();
        setColor(EnvironmentColor.REFLECTED_LIGHT);
        setDescription(environment.getDescription() + ", белая Луна в виде месяца");
    }
}