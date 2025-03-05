package MCR.Shape;

import MCR.GameManager;

import java.awt.*;

public abstract class BaseShape implements Bounceable {
    protected int size;
    protected Point origin;
    protected Point velocity;

    protected BaseShape() {
        size = (int)(Math.random() * 32) + 16;

        int posX = (int)(Math.random() * GameManager.getInstance().getWidth() - (size + 1)) + size;
        int posY = (int)(Math.random() * GameManager.getInstance().getHeight() - (size + 1)) + size;
        origin = new Point(posX, posY);

        int velocityX = (int)(Math.random() * 8) + 2;
        int velocityY = (int)(Math.random() * 8) + 2;
        velocity = new Point(velocityX, velocityY);
    }

    //public abstract void draw(Graphics2D g);

    public void move(){
        if(origin.x + velocity.x > GameManager.getInstance().getWidth() - size)
        {
            this.origin.x = GameManager.getInstance().getWidth() - size;
            velocity.x = -velocity.x;
        }
        else if(origin.x + velocity.x < 0){
            this.origin.x = 0;
            velocity.x = -velocity.x;
        }
        else
        {
            this.origin.x += velocity.x;
        }
        if(origin.y + velocity.y > GameManager.getInstance().getHeight() - size){
            this.origin.y = GameManager.getInstance().getHeight() - size;
            velocity.y = -velocity.y;
        }
        else if(origin.y + velocity.y < 0){
            this.origin.y = 0;
            velocity.y = -velocity.y;
        }
        else
        {
            this.origin.y += velocity.y;
        }

    }
}
