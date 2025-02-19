package MCR;
import javax.swing.*;
import java.awt.*;

public class GameManager extends JFrame
{
    public static final int GAME_WIDTH = 1024;
    public static final int GAME_HEIGHT = 512;

    private GameScene gameScene;

    public GameManager()
    {
        gameScene = new GameScene(GAME_WIDTH, GAME_HEIGHT);
        initialize();
        System.out.println("Game Manager Created");
    }

    private void initialize() {
        this.setTitle("Bouncer");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setFocusable(true);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setSize(GAME_WIDTH + 32, GAME_HEIGHT + 64);
        this.setPreferredSize(new Dimension(GAME_WIDTH + 32, GAME_HEIGHT + 64));
        this.pack(); //will size the frame to fit all element

        this.setLocationRelativeTo(null);
        this.setVisible(true);
        InitializePanel();
    }

    private void InitializePanel()
    {
        gameScene.setBounds(0, 0, GAME_WIDTH, GAME_HEIGHT);
        this.add(gameScene);
    }
}
