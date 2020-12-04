package com.example.ThirdLabWork.config;

public enum SkyMode {
    MoonDay("Знайка стоит на луне. Поверхность покрыта трещинками. Светит солнце."),
    MoonNight("Знайка стоит на луне. Поверхность покрыта трещинками. Ночь."),
    MoonEclipse("Знайка стоит на луне. Поверхность покрыта трещинками. Затмение"),
    Space("Группа находится в открытом космосе");

    private String description;

    SkyMode(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}