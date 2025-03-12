package MCR.Shape.Square;

import MCR.GameManager;
import MCR.Shape.Renderer.FilledRenderer;

import java.awt.*;

public class FilledSquare extends Square {

    public FilledSquare() {
        super();
    }

    @Override
    public void draw() {
        FilledRenderer.getInstance().display(GameManager.getInstance().getGraphics(), this);
    }

    @Override
    public Color getColor() {
        return Color.YELLOW;
    }
}
