package MCR.Shape.Circle;

import MCR.GameManager;
import MCR.Shape.BaseShape;
import MCR.Shape.Renderer.*;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class FilledCircle extends Circle {

    public FilledCircle() {
        super();
    }

    @Override
    public void draw() {
        FilledRenderer.getInstance().display(GameManager.getInstance().getGraphics(), this);
    }

    @Override
    public Color getColor() {
        return Color.BLUE;
    }
}
