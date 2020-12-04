package com.example.ThirdLabWork.config;

import com.example.ThirdLabWork.viewer.Astronaut;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rocket {
    private List<Astronaut> astronauts;

    public Rocket(List<Astronaut> astronauts) {
        this.astronauts = astronauts;
    }

    @Override
    public String toString() {
        List<String> astronauts = new ArrayList<>();
        for (Astronaut v: this.astronauts) {
            if(v.getSkyMode() == SkyMode.Space) {
                astronauts.add(v.getName());
            }
        }
        return "Вдали также виднеется ярко-голубая ракета.\nВ ракете находятся: " +
                astronauts.toString().substring(1, astronauts.toString().length() -1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rocket rocket = (Rocket) o;
        return astronauts.equals(rocket.astronauts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(astronauts);
    }
}
