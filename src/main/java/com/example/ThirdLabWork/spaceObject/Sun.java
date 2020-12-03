package com.example.ThirdLabWork.spaceObject;
import com.example.ThirdLabWork.surface.Surface;
import com.example.ThirdLabWork.surface.SurfaceColor;

public class Sun extends BaseDecorator {

    public Sun(Surface surface) {
        this.surface = surface;
        name = "Sun";
    }

    @Override
    public void illuminate() {
        surface.illuminate();
        surface.setColor(SurfaceColor.LIGHT);
    }
}
