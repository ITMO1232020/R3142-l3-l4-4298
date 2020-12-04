package com.example.ThirdLabWork.spaceObject;

import com.example.ThirdLabWork.surface.Environment;

public class Mountain extends BaseDecorator {
    public Mountain(Environment surface) {
        this.environment = surface;
        name = "Mountain";
    }

    @Override
    public void illuminate() {
        environment.illuminate();
        setDescription(environment.getDescription() + ", горы красноватого цвета");
    }
}
