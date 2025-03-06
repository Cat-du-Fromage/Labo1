package MCR.Shape.Renderer;

import MCR.Renderer;
import MCR.Shape.Bounceable;

import java.awt.*;

public class BorderedRenderer implements Renderer {

    private static BorderedRenderer instance;

    public BorderedRenderer() {}

    public static Renderer getInstance() {
        if (instance == null) {
            instance = new BorderedRenderer();
        }
        return instance;
    }

    public void display(Graphics2D g, Bounceable b){
        g.setColor(b.getColor());
        g.setStroke(new BasicStroke(2)); // Bordure de 2 pixels
        g.draw(b.getShape());
    }
}
