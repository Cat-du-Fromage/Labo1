package MCR.Shape.Square;

import MCR.GameManager;
import MCR.Shape.BaseShape;
import MCR.Shape.Renderer.BorderedRenderer;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class EmptySquare extends Square {

    public EmptySquare() {
        super();
    }

    @Override
    public void draw() {
        BorderedRenderer.getInstance().display(GameManager.getInstance().getGraphics(), this);
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
}
