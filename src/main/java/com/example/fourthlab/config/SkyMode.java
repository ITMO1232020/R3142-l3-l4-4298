package com.example.fourthlab.config;

import com.example.fourthlab.environment.AirCondition;

public enum SkyMode {
    MoonDay(
            "Космонавт стоит на луне. Поверхность покрыта трещинками. Светит солнце.",
            AirCondition.FULL_OF_SPACE_RAYS),
    MoonNightObliqueLight(
            "Космонавт стоит на луне. Поверхность покрыта трещинками. Ночь.",
            AirCondition.THIN_AIR),
    MoonNightDirectLight(
            "Космонавт стоит на луне. Поверхность покрыта трещинками. Ночь.",
            AirCondition.THIN_AIR),
    MoonEclipse(
            "Космонавт стоит на луне. Поверхность покрыта трещинками. Затмение",
            AirCondition.FULL_OF_SPACE_RAYS),
    Space(
            "Космонавт находится в открытом космосе",
            AirCondition.FULL_OF_SPACE_RAYS);

    private String description;
    private AirCondition airCondition;

    SkyMode(String description, AirCondition airCondition) {
        this.description = description;
        this.airCondition = airCondition;
    }

    @Override
    public String toString() {
        return description + "\n" + airCondition;
    }
}