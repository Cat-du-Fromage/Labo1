package MCR.Shape.Circle;

import MCR.GameManager;
import MCR.Shape.BaseShape;
import MCR.Shape.Renderer.BorderedRenderer;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class EmptyCircle extends Circle {

    public EmptyCircle() {
        super();
    }

    @Override
    public void draw() {
        BorderedRenderer.getInstance().display(GameManager.getInstance().getGraphics(), this);
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
