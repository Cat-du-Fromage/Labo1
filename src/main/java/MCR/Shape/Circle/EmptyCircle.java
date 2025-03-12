package MCR.Shape.Circle;

import MCR.GameManager;
import MCR.Shape.Renderer.EmptyRenderer;

import java.awt.*;

public class EmptyCircle extends Circle {

    public EmptyCircle() {
        super();
    }

    @Override
    public void draw() {
        EmptyRenderer.getInstance().display(GameManager.getInstance().getGraphics(), this);
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
