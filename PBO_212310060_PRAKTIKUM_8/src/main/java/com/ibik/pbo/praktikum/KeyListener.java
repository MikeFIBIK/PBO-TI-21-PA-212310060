package com.ibik.pbo.praktikum;
import java.awt.Image;
import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListener extends JFrame implements KeyListener {
    private JLabel label;
    private int x = 110;
    private int y = 150;
    private int speed = 5;

    public KeyListener() {
        setTitle("Contoh Key Listener");
        setResizable(false);
        setSize(565, 438);
//        setBounds(100, 100, 656, 630);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        
        // Load image as icon
//        ImageIcon icon = new ImageIcon("/rocket.png");

        label = new JLabel("");
        Image icon = new ImageIcon (this.getClass().getResource("/rocketright.png")).getImage();
        label.setIcon(new ImageIcon (icon));
        label.setBounds(x, y, 150, 110);
        getContentPane().add(label);

        addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        // Move left
        if (keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT) {
            x -= speed;
        }
        // Move right
        else if (keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT) {
            x += speed;
        }
        // Move up
        else if (keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP) {
            y -= speed;
        }
        // Move down
        else if (keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN) {
            y += speed;
        }

        // Check if object is at the edge of the frame
        if (x < 0) {
            // Change object to another image
        	Image icon = new ImageIcon (this.getClass().getResource("/rocketright.png")).getImage();
        	label.setIcon(new ImageIcon (icon));
            x = 0;
        } else if (x > 405) {
            // Change object to another image
        	Image icon = new ImageIcon (this.getClass().getResource("/rocketleft.png")).getImage();
        	label.setIcon(new ImageIcon (icon));
            x = 405;
        } else if (y < 0 || y > 290) {
            // Change object to another image
            y = label.getY();
        }
        

        // Update label position
        label.setBounds(x, y, label.getWidth(), label.getHeight());
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        KeyListener frame = new KeyListener();
        frame.setVisible(true);
    }
}