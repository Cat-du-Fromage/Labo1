package MCR.Shape;

import MCR.GameManager;

import java.awt.*;

public abstract class Shape {
    protected int size;
    protected Color color;
    protected Point origin;
    protected Point velocity;

    protected Shape(Color c) {
        this.color = c;

        size = (int)(Math.random() * 32) + 16;

        int posX = (int)(Math.random() * GameManager.GAME_WIDTH - (size + 1)) + size;
        int posY = (int)(Math.random() * GameManager.GAME_HEIGHT - (size + 1)) + size;
        origin = new Point(posX, posY);

        int velocityX = (int)(Math.random() * 8) + 2;
        int velocityY = (int)(Math.random() * 8) + 2;
        velocity = new Point(velocityX, velocityY);
    }

    public abstract void draw(Graphics2D g);
    public void move(){
        if(origin.x + velocity.x > GameManager.GAME_WIDTH - size)
        {
            this.origin.x = GameManager.GAME_WIDTH - size;
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
        if(origin.y + velocity.y > GameManager.GAME_HEIGHT - size){
            this.origin.y = GameManager.GAME_HEIGHT - size;
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
