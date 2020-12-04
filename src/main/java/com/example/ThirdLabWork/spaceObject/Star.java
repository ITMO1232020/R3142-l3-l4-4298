package com.example.ThirdLabWork.spaceObject;

import com.example.ThirdLabWork.surface.Environment;

public class Star extends BaseDecorator {
    public Star(Environment surface) {
        this.environment = surface;
        name = "Star";
    }

    @Override
    public void illuminate() {
        environment.illuminate();
        setDescription(environment.getDescription() + ", сияющие звезды вдалеке");
    }
}
