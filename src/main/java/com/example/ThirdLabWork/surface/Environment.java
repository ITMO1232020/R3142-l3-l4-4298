package com.example.ThirdLabWork.surface;


public interface Environment {
    void illuminate();

    EnvironmentColor getColor();
    void setColor(EnvironmentColor color);

    String getDescription();
    void setDescription(String description);
}
