package com.example.ThirdLabWork.spaceObject;

public class FullEarth extends BaseDecorator {

    public FullEarth(Environment surface) {
        this.environment = surface;
        name = "Full Earth";
    }

    @Override
    public void illuminate() {
        environment.illuminate();
        if(environment.getColor() == EnvironmentColor.BRIGHT) {
            setColor(EnvironmentColor.ECLIPSE_COLOR);
        } else {
            setColor(EnvironmentColor.REFLECTED_LIGHT);
        }

        setDescription(environment.getDescription() + ", полная сине-голубая Земля. " + EnvironmentColor.DIRECT_LIGHT + "\n"
                + "Поверхность луны покрыта цветами:" + EnvironmentColor.LUMINOUS + "\n"
                + EnvironmentColor.LIGHT_CHERRY + "\n"
                + EnvironmentColor.REDDISH);
    }
}
