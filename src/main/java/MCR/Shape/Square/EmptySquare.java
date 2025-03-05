package MCR.Shape.Square;

import MCR.Shape.BaseShape;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class EmptySquare extends BaseShape {

    Rectangle2D.Double rect;

    public EmptySquare() {
    }

    @Override
    public void draw() {

    }

    @Override
    public Color getColor() {
        return Color.RED;
    }

    @Override
    public Shape getShape() {
        return rect;
    }
}
