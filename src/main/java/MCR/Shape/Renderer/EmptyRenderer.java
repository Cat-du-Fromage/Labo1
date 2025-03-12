package MCR.Shape.Renderer;

import MCR.Renderer;
import MCR.Shape.Bounceable;

import java.awt.*;

public class EmptyRenderer implements Renderer {

    private static EmptyRenderer instance;

    private EmptyRenderer() {}

    public static Renderer getInstance() {
        if (instance == null) {
            instance = new EmptyRenderer();
        }
        return instance;
    }

    public void display(Graphics2D g, Bounceable b){
        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(2)); // Bordure de 2 pixels
        g.draw(b.getShape());
    }
}
