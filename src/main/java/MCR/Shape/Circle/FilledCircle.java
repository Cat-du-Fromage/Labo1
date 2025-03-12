package MCR.Shape.Circle;

import MCR.GameManager;
import MCR.Shape.Renderer.FilledRenderer;

import java.awt.*;

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
