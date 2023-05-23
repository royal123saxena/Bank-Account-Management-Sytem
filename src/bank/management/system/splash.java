package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class splash extends JFrame {

    splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icon/Splash.jpg"));
        Image imageone = imageIcon.getImage().getScaledInstance(600,400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(imageone);
        JLabel imageLabel = new JLabel(imageIcon2);
        add(imageLabel);

        setSize(600,400);
        setLocation(500,200);
        setVisible(true);

        try {
            Thread.sleep(3000);
            setVisible(false);

            new LOGIN();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        new splash();
    }
}
