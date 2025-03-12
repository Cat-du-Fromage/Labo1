package MCR.Shape.Renderer;

import MCR.Renderer;
import MCR.Shape.Bounceable;

import java.awt.*;

public class FilledRenderer implements Renderer {

    private static FilledRenderer instance;

    private FilledRenderer() {}

    public static Renderer getInstance() {
        if (instance == null) {
            instance = new FilledRenderer();
        }
        return instance;
    }

    public void display(Graphics2D g, Bounceable b) {
        g.setColor(b.getColor());
        g.fill(b.getShape());
    }
}
