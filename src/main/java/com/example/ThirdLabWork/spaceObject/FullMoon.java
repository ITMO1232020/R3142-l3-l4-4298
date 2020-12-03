package com.example.ThirdLabWork.spaceObject;

import com.example.ThirdLabWork.surface.Surface;
import com.example.ThirdLabWork.surface.SurfaceColor;

public class FullMoon extends BaseDecorator {


    public FullMoon(Surface surface) {
        this.surface = surface;
        name = "Full Moon";
    }

    @Override
    public void illuminate() {
        surface.illuminate();
        if(getColor() == SurfaceColor.LIGHT) {
            surface.setColor(SurfaceColor.MOON_ECLIPSE_COLOR);
        } else {
            surface.setColor(SurfaceColor.REFLECTED_LIGHT);
        }
    }
}
