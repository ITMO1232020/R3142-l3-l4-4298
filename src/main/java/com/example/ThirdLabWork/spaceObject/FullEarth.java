package com.example.ThirdLabWork.spaceObject;

import com.example.ThirdLabWork.surface.Surface;
import com.example.ThirdLabWork.surface.SurfaceColor;

public class FullEarth extends BaseDecorator {

    public FullEarth(Surface surface) {
        this.surface = surface;
        name = "Full Earth";
    }

    @Override
    public void illuminate() {
        surface.illuminate();
        if(getColor() == SurfaceColor.LIGHT) {
            surface.setColor(SurfaceColor.ECLIPSE_COLOR);
        } else {
            surface.setColor(SurfaceColor.REFLECTED_LIGHT);
        }
    }
}
