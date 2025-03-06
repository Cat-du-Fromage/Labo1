package MCR;

import MCR.Shape.Bounceable;
import MCR.Shape.Circle.*;
import MCR.Shape.BaseShape;
import MCR.Shape.EmptyShapeFactory;
import MCR.Shape.FilledShapeFactory;
import MCR.Shape.Square.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;

public class BouncersApp implements ActionListener {

    private final int DELAY = 25;
    private Timer timer;

    private final LinkedList<Bounceable> bouncers = new LinkedList<>();

    private GameManager gameManager;

    public BouncersApp() {
        gameManager = GameManager.getInstance();
        gameManager.addKeyListener(new CustomKeyAdapter());
        timer = new Timer(DELAY, this);
        /*
        for (int i = 0; i < 50; i++)
        {
            bouncers.add(i % 2 == 0 ? new Circle() : new Square());
        }
        */
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
        for (Bounceable bounceable : bouncers) {
            bounceable.move();
            bounceable.draw();
        }
    }

    private class CustomKeyAdapter extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_E) {
                bouncers.clear();
            }
            if (e.getKeyCode() == KeyEvent.VK_F) {
                FilledShapeFactory filledShapeFactory = new FilledShapeFactory();
                bouncers.addAll(filledShapeFactory.createSquares());
                bouncers.addAll(filledShapeFactory.createCircles());
            }
            if (e.getKeyCode() == KeyEvent.VK_B) {
                EmptyShapeFactory emptyShapeFactory = new EmptyShapeFactory();
                bouncers.addAll(emptyShapeFactory.createSquares());
                bouncers.addAll(emptyShapeFactory.createCircles());
            }
            if (e.getKeyCode() == KeyEvent.VK_Q) {
                System.exit(0);
            }
        }
    }
}