package MCR;

import MCR.Shape.Circle;
import MCR.Shape.Shape;
import MCR.Shape.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

public class BouncersApp implements ActionListener {

    private final int DELAY = 25;
    private Timer timer;

    private final LinkedList<Shape> bouncers = new LinkedList<>();

    private GameManager gameManager;

    public BouncersApp() {
        gameManager = GameManager.getInstance();
        timer = new Timer(DELAY, this);
        for (int i = 0; i < 50; i++)
        {
            bouncers.add(i % 2 == 0 ? new Circle() : new Square());
        }
    }

    public void run() {
        timer.start();
        gameManager.getFrame().addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new BouncersApp().run();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        gameManager.repaint();
        for (Shape shape : bouncers)
        {
            shape.draw(gameManager.getGraphics());
        }
    }
}