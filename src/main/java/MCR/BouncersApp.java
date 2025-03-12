package MCR;

import MCR.Shape.Bounceable;
import MCR.Shape.EmptyShapeFactory;
import MCR.Shape.FilledShapeFactory;

import javax.swing.*;
import java.awt.event.*;
import java.util.LinkedList;

public class BouncersApp implements ActionListener {

    private final int DELAY = 25;
    private final Timer timer;

    private final LinkedList<Bounceable> bouncers = new LinkedList<>();

    private final FilledShapeFactory filledShapeFactory = new FilledShapeFactory();
    private final EmptyShapeFactory emptyShapeFactory = new EmptyShapeFactory();

    private final GameManager gameManager;

    public BouncersApp() {
        gameManager = GameManager.getInstance();
        gameManager.addKeyListener(new CustomKeyAdapter());
        timer = new Timer(DELAY, this);
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
        //System.out.println(gameManager.getFrame().getWidth());
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
                bouncers.addAll(filledShapeFactory.createSquares());
                bouncers.addAll(filledShapeFactory.createCircles());
            }
            if (e.getKeyCode() == KeyEvent.VK_B) {
                bouncers.addAll(emptyShapeFactory.createSquares());
                bouncers.addAll(emptyShapeFactory.createCircles());
            }
            if (e.getKeyCode() == KeyEvent.VK_Q) {
                System.exit(0);
            }
        }
    }
}