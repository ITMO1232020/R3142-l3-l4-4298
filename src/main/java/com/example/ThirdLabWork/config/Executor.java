package com.example.ThirdLabWork.config;

import com.example.ThirdLabWork.viewer.Astronaut;

import java.util.List;

public class Executor {

    private List<Astronaut> astronautList;
    private Rocket rocket;
    private Space space = new Space(100);

    public Executor(List<Astronaut> astronautList) {
        this.astronautList = astronautList;
        this.rocket = new Rocket(astronautList);
    }

    public void execute() {
        System.out.println(space);
        System.out.println();
        for (Astronaut v: astronautList) {
            v.getEnvironment().illuminate();
            System.out.println(v);
        }
        System.out.println();
        System.out.println(rocket);
    }

    @Override
    public String toString() {
        return "Executor";
    }
}
