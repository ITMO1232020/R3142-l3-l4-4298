package com.example.ThirdLabWork.spaceObject;

import com.example.ThirdLabWork.surface.Surface;
import com.example.ThirdLabWork.surface.SurfaceColor;

import java.util.Objects;

public abstract class BaseDecorator implements Surface {

    protected String name;
    protected Surface surface;


    @Override
    public void illuminate() {
        // do nothing
    }

    @Override
    public SurfaceColor getColor() {
        return surface.getColor();
    }

    @Override
    public void setColor(SurfaceColor color) {
        surface.setColor(color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseDecorator that = (BaseDecorator) o;
        return name.equals(that.name) &&
                surface.equals(that.surface);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surface);
    }

    @Override
    public String toString() {
        return name + ": " + surface.getColor();
    }
}
