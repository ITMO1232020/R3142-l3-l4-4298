package com.example.ThirdLabWork.config;

public enum SkyMode {
    MoonDay("Наблюдатель стоит на луне. Светит солнце."),
    MoonNight("Наблюдатель стоит на луне. Ночь."),
    MoonEclipse("Наблюдатель стоит на луне. Затмение"),
    EarthDay("Наблюдатель стоит на земле. Светит солнце"),
    EarthNight("Наблдюдатель стоит на земле. Ночь."),
    EarthEclipse("Наблюдатель стоит на земле. Затмение");

    private String description;

    SkyMode(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}