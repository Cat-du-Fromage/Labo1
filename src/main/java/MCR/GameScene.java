package MCR;
import MCR.Shape.Circle;
import MCR.Shape.Square;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.*;

public class GameScene extends JPanel implements ActionListener
{
    public LinkedList<MCR.Shape.Shape> shapes = new LinkedList<>();
    private final int DELAY = 25;
    private Timer timer;

    public GameScene(int width, int height)
    {
        this.setFocusable(true);
        this.setSize(width, height);
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.GREEN);
        this.setVisible(true);
        generateShapes();
        timer = new Timer(DELAY, this);
        timer.start();
        System.out.println("GameScene Created");
    }

    //update visuals
    public void draw(Graphics2D g)
    {
        for (MCR.Shape.Shape shape : shapes)
        {
            shape.draw(g);
        }
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        draw((Graphics2D)g);
    }

    public void generateShapes()
    {
        for (int i = 0; i < 50; i++)
        {
            shapes.add(i % 2 == 0 ? new Circle() : new Square());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (MCR.Shape.Shape shape : shapes)
        {
            shape.move();
        }
        repaint();
    }
}
