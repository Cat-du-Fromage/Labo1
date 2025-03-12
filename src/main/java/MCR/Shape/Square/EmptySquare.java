package MCR.Shape.Square;

import MCR.GameManager;
import MCR.Shape.Renderer.EmptyRenderer;

import java.awt.*;

public class EmptySquare extends Square {

    public EmptySquare() {
        super();
    }

    @Override
    public void draw() {
        EmptyRenderer.getInstance().display(GameManager.getInstance().getGraphics(), this);
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
}
