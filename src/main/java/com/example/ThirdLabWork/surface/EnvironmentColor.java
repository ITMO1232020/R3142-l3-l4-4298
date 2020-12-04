package com.example.ThirdLabWork.surface;

public enum EnvironmentColor {
    LIGHT("Поверхность освещена солнцем"),
    DARK("Поверхность не освещена ничем"),
    PURPLE("Поверхность сверкает багрянцем"),
    ECLIPSE_COLOR("Поверхность покрыта тенью луны"),
    MOON_ECLIPSE_COLOR("Поверхность покрыта тенью от земли"),
    REFLECTED_LIGHT("Отраженный свет еле освещает поверхность"),
    SPACE_LIGHT("вокруг виднеются красочные планеты");

    private String description;

    EnvironmentColor(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
