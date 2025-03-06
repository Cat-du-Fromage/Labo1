package MCR.Shape.Square;

import MCR.Shape.BaseShape;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public abstract class Square extends BaseShape {

    protected Rectangle2D rectangle;

    protected Square() {
        super();
        rectangle = new Rectangle2D.Double(origin.x, origin.y, size, size);
    }

    @Override
    public void move() {
        super.move();
        rectangle.setFrame(origin.x, origin.y, size, size);
    }

    @Override
    public Shape getShape() {
        return rectangle;
    }
}

