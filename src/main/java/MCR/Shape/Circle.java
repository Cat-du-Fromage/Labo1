package MCR.Shape;

import java.awt.*;

public class Circle extends Shape {

    public Circle() {
        super(Color.BLUE);
    }

    public void draw(Graphics2D g) {
        move();
        g.setColor(color);
        g.fillOval(origin.x, origin.y, size, size);
    }

}