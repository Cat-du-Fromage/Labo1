package MCR.Shape.Circle;

import MCR.GameManager;
import MCR.Shape.BaseShape;

import java.awt.*;

public class EmptyCircle extends BaseShape {

    public EmptyCircle() {
    }

    @Override
    public void draw() {
        //GameManager.getInstance().display();

    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }

    @Override
    public Shape getShape() {
        return null;
    }
}
