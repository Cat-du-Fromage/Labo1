package MCR;

import javax.swing.*;
import java.awt.*;

public class GameManager implements Displayer {
    private final int GAME_WIDTH = 1024;
    private final int GAME_HEIGHT = 512;
    private static GameManager instance;

    private final JFrame frame;
    private JPanel panel;

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
        frame.setResizable(false);
        frame.setFocusable(true);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setSize(GAME_WIDTH, GAME_HEIGHT + 48);
        frame.setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT + 48));
        frame.pack(); //will size the frame to fit all element

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void initPanel() {
        panel.setFocusable(true);
        panel.setSize(GAME_WIDTH, GAME_HEIGHT);
        panel.setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT));
        panel.setVisible(true);
        panel.setBounds(0, 0, GAME_WIDTH, GAME_HEIGHT);
        System.out.println("GameScene Created");
    }

    public JFrame getFrame() {
        return frame;
    }

    @Override
    public int getWidth() {
        return GAME_WIDTH;
    }

    @Override
    public int getHeight() {
        return GAME_HEIGHT;
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) panel.getGraphics();
    }

    @Override
    public void repaint() {
        clear();
    }

    public void clear() {
        panel.getGraphics().clearRect(0, 0, GAME_WIDTH, GAME_HEIGHT);
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }
}
