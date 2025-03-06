package MCR.Shape.Square;

import MCR.GameManager;
import MCR.Shape.BaseShape;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class FilledSquare extends BaseShape {

    Rectangle2D rectangle;

    public FilledSquare() {
        super();
        rectangle = new Rectangle2D.Double(origin.x, origin.y, size, size);
    }

    @Override
    public void move() {
        super.move();
        rectangle.setFrame(origin.x, origin.y, size, size);
    }

    @Override
    public void draw() {
        GameManager.getInstance().display(GameManager.getInstance().getGraphics(), this);
    }

    @Override
    public Color getColor() {
        return Color.YELLOW;
    }

    @Override
    public Shape getShape() {
        return rectangle;
    }
}
