package MCR.Shape;

import MCR.GameManager;

import java.awt.*;

public abstract class BaseShape implements Bounceable {
    protected int size;
    protected Point origin;
    protected Point velocity;

    protected BaseShape() {
        size = ((int)(Math.random() * 16) + 8) * 2;
        int posX = (int)(Math.random() * GameManager.getInstance().getWidth() - (size)) + size * 2;
        int posY = (int)(Math.random() * GameManager.getInstance().getHeight() - (size)) + size * 2;
        origin = new Point(posX, posY);

        int velocityX = ((int)(Math.random() * 4) + 1) * 2;
        int velocityY = ((int)(Math.random() * 4) + 1) * 2;
        velocity = new Point(velocityX, velocityY);
    }

    public void move() {
        int vx = velocity.x;
        int vy = velocity.y;

        int x =  Math.max(0, Math.min(origin.x, GameManager.getInstance().getWidth() - size));
        int y =  Math.max(0, Math.min(origin.y, GameManager.getInstance().getHeight() - size));

        if (x + vx < 0 && vx < 0) {
            vx *= -1;
        }
        else if( x + size + vx > GameManager.getInstance().getWidth() - 4 && vx > 0) {
            vx *= -1;
        }

        if (y + vy < 0 && vy < 0 ) {
            vy *= -1;
        }
        else if(y + size + vy > GameManager.getInstance().getHeight() - 32 && vy > 0) {
            vy *= -1;
        }

        x += vx;
        y += vy;

        velocity = new Point(vx, vy);
        origin = new Point(x, y);
    }
}
