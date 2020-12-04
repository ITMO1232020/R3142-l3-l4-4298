package com.example.ThirdLabWork.viewer;

import com.example.ThirdLabWork.config.SkyMode;
import com.example.ThirdLabWork.config.SurfaceBuilder;
import com.example.ThirdLabWork.spaceObject.Environment;

import java.util.Objects;


public class Astronaut {
    private SkyMode skyMode;
    private Environment environment;
    private String name;

    public Astronaut(String name, SkyMode skyMode) {
        this.name = name;
        this.skyMode = skyMode;
        environment = SurfaceBuilder.getDefaultSet(skyMode).build();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public SkyMode getSkyMode() {
        return skyMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Astronaut astronaut = (Astronaut) o;
        return skyMode == astronaut.skyMode &&
                environment.equals(astronaut.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skyMode, environment);
    }

    @Override
    public String toString() {
        String addedResult =
                skyMode != SkyMode.Space
                        ? "Вблизи также виднеется глубокая пещера, из которой только что вышли спутники"
                        : "";
        return skyMode.toString() + "\n" +
                environment.getColor() + "\n" +
                environment.getDescription().replaceFirst(",", ":") + "\n" + addedResult + "\n";
    }
}
