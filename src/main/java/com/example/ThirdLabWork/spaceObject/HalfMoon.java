package com.example.ThirdLabWork.spaceObject;

import com.example.ThirdLabWork.surface.Surface;
import com.example.ThirdLabWork.surface.SurfaceColor;

public class HalfMoon extends BaseDecorator {

    public HalfMoon(Surface surface) {
        this.surface = surface;
        name = "Half Moon";
    }

    @Override
    public void illuminate() {
        surface.illuminate();
        surface.setColor(SurfaceColor.REFLECTED_LIGHT);
    }
}