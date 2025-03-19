package MCR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;

public class GameManager implements Displayer {
    private final int GAME_WIDTH = 1024;
    private final int GAME_HEIGHT = 512;
    private static GameManager instance;

    private final JFrame frame;
    private final JPanel panel;

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    private GameManager() {
        frame = new JFrame();
        panel = new JPanel();
        initFrame();
        initPanel();
        frame.add(panel);
        System.out.println("Game Manager Created");
    }

    private void initFrame() {
        frame.setTitle("Bouncer");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setFocusable(true);
        frame.setLayout(new BorderLayout());
        frame.setSize(GAME_WIDTH, GAME_HEIGHT);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void initPanel() {
        panel.setFocusable(true);
        panel.setSize(GAME_WIDTH, GAME_HEIGHT);
        panel.setVisible(true);
        System.out.println("GameScene Created");

        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                panel.setSize(frame.getWidth(), frame.getHeight());
                //System.out.println("Nouvelle taille du panel : " + panel.getWidth() + "x" + panel.getHeight());
            }
        });
    }

    public JFrame getFrame() {
        return frame;
    }

    private void clear() {
        panel.getGraphics().clearRect(0, 0, panel.getWidth(), panel.getHeight());
    }

    @Override
    public int getWidth() {
        return panel.getWidth();
    }

    @Override
    public int getHeight() {
        return panel.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) panel.getGraphics();
    }

    @Override
    public void repaint() {
        clear();
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {
        frame.addKeyListener(ka);
    }
}
