import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Game extends JFrame {
    Board cgame;
    Game(){
        cgame = new Board();
        add(cgame);
        setSize(800,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int c = e.getKeyCode();
                if(c==KeyEvent.VK_RIGHT) {
                    cgame.car.x += 10;
                }else if(c==KeyEvent.VK_LEFT){
                    cgame.car.x-=10;
                }
                repaint();
            }
        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               new     Game();
            }
        });
    }


}
