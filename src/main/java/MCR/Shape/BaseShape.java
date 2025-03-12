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

        int velocityX = (int)(Math.random() * 8) + 2;
        int velocityY = (int)(Math.random() * 8) + 2;
        velocity = new Point(velocityX, velocityY);
    }

    public void move(){
        if(this.origin.x + velocity.x == GameManager.getInstance().getWidth() - size)
        {
            velocity.x = -velocity.x;
        }
        else if(this.origin.x + velocity.x > GameManager.getInstance().getWidth() - size)
        {
            this.origin.x = (int)(GameManager.getInstance().getWidth() - size * 2);
            velocity.x = -velocity.x;
        }
        else if(this.origin.x + velocity.x < 0){
            this.origin.x = 0;
            velocity.x = -velocity.x;
        }
        else
        {
            this.origin.x += velocity.x;
        }

        if(this.origin.y + velocity.y == GameManager.getInstance().getHeight() - this.size)
        {
            velocity.y = -velocity.y;
        }
        else if(this.origin.y + this.size + velocity.y > GameManager.getInstance().getHeight() - size){ //bas
            this.origin.y = GameManager.getInstance().getHeight() - size * 2;
            velocity.y = -velocity.y;
        }
        else if(this.origin.y + velocity.y < 0){ // haut
            this.origin.y = 0;
            velocity.y = -velocity.y;
        }
        else
        {
            this.origin.y += velocity.y;
        }

    }
}
