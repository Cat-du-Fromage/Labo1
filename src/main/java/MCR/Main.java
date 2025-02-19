package MCR;

import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        GameManager gm = new GameManager();
        gm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}