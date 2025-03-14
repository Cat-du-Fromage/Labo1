package MCR.Shape.Circle;

import MCR.GameManager;
import MCR.Shape.BaseShape;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public abstract class Circle extends BaseShape {

    protected Ellipse2D circle;

    protected Circle() {
        super();
        circle = new Ellipse2D.Double(origin.x, origin.y, size, size);
    }

    @Override
    public void move() {
        super.move();
        circle.setFrame(origin.x, origin.y, size, size);
    }

    @Override
    public Shape getShape() {
        return circle;
    }
}

