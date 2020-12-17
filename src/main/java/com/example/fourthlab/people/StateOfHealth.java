package com.example.fourthlab.people;

public enum  StateOfHealth {
    NORMAL("Космонавт чувствует себя хорошо"),
    TIRED("Космонавт устал"),
    VERY_BAD("Космонавту очень плохо и он хочет, чтобы его потаскали на ручках и рассказали сказку");

    private String description;

    StateOfHealth(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
