package com.example.ThirdLabWork.spaceObject;
import com.example.ThirdLabWork.surface.Environment;
import com.example.ThirdLabWork.surface.EnvironmentColor;

public class Sun extends BaseDecorator {

    public Sun(Environment surface) {
        this.environment = surface;
        name = "Sun";
    }

    @Override
    public void illuminate() {
        environment.illuminate();
        setColor(EnvironmentColor.LIGHT);
        setDescription(environment.getDescription() + ", ярко-желтое Солнце");
    }
}
