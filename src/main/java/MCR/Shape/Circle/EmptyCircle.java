package MCR.Shape.Circle;

import MCR.GameManager;
import MCR.Shape.BaseShape;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class EmptyCircle extends BaseShape {

    private Ellipse2D circle;

    public EmptyCircle() {
        super();
        circle = new Ellipse2D.Double(origin.x, origin.y, size, size);
    }

    @Override
    public void move() {
        super.move();
        circle.setFrame(origin.x, origin.y, size, size);
    }

    @Override
    public void draw() {
        GameManager.getInstance().display(GameManager.getInstance().getGraphics(), this);
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }

    @Override
    public Shape getShape() {
        return circle;
    }
}
