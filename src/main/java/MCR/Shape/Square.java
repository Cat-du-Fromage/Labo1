package MCR.Shape;

import java.awt.*;

public class Square extends Shape{
    public Square() {
        super(Color.YELLOW);
    }

    public void draw(Graphics2D g) {
        move();
        g.setColor(this.color);
        g.fillRect(this.origin.x, this.origin.y, this.size, this.size);
    }
}
